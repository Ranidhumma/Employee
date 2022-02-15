package com.javaa;

public class Employee {

    public static void main(String[] args)
			{
					// constants
					System.out.println("lets Add parttime calculate wage");
					
					int IS_FULL_TIME = 2;
					int IS_PART_TIME = 1;
					int EMP_RATE_PER_HR = 20;
					//Variables
							int empHrs = 0;
							int empWage = 0;
							// Computation
					double empcheck = Math.floor(Math.random() * 10)% 3;
					
					if (empcheck == IS_FULL_TIME)
						empHrs = 8;
					
					//	System.out.println("Employee is Present");
					else if (empcheck == IS_PART_TIME)
						//System.out.println("Employee is Absent");
						empHrs = 4;
					empWage = empHrs * EMP_RATE_PER_HR ;
					System.out.println("Emp Wage: "  + empWage);
				
			}
			}
