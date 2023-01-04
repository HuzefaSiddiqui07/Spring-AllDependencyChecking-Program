package com.springframework.dependencychecking.all.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Candidate candidate = (Candidate) applicationContext.getBean("c");

		candidate.getCandidate(); // Call Method By Object

	}

}
