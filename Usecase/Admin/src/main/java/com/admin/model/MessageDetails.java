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
@Table(name="messsagedetails")
public class MessageDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long msgid;
	
	@Column(name= "studentname")
	private String studentname;
	
	@Column(name= "teachername")
	private String teachername;
	
	@Column(name= "message")
	private String message;
	
	@Column(name="studentid")
	private Long studentid;

	public MessageDetails() {
		super();
	}

	public MessageDetails(Long msgid, String studentName, String teacherName, String message, Long studentid) {
		super();
		this.msgid = msgid;
		this.studentname = studentName;
		this.teachername = teacherName;
		this.message = message;
		this.studentid = studentid;
	}

	public Long getMsgid() {
		return msgid;
	}

	public void setMsgid(Long msgid) {
		this.msgid = msgid;
	}

	public String getStudentName() {
		return studentname;
	}

	public void setStudentName(String studentName) {
		this.studentname = studentName;
	}

	public String getTeacherName() {
		return teachername;
	}

	public void setTeacherName(String teacherName) {
		this.teachername = teacherName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}	
	
}
