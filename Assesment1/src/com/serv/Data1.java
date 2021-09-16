package com.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reg.register;

public class Data1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String uid=req.getParameter("id");
		String pass=req.getParameter("ps");
		
		PrintWriter out =res.getWriter();
		register r = new register();
		ResultSet st = null;
		
		 
			try {
				st = r.login(uid, pass);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
 
		if(st!=null) {
		
			System.out.println("Success");
			RequestDispatcher rd = req.getRequestDispatcher("/Details.jsp");
			rd.forward(req, res);
			System.out.println("Success");
			
		}else {
			
			System.out.println("fail");
			
		}
	}

}
