package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String clientno;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String age;
	@Column
	private String dob;
	@Column
	private String mobile;
	@Column
	private String address;
	@Column
	private String state;
	@Column
	private String initailno;
	@Column
	private String city;
	@Column
	private String nation;
	@Column
	private String noofpay;
	@Column
	private String createdate;
	public Client() {
		super();
	}
	public Client(String clientno, String name, String password, String age, String dob, String mobile, String address,
			String state, String initailno, String city, String nation, String noofpay, String createdate) {
		super();
		this.clientno = clientno;
		this.name = name;
		this.password = password;
		this.age = age;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.state = state;
		this.initailno = initailno;
		this.city = city;
		this.nation = nation;
		this.noofpay = noofpay;
		this.createdate = createdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientno() {
		return clientno;
	}
	public void setClientno(String clientno) {
		this.clientno = clientno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInitailno() {
		return initailno;
	}
	public void setInitailno(String initailno) {
		this.initailno = initailno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNoofpay() {
		return noofpay;
	}
	public void setNoofpay(String noofpay) {
		this.noofpay = noofpay;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	 
	
}
