package com.bl.empwage;

public class Emp_UC11 
{
	public static void main(String[] args) 
	{
		Compnay hcl = new Compnay("HCL", 8, 20, 10, 100);
		System.out.println("Company Name"+" "+hcl.companyName+"\n"+"Wage"+hcl.totalEmpWage);
		
		Compnay wipro = new Compnay("Wipro", 6, 30, 20, 50);
		System.out.println("Companyname"+" "+wipro.companyName+"\n"+"Wage"+wipro.totalEmpWage);
	}
}
