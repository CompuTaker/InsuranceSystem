package com.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.ChatRoomDTO;

@Repository
public class ChatRoomDAOimpl implements ChatRoomDAO {
	
	@Autowired // root-context.xml
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ChatRoomDTO> listAllChatRoom() {
		return this.sqlSession.selectList("listAllChatRoom");	
	}
	
}
