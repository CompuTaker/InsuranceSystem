package com.test.dao;

import java.util.List;

public interface RecipientDAO {

	public List<String> showRecipientName(List<Integer> recipientID);
	
	public String showDetailRecipientName(int recipientID);
	
}
