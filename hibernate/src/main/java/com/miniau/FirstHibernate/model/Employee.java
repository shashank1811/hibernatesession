package com.miniau.FirstHibernate.model;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmpId")
	int empid;
	@Column(name="Name")
	String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressid")
	private Address address;
	@Column(name="age")
	int age;
	@Column(name="CId")
	int companyId;
	@Column(name="Crat")
	Timestamp createdAt; 
	@Column(name="upat")
	Timestamp updatedAt ;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="employeeid")
	private Set<Phone> phones;
		
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public Employee() {
		super();
	}
	
	public void setadd(Address address)
	{
		this.address=address;
	}
	public Address getadd()
	{
		return address;
	}
	public String tostring()
	{
		return "employee[]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp updatedAt() {
		return updatedAt;
	}
	public void setupdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", age=" + age + ", companyId="
				+ companyId + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", phones=" + phones + "]";
	}

	
	

}
