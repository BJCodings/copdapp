package com.copdapp.copdapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.copdapp.copdapp.test.Test;

@Repository
public interface TestRepository extends CrudRepository<Test, String> {

	public Test findTopByOrderByCodeDesc();
	public Optional<Test> findBycode(int code);
}
