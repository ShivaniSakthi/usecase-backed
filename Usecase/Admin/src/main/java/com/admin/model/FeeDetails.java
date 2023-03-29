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
	private String Name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="status")
	private String status;
	
	@Column(name="transactiondate")
	private String transactiondate;
}
