package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.TestDAO;

@Service
public class TestService {

	@Autowired private TestDAO tdao;
	
	public String getTest() {
		String test = tdao.test();
		return test;
	}

}
