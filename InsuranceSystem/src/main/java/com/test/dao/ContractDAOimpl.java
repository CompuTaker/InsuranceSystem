package com.test.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Contract;
import com.test.dto.ContractManager;
import com.test.dto.ContractStatistics;
import com.test.dto.InsurancePayment;
import com.test.dto.InsurancePaymentList;

/**
 * @author Administrator
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:12
 */
@Repository
public class ContractDAOimpl implements ContractDAO {

	public Contract contract;
	public ContractManager contractManager;

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int payCard(int paymentAmount, int paymentListID) {
		Map<String, Object> payment = new HashMap<String, Object>();
		payment.put("insurancePaymentListID", paymentListID);
		payment.put("oneTimeInsurancePayment", paymentAmount);
		Date date = new Date();
		payment.put("insurancePaymentDate", date);
		sqlSession.update("payCardList", payment);
		return sqlSession.insert("payCard", payment);
	}

	@Override
	public int makePaymentList(int insurancePayment) {
		Map<String, Object> paymentList = new HashMap<String, Object>();
		Date date = new Date();
		paymentList.put("completedPayment", 0);
		paymentList.put("uncompletedPayment", insurancePayment);
		paymentList.put("insurancePaymentPeriod", date);
		int res = this.sqlSession.insert("makePaymentList", paymentList);
		System.out.println("makePaymentList res : " + res);
		int insurancePaymentListID = Integer.parseInt(paymentList.get("insurancePaymentListID") + "");
		return insurancePaymentListID;
	}

	@Override
	public List<Contract> showAllContract(int customerID) {
		return sqlSession.selectList("showCustomerContract", customerID);
	}

	@Override
	public InsurancePaymentList showPaymentList(int insurancePaymentListID) {
		return sqlSession.selectOne("showPaymentList", insurancePaymentListID);
	}

	@Override
	public List<InsurancePayment> showPayment(int insurancePaymentListID) {
		return sqlSession.selectList("showPayment", insurancePaymentListID);
	}

	@Override
	public Contract showContractDetail(int contractID) {
		return sqlSession.selectOne("showContractDetail", contractID);
	}

	@Override
	public int destroyContract(int contractID) {
		return sqlSession.update("destroyContract", contractID);
	}

	/**
	 * 
	 * @param ����ID
	 */
	public List<ContractStatistics> showContractStatistics(int insuranceID) {
		return null;
	}

	/**
	 * 
	 * @param ���
	 */
	public int destroyContract(Contract contract) {
		return 0;
	}

	/**
	 * 
	 * @param �����
	 * @param ���
	 */
	public int payInsurancePayment(int insurancePayment, Contract contract) {
		return 0;
	}

	public List<Contract> showAllContractsByInsurance() {
		return null;
	}

	public List<Contract> showAllContractsByWork() {
		return null;
	}

	/**
	 * 
	 * @param ���޾�
	 * @param ���ID
	 */
	public void provideExpectedMoney(int expectedMoney, int contractID) {

	}

	@Override
	public int insertContract(Map<String, Object> ctmap) {
		// TODO Auto-generated method stub
		int res = this.sqlSession.insert("insertContract", ctmap);
		System.out.println("insertContract res : " + res);
		int contractID = Integer.parseInt(ctmap.get("contractID") + "");
		System.out.println("last inserted contractID => " + contractID);
		return contractID;
	}

}
