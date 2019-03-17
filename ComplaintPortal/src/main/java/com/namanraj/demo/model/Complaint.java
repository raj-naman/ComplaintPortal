package com.namanraj.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

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
	private String compbody;
	private String status;
	private String message;
	private String password;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createDate;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date modifyDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getCompbody() {
		return compbody;
	}
	public void setCompbody(String compbody) {
		this.compbody = compbody;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Date getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}
	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", roll=" + roll + ", name=" + name + ", hostel=" + hostel + ", room=" + room
				+ ", degree=" + degree + ", year=" + year + ", ctype=" + ctype + ", compbody=" + compbody + ", status="
				+ status + ", message=" + message + ", createDate=" + createDate + ", modifyDate=" + modifyDate + "]";
	}
	
	
	
	
	
	

}
