package com.wangab.service.impl;

import com.wangab.dao.IndeDAO;
import com.wangab.model.Inde;
import com.wangab.service.Iservice;

public class IndeService implements Iservice {
	private IndeDAO indeDAO;
	
	public Inde findById(Integer id) {
		
		return indeDAO.findById(id);
	}

	public IndeDAO getIndeDAO() {
		return indeDAO;
	}

	public void setIndeDAO(IndeDAO indeDAO) {
		this.indeDAO = indeDAO;
	}
	
}
