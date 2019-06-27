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
		String message="��¼�ɹ�";
		employee=employeeService.getEmployeeByUsername(username);
		
		if(employee!=null){
			if(!password.equals(employee.getPassword())){
				message= "��¼ʧ�ܣ��������";
				System.out.println("2222");
			}else{
				ActionContext.getContext().getSession().put("loginUser", employee);
				ActionContext.getContext().put("message", message);
				return "message";
			}
		}else{
			message= "��¼ʧ�ܣ��û������ڣ�";
		}
		ActionContext.getContext().put("message", message);
		return "input";
	}

	/*public void validateLg() {
		if (this.username == null || "".equals(this.username.trim())) {
			this.addFieldError("this.username", "�ʺŲ�Ϊ��");
		}
		if (this.password == null || "".equals(this.password.trim())) {

			this.addFieldError("this.password", "���벻Ϊ��");
		}else{
		if (!"".equals(this.username) && !"".equals(this.password)) {
			Employee em  = new Employee();
			em.setUsername(this.username);
			em = employeeService.getEmployeeByUsername(this.username);
			
			if (!em.getPassword().equals(this.password)) {
				this.addFieldError("password", "�������");
			}else {
				this.addFieldError("username", "�û���������");
				}
			}
		}
	}*/
}