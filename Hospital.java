package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int H_id;
	private String name;
	private String WardName;
	private String DoctorName;
	@OneToMany(mappedBy = "hospital")
	private List <Petients> petients;
	
	
	public int getH_id() {
		return H_id;
	}
	public void setH_id(int h_id) {
		H_id = h_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWardName() {
		return WardName;
	}
	public void setWardName(String wardName) {
		WardName = wardName;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public List<Petients> getPetients() {
		return petients;
	}
	public void setPetients(List<Petients> petients) {
		this.petients = petients;
	}
	public Hospital(int h_id, String name, String wardName, String doctorName, List<Petients> petients) {
		super();
		H_id = h_id;
		this.name = name;
		WardName = wardName;
		DoctorName = doctorName;
		this.petients = petients;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [H_id=" + H_id + ", name=" + name + ", WardName=" + WardName + ", DoctorName=" + DoctorName
				+ ", petients=" + petients + "]";
	}
	
	
}
