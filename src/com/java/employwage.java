package com.java;

import java.util.Random;

	class Employee {
	    static final int IS_FULL_TIME = 1;// constants
	    static final int IS_PART_TIME = 2;// constants
	    static final int EMP_WAGE_PER_DAY = 20;
	    static final int EMP_WAGE_FOR_MONTH = 20;
	    static final int TOTAL_WRK_HRS_MONTH = 100;

	    
	    public static int empCheck() {
	    	Random random = new Random();// random is object
	    	int empCheck = random.nextInt(3);
	    	return empCheck;
	    } 	
	    	  public static int empWrkHrs(int empCheck) {
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
	 
	    			return empWrkHrs;
	    		    }
	    	 public static int empWage(int empWrkHrs) {
	    			int empWage = empWrkHrs * EMP_WAGE_PER_DAY;
	    			return empWage;
	    		    }
	    	     	 
	    	 public static int totalSalary() {
	    			int day = 0;
	    			int totalSalary = 0;
	    			int empWrkHrs = 0;
	    			int empWage = 0;
	    			int empCheck = 0;
	    			int totalWrkHrs = 0;
	    			while (day < EMP_WAGE_FOR_MONTH && totalWrkHrs < TOTAL_WRK_HRS_MONTH) {
	    			    empCheck = empCheck();
	    			    empWrkHrs = empWrkHrs(empCheck);
	    			    empWage = empWage(empWrkHrs);
	    			    totalWrkHrs += empWrkHrs;
	    			    ++day;
	    			    totalSalary += empWage;
	    			}
	    			return totalSalary;
	    	 }
			
			
	}
	    public class employwage {

	        public static void main(String[] args) {
	    	int totalSalary;
	    	System.out.println("Calculate wage till condion reached");
	    	totalSalary = Employee.totalSalary();
	    	System.out.println("totalSalary = " + totalSalary);
	        }
	    }
	    
