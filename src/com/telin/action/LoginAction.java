package com.telin.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.telin.bean.Employee;
import com.telin.service.EmployeeService;

@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport {

	@Resource
	EmployeeService employeeService;
	private Employee employee;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String lg() {
		String message="登录成功";
		employee=employeeService.getEmployeeByUsername(username);
		
		if(employee!=null){
			if(!password.equals(employee.getPassword())){
				message= "登录失败：密码错误！";
				System.out.println("2222");
			}else{
				ActionContext.getContext().getSession().put("loginUser", employee);
				ActionContext.getContext().put("message", message);
				return "message";
			}
		}else{
			message= "登录失败：用户不存在！";
		}
		ActionContext.getContext().put("message", message);
		return "input";
	}

	/*public void validateLg() {
		if (this.username == null || "".equals(this.username.trim())) {
			this.addFieldError("this.username", "帐号不为空");
		}
		if (this.password == null || "".equals(this.password.trim())) {

			this.addFieldError("this.password", "密码不为空");
		}else{
		if (!"".equals(this.username) && !"".equals(this.password)) {
			Employee em  = new Employee();
			em.setUsername(this.username);
			em = employeeService.getEmployeeByUsername(this.username);
			
			if (!em.getPassword().equals(this.password)) {
				this.addFieldError("password", "密码错误");
			}else {
				this.addFieldError("username", "用户名不存在");
				}
			}
		}
	}*/
}