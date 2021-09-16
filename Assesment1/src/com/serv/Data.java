package com.serv;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Client;
import com.reg.register;

public class Data extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String clientno = req.getParameter("cn");
		String name = req.getParameter("nm");
		String password= req.getParameter("ps1");
		String age = req.getParameter("ag");
		String dob = req.getParameter("db");
		String address = req.getParameter("ad");
		String mobile = req.getParameter("mn");
		String state = req.getParameter("st");
		String initailno = req.getParameter("im");
		String city = req.getParameter("ct");
		String nation = req.getParameter("na");
		
		String noofpay = req.getParameter("np");
		String createdate = req.getParameter("dc");
		
		Client c = new Client(clientno,name,password,age,dob,mobile,address,state,initailno,city,nation,noofpay,createdate);
		register re = new register();
		re.insert(c);
	}

}
