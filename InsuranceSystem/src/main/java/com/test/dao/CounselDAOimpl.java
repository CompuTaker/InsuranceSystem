package com.test.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Counsel;
import com.test.dto.Customer;
import com.test.dto.Insurance;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
@Repository
public class CounselDAOimpl implements CounselDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	public Counsel counsel;

	public CounselDAOimpl(){

	}

	/**
	 * insert counsel 
	 */
	public int writeCounselContent(Counsel counsel){
		sqlSession.insert("insertCounsel", counsel);
		
		return 0;
	}

	/**
	 * 
	 * @param ��
	 * @param ���
	 * @param �������
	 */
	public int assignCounsel(Customer customer, Counsel counsel, Salesman salesman){
		return 0;
	}

	/**
	 * 
	 * @param �̸�
	 * @param ���ǳ���
	 * @param �����ǰ
	 * @param �������
	 * @param ����ó
	 * @param ���
	 */
	public int assignCounsel_anon(String name, String counselContent, Insurance insurance, Salesman salesman, String phoneNumber, Counsel counsel){
		return 0;
	}

}