package com.test.dao;

import java.util.List;

import com.test.dto.ChatRoomDTO;

public interface ChatRoomDAO {
	
	abstract public List<ChatRoomDTO> listAllChatRoom();
	
}
