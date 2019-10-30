package com.copdapp.copdapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.copdapp.copdapp.repository.TestRepository;
import com.copdapp.copdapp.test.Test;

@Service
public class TestService {
	
	@Autowired
	TestRepository repository;
	
	public int getLastRecord() {
		try {
			return repository.findTopByOrderByCodeDesc().getCode();
		}
		catch(NullPointerException e) {
			return 0; 
		}
	}
	
	public boolean checkIfUserExist(String user) {
		List<Test> allUsers = new ArrayList<>();
		repository.findAll().forEach(allUsers::add);
		return allUsers.stream().filter(t->t.getUser().equals(user)).findFirst().isPresent();
	}
	
	public boolean createNewCatTest(String user, int q1, int q2,
									int q3, int q4, int q5, int q6,
									int q7, int q8) {
		int code = getLastRecord();
		Test test1 = new Test(code, user, q1, q2, q3, q4, q5, q6, q7, q8);
		repository.save(test1);
		return checkIfUserExist(test1.getUser());
	}
	
	
}
