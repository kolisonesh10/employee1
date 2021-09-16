package com.reg;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Client;
 
import com.serv.Data;

public class register  {
	public int insert(Client c) {
		Configuration cfg = new Configuration();
		cfg.configure("cli.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tr = ses.beginTransaction();
		Serializable id = ses.save(c);
		tr.commit();
		ses.close();
		factory.close();
		return  (int) id;
		
		
		
	}
	public ResultSet login(String uname, String pass) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/reg1","root","root123");
		
		Statement st = con.createStatement();
		
		ResultSet rs =st.executeQuery("Select * from client where clientno ='" + uname + "' and  password = '"+ pass +"'");
		return rs;
		
	}


	 

}
