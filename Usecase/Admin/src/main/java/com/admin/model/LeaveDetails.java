package com.admin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="leavedetails")
public class LeaveDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaveid;
	
	@Column(name= "studentname")
	private String studentname;
	
	@Column(name="studentid")
	private Long studentid;
	
	@Column(name= "teachername")
	private String teachername;
	
	@Column(name= "reason")
	private String reason;
	
	@Column(name="leavefrom")
	private String leavefrom;
	
	@Column(name="leaveto")
	private String leaveto;
	
	@Column(name="totalleave")
	private String totalleave;
	
	@Column(name="status")
	private String status;

	public LeaveDetails() {
		super();
	}

	public LeaveDetails(Long leaveid, String studentname, Long studentid, String teachername, String reason,
			String leavefrom, String leaveto, String totalleave, String status) {
		super();
		this.leaveid = leaveid;
		this.studentname = studentname;
		this.studentid = studentid;
		this.teachername = teachername;
		this.reason = reason;
		this.leavefrom = leavefrom;
		this.leaveto = leaveto;
		this.totalleave = totalleave;
		this.status = status;
	}

	public Long getLeaveid() {
		return leaveid;
	}

	public void setLeaveid(Long leaveid) {
		this.leaveid = leaveid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLeavefrom() {
		return leavefrom;
	}

	public void setLeavefrom(String leavefrom) {
		this.leavefrom = leavefrom;
	}

	public String getLeaveto() {
		return leaveto;
	}

	public void setLeaveto(String leaveto) {
		this.leaveto = leaveto;
	}

	public String getTotalleave() {
		return totalleave;
	}

	public void setTotalleave(String totalleave) {
		this.totalleave = totalleave;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
