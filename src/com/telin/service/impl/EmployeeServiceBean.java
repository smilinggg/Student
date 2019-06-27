package com.telin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.telin.bean.Employee;
import com.telin.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceBean implements EmployeeService {

	@Resource
	SessionFactory factory; // session对象

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public Employee find(Integer id) {
		return (Employee) factory.getCurrentSession().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Employee> list() {
		String sql="select * from employee";
		return factory.getCurrentSession().createSQLQuery(sql).addEntity(Employee.class).list();
	}

	public void save(Employee employee) {
		factory.getCurrentSession().persist(employee); // 得到session
	}

	public void update(Employee employee) {
		factory.getCurrentSession().update(employee);
	}

	public void delete(Employee employee) {
		factory.getCurrentSession().delete(employee);
	}


	public void deletes(Employee employee) {
		factory.getCurrentSession().createSQLQuery(
				"delete  from employee where id=?");
	}

	public Employee getEmployeeById(Integer id) {
		return (Employee) factory.getCurrentSession().get(Employee.class, id);
	}

	public Employee getEmployeeByUsername(String username) {
		String sql="select * from employee where username=?";
		Query queryObject = factory.getCurrentSession().createSQLQuery(sql).addEntity(Employee.class);
		queryObject.setParameter(0, username);
		if(queryObject.list().size()>=1){
			return (Employee)queryObject.list().get(0);
		}
		return null;
	}
}