package com.mycompany.app;
import junit.framework.TestCase;

public class MainTest extends TestCase {
	public void testAdd() { 
        int num1 = 3; 
        int num2 = 2; 
        int total = 5; 
        int sum = 0; 
        sum = Main.soma(num1, num2); 
        assertEquals(sum, total); 
  } 
}
