package com.telin.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.telin.bean.Employee;
import com.telin.service.EmployeeService;

@Controller
@Scope("prototype")
public class EmployeeManageAction {
	@Resource
	EmployeeService employeeService;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String addUI() {
		return "add";
	}

	public String add() throws InterruptedException {
		employeeService.save(employee);
		System.out.print("sleeping");
		Thread.sleep(10000);
		ActionContext.getContext().put("message", "添加成功");
		return "message";
	}

	public String deleteUI() {
		this.employee = employeeService.getEmployeeById(employee.getId());
		return "delete";
	}

	public String delete() {
		employeeService.delete(employee);
		ActionContext.getContext().put("message", "删除成功");
		return "message";
	}

	public String updateUI() {
		this.employee = employeeService.getEmployeeById(employee.getId());
		return "update";
	}

	public String update() {
		employeeService.update(employee);
		ActionContext.getContext().put("message", "更新成功");
		return "message";
	}
}