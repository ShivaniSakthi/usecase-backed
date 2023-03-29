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
	@Column(name= "leaveid")
	private Long leaveid;
	
	@Column(name= "studentname")
	private String studentName;
	
	@Column(name="studentid")
	private Long studentid;
	
	@Column(name= "teachername")
	private String teacherName;
	
	@Column(name= "reason")
	private String reason;
	
	@Column(name="leavefrom")
	private String from;
	
	@Column(name="leaveto")
	private String to;
	
	@Column(name="totalleave")
	private String totalleave;
	
	@Column(name="status")
	private String status;
	
}
