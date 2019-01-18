package com.miniau.FirstHibernate.daoimpl;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import com.miniau.FirstHibernate.dao.Employeedao;
import com.miniau.FirstHibernate.model.Employee;

public class Employeedaoimpl implements Employeedao
{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}
	public void save(Employee e) 
	{
		Session session = this.sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(e);
		tr.commit();
		session.close();
	}
	
	public List<Employee> getAllEmployees() 
	{
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> persons = session.createQuery("from Employee").list();
        session.close();
		return persons;
	}

	public boolean delete(int EmployeeId) 
	{
		Session session = this.sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = (Employee) session.load(Employee.class, EmployeeId);
		if(e != null) 
		{
			session.delete(e);
		}
		tr.commit();
		session.close();
		return true;
	}
	
	public boolean getEmployee(int EmployeeId) 
	{
		Session session = this.sessionFactory.openSession();
		Employee e = (Employee) session.load(Employee.class, EmployeeId);
		System.out.println(e);
		return true;
	}

	public boolean update(int EmployeeId) 
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = (Employee) session.load(Employee.class, EmployeeId);
		e.setAge(24);
		session.update(e);
		tr.commit();
		session.close();
		return true;
	}
	public Employee getbyid(int empid) 
	{
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Employee e = (Employee) session.load(Employee.class, empid);
		session.update(e);
		session.close();
		return e;
	}

	
}
