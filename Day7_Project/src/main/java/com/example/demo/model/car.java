package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car_table")
public class car {
@Id
private int id;
private String carName;
private String carType;
private int owners;
private Long mobile;
private String address;
public car() {
	super();
	// TODO Auto-generated constructor stub
}
public car(int id, String carName, String carType, int owners, Long mobile, String address) {
	super();
	this.id = id;
	this.carName = carName;
	this.carType = carType;
	this.owners = owners;
	this.mobile = mobile;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public int getOwners() {
	return owners;
}
public void setOwners(int owners) {
	this.owners = owners;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
