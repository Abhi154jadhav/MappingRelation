package com.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private String lastname;
	private String city;
	private int age;
	private String Std;
	
	
	@ManyToOne
	@JoinColumn(name = "stud_sc")
	private School sc;


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getStd() {
		return Std;
	}


	public void setStd(String std) {
		Std = std;
	}


	public School getSc() {
		return sc;
	}


	public void setSc(School sc) {
		this.sc = sc;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int roll, String name, String lastname, String city, int age, String std, School sc) {
		super();
		this.roll = roll;
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.age = age;
		Std = std;
		this.sc = sc;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", lastname=" + lastname + ", city=" + city + ", age=" + age
				+ ", Std=" + Std + ", sc=" + sc + "]";
	}
	
	
	
}
