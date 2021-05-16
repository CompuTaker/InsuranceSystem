package com.test.dao;

import java.util.List;

import com.test.dto.AccidentHistory;

public interface AccidentHistoryDAO {
	
	public List<AccidentHistory> showOne(int accidentHistoryID);
	
}
