package com.mph.entity;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
/*
@NamedQueries(
		{ 
			@NamedQuery(name = "GET_LEAVE_BY_LID", query = "from LeaveDetail l where l.lid=:lid"),
		    @NamedQuery(name = "GET_LEAVE_BY_EID", query = "from LeaveDetail l where l.eid=:eid") 
		})*/
public class LeaveDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leave_sequence")
	//@SequenceGenerator(name = "leave_sequence", allocationSize = 1)
	private int lid;
	private String empid;
	private String ltype;
	private String reason;
	private String fromdate;
	private String todate;
	/*
	@OneToOne
	@JoinColumn(name = "eid")
	private Employee eid;
*/
	public LeaveDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveDetail(int lid, String empid, String ltype, String reason, String fromdate, String todate) {
		super();
		this.lid = lid;
		this.empid = empid;
		this.ltype = ltype;
		this.reason = reason;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getLtype() {
		return ltype;
	}
	public void setLtype(String ltype) {
		this.ltype = ltype;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	@Override
	public String toString() {
		return "LeaveDetail [lid=" + lid + ", empid=" + empid + ", ltype=" + ltype + ", reason=" + reason
				+ ", fromdate=" + fromdate + ", todate=" + todate + "]";
	}
	
}




/*+ ", eid=" + eid + "*/