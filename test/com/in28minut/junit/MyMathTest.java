package com.in28minut.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
//MyMath.sum
	//1,2,3 => 6
	@Test
	void sumTest() {
		MyMath myMath = new MyMath();
		int res = myMath.sum(new int [] {1,2,3});
		//check that the res is 6
		//check res == 6
		assertEquals(6, res);
	
		
		
		
		//ABsance of failure is success
	}

}
