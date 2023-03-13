package com.renju.training.jenkins2;



import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;



public class JenCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		Assert.assertEquals(10, calc.add(5, 5));
		
	}
	
	@Test
	public void subTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		Assert.assertEquals(5, calc.sub(10, 5));
		
	}
	

}
