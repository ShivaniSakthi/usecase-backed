package com.admin.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.admin.model.FeeDetails;
import com.admin.model.LeaveDetails;
import com.admin.model.MessageDetails;
import com.admin.repository.FeeRepository;
import com.admin.repository.LeaveRepository;
import com.admin.repository.MessageRepository;
import com.admin.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService {

	private FeeRepository feeRepo;
	private LeaveRepository leaveRepo;
	private MessageRepository messageRepo;
	
	public StudentserviceImpl(FeeRepository feeRepo, LeaveRepository leaveRepo, MessageRepository messageRepo) {
		super();
		this.feeRepo = feeRepo;
		this.leaveRepo = leaveRepo;
		this.messageRepo = messageRepo;
	}

	@Override
	public FeeDetails payfee(FeeDetails fee) {
		return feeRepo.save(fee);
	}

	@Override
	public LeaveDetails applyleave(LeaveDetails leave) {
		return leaveRepo.save(leave);
	}

	@Override
	public MessageDetails message(MessageDetails message) {
		return messageRepo.save(message);
	}

	@Override
	public List<MessageDetails> viewmessage() {
		return messageRepo.findAll();
	}

	@Override
	public List<MessageDetails> viewmsgByTeachername(String teachername) {
		return messageRepo.findByTeachername(teachername);
	}

	@Override
	public List<LeaveDetails> viewAppliedLeave() {
		return leaveRepo.findAll();
	}

}
