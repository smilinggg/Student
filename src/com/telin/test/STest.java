
package com.telin.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telin.bean.Employee;
import com.telin.bean.Gender;
import com.telin.service.EmployeeService;

public class STest {
private static EmployeeService employeeService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
			employeeService=(EmployeeService)ctx.getBean("employeeServiceBean");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void save() {
		for (int i = 0; i <5; i++) {
			employeeService.save(new Employee("Ð¡"+i,"123456"+i));
		}
	}
	@Test
	public void delete() {
		Employee em=employeeService.find(2);
		employeeService.delete(em);
	}
	@Test
	public void update() {
		Employee em=employeeService.find(1);
		em.setUsername("Íõ¶þ");
		em.setGender(Gender.woman);
		em.setPassword("12344");
		employeeService.update(em);
	}
	@Test
	public void find() {
		Employee em=employeeService.find(2);
		System.out.print(em.getUsername()+","+em.getPassword()+","+em.getGender());
	}
	@Test
	public void list() {
		List<Employee> ems=employeeService.list();
		for(Employee em:ems)
		System.out.println(em.getUsername()+","+em.getPassword()+","+em.getGender());
	}
}
