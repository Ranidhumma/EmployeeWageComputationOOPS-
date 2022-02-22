package com.java;                        

import java.util.Random;

 class Employee {
	    static final int IS_FULL_TIME = 1;                 // is_full_time=1Fixed for present condition
	    
	    public static void empCheck() {
	    	 
		Random random = new Random();                          //Random function (0/1)
		int empCheck = random.nextInt(2);
		if (empCheck == IS_FULL_TIME) {
		    System.out.println("Empoyee is Present");
		} 
		else {
		    System.out.println("Empoyee is Absent");
	    }
	}
}
 public class Employeecheck {                              // class created while creating new project
	  public static void main(String[] args) {
			System.out.println("Welcome, calculate here , employee Present Or Absent Using Random function");
			Employee.empCheck();				
	  }
	}