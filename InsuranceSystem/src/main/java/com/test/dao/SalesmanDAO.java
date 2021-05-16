package com.test.dao;

import java.util.List;
import java.util.Map;

import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public interface SalesmanDAO {

	public Salesman assignSalesman();
	
	public List<Salesman> login(Map<String, String> loginInfo);
	
	public boolean checkByPw(String id, String pw);
	
}