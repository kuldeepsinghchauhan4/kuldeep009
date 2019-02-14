package com.cg.eis.lab6.problem3.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.eis.lab6.problem3.exception.ExceptionCheck;

public class JUnitTesting {

	@Test
	public void unSuccessfullTest() {
		ExceptionCheck ec = new ExceptionCheck();
		
		assertEquals("Exception Handled", ec.checking(101, "YANHSU", 2222));
	}
	
	@Test
	public void successfullTest() {
		ExceptionCheck ec = new ExceptionCheck();
		
		assertEquals(null, ec.checking(101, "YANHSU", 222222));
	}

}
