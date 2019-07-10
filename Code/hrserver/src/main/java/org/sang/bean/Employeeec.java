package org.sang.bean;

import java.util.Date;

public class Employeeec {
	private Long id;
	private Long eid;
	private Date ecDate;
	private String ecReason;
	private Long ecPoint;
	private Long ecType;
	private String remark;
	
	public Employeeec(Long id,Long eid,Date ecDate,String ecReason,Long ecPoint,Long ecType,String remark) {
		this.eid=eid;
		this.id=id;
		this.ecDate=ecDate;
		this.ecPoint=ecPoint;
		this.ecReason=ecReason;
		this.ecType=ecType;
		this.remark=remark;
		
		
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	public Long GetId() {
		return id;
	}
	public void setEid(Long id) {
		this.eid=id;
	}
	public Long GetEid() {
		return eid;
	}

	public void setEcDate(Date id) {
		this.ecDate=id;
	}
	public Date GetEcDate() {
		return ecDate;
	}

	public void setEcReason(String id) {
		this.ecReason=id;
	}
	public String GetEcReason() {
		return ecReason;
	}

	public void setEcPoint(Long id) {
		this.ecPoint=id;
	}
	public Long GetEcPoint() {
		return ecPoint;
	}

	public void setEcType(Long id) {
		this.ecType=id;
	}
	public Long GetEcType() {
		return ecType;
	}
	public void setRemark(String id) {
		this.remark=id;
	}
	public String GetRemark() {
		return remark;
	}


}
