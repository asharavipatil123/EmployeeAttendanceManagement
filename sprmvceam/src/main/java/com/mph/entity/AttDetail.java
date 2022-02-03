package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String employeeid;
	private String adate;
	private String logon;
	private String logoff;
	public AttDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttDetail(int aid, String employeeid, String adate, String logon, String logoff) {
		super();
		this.aid = aid;
		this.employeeid = employeeid;
		this.adate = adate;
		this.logon = logon;
		this.logoff = logoff;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getLogon() {
		return logon;
	}
	public void setLogon(String logon) {
		this.logon = logon;
	}
	public String getLogoff() {
		return logoff;
	}
	public void setLogoff(String logoff) {
		this.logoff = logoff;
	}
	@Override
	public String toString() {
		return "AttDetail [aid=" + aid + ", employeeid=" + employeeid + ", adate=" + adate + ", logon=" + logon
				+ ", logoff=" + logoff + "]";
	}
	
	
}