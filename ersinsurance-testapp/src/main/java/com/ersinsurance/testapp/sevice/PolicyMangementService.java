package com.ersinsurance.testapp.sevice;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.ersinsurance.testapp.model.Policy;


public interface PolicyMangementService {

	List<Policy> getTodosByUser(String user);

	Optional<Policy> getTodoById(long id);

	void updateTodo(Policy todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Policy todo);

}