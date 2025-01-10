package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class School {
	@Id
	private int centerCode;
	private String name;
	private String prname;
	private String board;
	private int accno;
	
	
	@OneToMany(mappedBy = "sc")
	private List <Student> list ;
	
	
	
	public int getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(int centerCode) {
		this.centerCode = centerCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int centerCode, String name, String prname, String board, int accno, List<Student> list) {
		super();
		this.centerCode = centerCode;
		this.name = name;
		this.prname = prname;
		this.board = board;
		this.accno = accno;
		this.list = list;
	}
	@Override
	public String toString() {
		return "School [centerCode=" + centerCode + ", name=" + name + ", prname=" + prname + ", board=" + board
				+ ", accno=" + accno + ", list=" + list + "]";
	}
	
}
