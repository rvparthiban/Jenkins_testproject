package com.parthi.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.parthi.trainings.jenkin.JenkinCalc;

public class JenkinCalcTest {

	@Test
	public void addtest() {
		JenkinCalc obj = new JenkinCalc();
		assertEquals(10, obj.addnumber(5, 5));
		
	}
	public void subtest() {
		JenkinCalc obj = new JenkinCalc();
		assertEquals(10, obj.addnumber(15, 5));
		
	}

}
