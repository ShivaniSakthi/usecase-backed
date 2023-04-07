package com.admin.service;

import java.util.List;

import com.admin.model.FeeDetails;
import com.admin.model.LeaveDetails;
import com.admin.model.MessageDetails;

public interface StudentService {
	FeeDetails payfee(FeeDetails fee);
	LeaveDetails saveleave(LeaveDetails leave);
	MessageDetails message(MessageDetails message);
	
	List<MessageDetails> viewmessage();
	List<LeaveDetails> viewAppliedLeave();
	FeeDetails viewfee(String studentname);
//	Student getStudentById(long id);
	
	List<MessageDetails> viewmsgByTeachername(String teachername);
	List<LeaveDetails> viewleaveByTeachername(String teachername);
}
