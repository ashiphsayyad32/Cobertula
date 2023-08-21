package com.cybage.demo;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;


public class demo {
public int add(int a , int b) {
	
	return a+b;
}
public int sub(int a , int b) {
	
	return a-b;
}
	@Test 
	public void Test1() {
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		assertEquals("HelloWorld" , s);
		System.out.println("Enter the numbers");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		assertEquals(add(a,b), 10);
		
		assertEquals(sub(a,b), 4);
		
	}

}
