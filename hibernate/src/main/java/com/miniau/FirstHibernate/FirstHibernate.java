package com.miniau.FirstHibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.miniau.FirstHibernate.dao.Employeedao;
import com.miniau.FirstHibernate.model.Address;
import com.miniau.FirstHibernate.model.Employee;
import com.miniau.FirstHibernate.model.Phone;

public class FirstHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employeedao employeedao=context.getBean(Employeedao.class);
		
		Employee e=new Employee();
		e.setName("rahul");
		e.setAge(24);
		e.setCompanyId(12);
		
		Address add=new Address();
		add.setStreetNo("123");
		add.setCity("Delhi");
		
		e.setadd(add);
		
		Phone p1=new Phone();
		p1.setPhoneno("89898989899");
		Phone p2=new Phone();
		p2.setPhoneno("99898989899");
		
		Set<Phone> phones=new HashSet<Phone>();
		phones.add(p1);
		phones.add(p2);
		
		e.setPhones(phones);
		
		employeedao.save(e);
		employeedao.delete(2);
		employeedao.update(1);
		employeedao.getbyid(1);

		List<Employee> employees =employeedao.getAllEmployees();
		System.out.println("The list is:");
		for(Employee emp : employees)
		{
			System.out.println(emp);
		}
		context.close();
	}

}
