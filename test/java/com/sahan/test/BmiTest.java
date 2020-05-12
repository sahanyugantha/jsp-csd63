package com.sahan.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.demoapp2.BmiCal;

public class BmiTest {
	
	@Test
	public void BmiTester() {
		
		BmiCal bmiCal = new BmiCal();
		float actual = Math.round(bmiCal.getBmiVal("60", "1.7"));
		
		assertEquals(21.0, actual);
		
	}
	
}
