package com.test.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.InsuranceDeveloper;
import com.test.dto.InsuranceDeveloperTeam;

/**
 * @author Lee sojeong
 * @version 1.0
 * @created 12-5-2020 ���� 4:22:13
 */
@Repository
public class InsuranceDeveloperDAOimpl implements InsuranceDeveloperDAO {

	public InsuranceDeveloperTeam insuranceDeveloperTeam;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public InsuranceDeveloperDAOimpl(){

	}

	public void finalize() throws Throwable {

	}
	
	@Override
	public List<InsuranceDeveloper> login(Map<String, String> loginInfo) {
		return this.sqlSession.selectList("developerLogin", loginInfo);
	}

	public int joinInsuranceDeveloper(InsuranceDeveloper insuranceDeveloper) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int registerInsuranceDeveloperTeamOnProposal(InsuranceDeveloperTeam insuranceDeveloperTeam) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public boolean checkByPw(String id, String pw) {
		if(this.sqlSession.selectOne("developerCheckByPw", id).equals(pw)) {
			return true;
		} else {
			return false;
		}
	}

}