package com.namanraj.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complaint 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String roll;
	private String name;
	private String hostel;
	private int room;
	private String degree;
	private int year;
	private String ctype;
	private String complaint;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHostel() {
		return hostel;
	}
	public void setHostel(String hostel) {
		this.hostel = hostel;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	@Override
	public String toString() {
		return "Complaint [roll=" + roll + ", name=" + name + ", hostel=" + hostel + ", room=" + room + ", degree="
				+ degree + ", year=" + year + ", ctype=" + ctype + ", complaint=" + complaint + "]";
	}
	
	

}
