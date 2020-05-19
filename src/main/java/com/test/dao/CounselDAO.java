package com.test.dao;

import com.test.dto.Counsel;
import com.test.dto.Customer;
import com.test.dto.Insurance;
import com.test.dto.Salesman;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:14
 */
public interface CounselDAO {

	/**
	 * 
	 * @param ���
	 */
	public int writeConselContent(Counsel counsel);

	/**
	 * 
	 * @param ��
	 * @param ���
	 * @param �������
	 */
	public int assignConsel(Customer customer, Counsel counsel, Salesman salesman);

	/**
	 * 
	 * @param �̸�
	 * @param ���ǳ���
	 * @param �����ǰ
	 * @param �������
	 * @param ����ó
	 * @param ���
	 */
	public int assignConsel_anon(String name, String counselContent, Insurance insurance, Salesman salesman, String phoneNumber, Counsel counsel);

}