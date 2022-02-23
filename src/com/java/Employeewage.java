package com.java;

import java.util.Random;

class Employee {
    static final int IS_FULL_TIME = 1;
    static final int EMP_WAGE_PER_DAY = 20;
    static final int IS_PART_TIME = 2; 
    static final int EMP_WAGE_FOR_MONTH = 20;

    public static int empCheck() {
	Random random = new Random();
	int empCheck = random.nextInt(3);                          //0,1,2 Random function added part time 
	return empCheck;
    }
    
  public static int empSalary(int empCheck) {
	int empWrkHrs ;
	switch (empCheck) {
	
	case IS_FULL_TIME :
	
	    empWrkHrs = 8;
	    break ;
	case IS_PART_TIME :
	
		empWrkHrs = 4 ;
	    break;
    default :
	
	    empWrkHrs = 0;
	    break;
	}
	int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
	//System.out.println("empWage = " + empWage);
	return empWage;
    }

public static int totalSalary() {
	int totalSalary = 0;
	int day ;
	int empWage = 0;
	int empCheck = 0;
	for (day=0 ; day < EMP_WAGE_FOR_MONTH; day++) {
	    empCheck = empCheck();
	    empWage = empSalary(empCheck);
	    
	    totalSalary += empWage;
	}
	return totalSalary;
  }

}

public class Employeewage {                                                        //class
    public static void main(String[] args) {
    	int totalSalary;
    	System.out.println("Here we are Calculating wage for 20 days");
    	totalSalary = Employee.totalSalary();
	     System.out.println("totalSalary = " + totalSalary);
	
    }}
