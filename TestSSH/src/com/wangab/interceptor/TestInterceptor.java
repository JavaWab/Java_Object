package com.wangab.interceptor;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;



public class TestInterceptor extends MethodFilterInterceptor {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(TestInterceptor.class);

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String uid = ServletActionContext.getRequest().getParameter("id");
		String result;
		log.info("-------拦截方法之前执行-----");
		if(uid == null){
			log.error("-------拦截到参数为空，现跳转到错误页面！-----");
			return "error";
		} else {
			result =  invocation.invoke();
			log.info("-------拦截方法之后执行-----");
		}
		return result;
	}

}
