package com.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Recipient;

@Repository
public class RecipientDAOimpl implements RecipientDAO {
	
	private Recipient recipient;	
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<String> showRecipientName(List<Integer> recipientIDList) {
		
		List<String> result = new ArrayList<String>();
		
		for(int recipientID : recipientIDList) {
			result.add((String) sqlSession.selectOne("getRecipientrName", recipientID));
		}
		
		return result;
	}
	
	public String showDetailRecipientName(int recipientID) {
		return sqlSession.selectOne("getRecipientrName", recipientID);
	}

}
