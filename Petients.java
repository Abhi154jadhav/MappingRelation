package com.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Petients {
	@Id
	private int p_id;
	private String p_name;
	private String p_symptoms;
	@ManyToOne
	@JoinColumn(name = "hospital_Id")
	private Hospital hospital;
	
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_symptoms() {
		return p_symptoms;
	}
	public void setP_symptoms(String p_symptoms) {
		this.p_symptoms = p_symptoms;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Petients(int p_id, String p_name, String p_symptoms, Hospital hospital) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_symptoms = p_symptoms;
		this.hospital = hospital;
	}
	public Petients() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Petients [p_id=" + p_id + ", p_name=" + p_name + ", p_symptoms=" + p_symptoms + ", hospital=" + hospital
				+ "]";
	}
	

}
