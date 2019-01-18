package com.miniau.FirstHibernate.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
//	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createdAt;
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updatedat")
	private Timestamp updatedAt;
	@Column(name="city")
	private String city;
	@Column(name="streetno")
	private String streetNo;
	
	
	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", city=" + city
				+ ", streetNo=" + streetNo + "]";
	}

}
