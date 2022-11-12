package com.ersinsurance.testapp.sevice;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ersinsurance.testapp.model.Policy;
import com.ersinsurance.testapp.repository.PolicyRepository;



@Service
public class PolicyManagementServiceImpl implements PolicyMangementService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public List<Policy> getTodosByUser(String user) {
		return policyRepository.findByUserName(user);
	}

	@Override
	public Optional<Policy> getTodoById(long id) {
		return policyRepository.findById(id);
	}

	@Override
	public void updateTodo(Policy todo) {
		policyRepository.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		policyRepository.save(new Policy(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Policy> todo = policyRepository.findById(id);
		if (todo.isPresent()) {
			policyRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Policy todo) {
		policyRepository.save(todo);
	}
}