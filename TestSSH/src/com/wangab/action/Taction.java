package com.wangab.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.wangab.model.Inde;
import com.wangab.service.impl.IndeService;


public class Taction extends  ActionSupport  implements  ServletRequestAware{
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(Taction.class);
	private int id;
	private IndeService service;
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		
	}
	
	public String test() throws Exception {
		log.info("收到参数ID：" + id);
		Inde inde = service.findById(id);
		if(inde == null){
			log.error("未查到该编号！");
		} else {
			log.info("通过参数查询对象的值为：" + inde.getUsed());
		}
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public IndeService getService() {
		return service;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setService(IndeService service) {
		this.service = service;
	}
	
}
