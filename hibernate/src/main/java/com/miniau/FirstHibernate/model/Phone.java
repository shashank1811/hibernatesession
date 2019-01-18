package com.miniau.FirstHibernate.model;

import javax.persistence.*;

@Entity
@Table(name="phone")
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="phoneno")
	private String phoneno;
	

	public Phone() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneno=" + phoneno + "]";
	}
}
