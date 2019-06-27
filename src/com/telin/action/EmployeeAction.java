package com.telin.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.telin.bean.Employee;
import com.telin.service.EmployeeService;
@Controller // employeeAction
public class EmployeeAction {
    @Resource EmployeeService employeeService;
    
	public String execute(){
		ActionContext.getContext().put("employees", employeeService.list());
		return "list";
	}
	public String del(){
		List<Employee> emps=employeeService.list();
		for (Employee e : emps) {
			employeeService.delete(e);
		}
		return "list";
	}
}