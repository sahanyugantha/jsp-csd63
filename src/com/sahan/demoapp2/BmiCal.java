package com.sahan.demoapp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BmiCal extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		float bmi = getBmiVal(req.getParameter("weight"), req.getParameter("height"));
		
		PrintWriter writer = res.getWriter();		
		writer.println("Your BMI value is "+String.valueOf(bmi));
		
	}
	
	public float getBmiVal(String w, String h) {
		

		float weight =  Float.parseFloat(w);
		float height =  Float.parseFloat(h);
		
		return weight/(height*height);
	}
	

}
