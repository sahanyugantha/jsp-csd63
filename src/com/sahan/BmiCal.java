package com.sahan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BmiCal extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter writer = res.getWriter();
		
		float weight =  Float.parseFloat(req.getParameter("weight"));
		float height =  Float.parseFloat(req.getParameter("height"));
		
		float bmi = weight/(height*height);
		
		writer.println("Your BMI value is "+String.valueOf(bmi));
		
	}

}
