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
@Table(name="feedetails")
public class FeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transcationid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="status")
	private String status;
	
	@Column(name="transactiondate")
	private String transactiondate;

	public FeeDetails() {
		super();
	}

	public FeeDetails(long transcationid, String name, String email, String amount, String status,
			String transactiondate) {
		super();
		this.transcationid = transcationid;
		this.name = name;
		this.email = email;
		this.amount = amount;
		this.status = status;
		this.transactiondate = transactiondate;
	}

	public long getTranscationid() {
		return transcationid;
	}

	public void setTranscationid(long transcationid) {
		this.transcationid = transcationid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}
	
}
