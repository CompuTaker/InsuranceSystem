package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.dao.ChatRoomDAO;
import com.test.dto.ChatRoomDTO;

@Controller
public class ChatController {
	
	@Autowired
	private ChatRoomDAO chatRoomDAO;
	
	@RequestMapping("/chat")
	public String chat(Model model, HttpServletRequest request, HttpServletResponse response) {
		return "chat"; // chat.jsp
	}
	
	@RequestMapping("/chatsession")
	public String chatSession(Model model, HttpSession session) {
		String url = "chastsession";
		return url; // chatsession.jsp
	}	
	
}
