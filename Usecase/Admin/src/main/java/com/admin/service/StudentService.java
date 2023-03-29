package com.admin.service;

import java.util.List;

import com.admin.model.FeeDetails;
import com.admin.model.LeaveDetails;
import com.admin.model.MessageDetails;

public interface StudentService {
	FeeDetails payfee(FeeDetails fee);
	LeaveDetails applyleave(LeaveDetails leave);
	MessageDetails message(MessageDetails message);
	
	List<MessageDetails> viewmessage();
	List<LeaveDetails> viewAppliedLeave();
//	Student getStudentById(long id);
	
	List<MessageDetails> viewmsgByTeachername(String teachername);
}
