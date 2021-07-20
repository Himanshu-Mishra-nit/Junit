package com.in28minut.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
//MyMath.sum
	//1,2,3 => 6
	@Before 
	public void before() {
		System.out.println("Before");
	}
	
	
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	
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
