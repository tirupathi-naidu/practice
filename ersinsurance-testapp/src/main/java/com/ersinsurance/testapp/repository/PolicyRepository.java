package com.ersinsurance.testapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ersinsurance.testapp.model.Policy;


public interface PolicyRepository extends JpaRepository<Policy, Long>{
	List<Policy> findByUserName(String user);
}
