package com.bl.empwage;

public class Emp_Uc10 {
public static void main(String[] args) {
		
		Emp_UC9 hclEmp = new Emp_UC9("Karthik", "HCL", 8, 30, 10, 10);
		int hclEmpWage = hclEmp.calculateEmpWage();
		System.out.println(hclEmp.empName + " is working with " + hclEmp.companyName + ", and he is earning "
				+ hclEmpWage + "$ monthly");
		
		Emp_UC9 accentureEmp = new Emp_UC9("Pri", "Accenture", 6, 30, 10, 100);
		int accEmpWage = accentureEmp.calculateEmpWage();
		System.out.println(accentureEmp.empName + " is working with " + accentureEmp.companyName + ", and she is earning "
				+ accEmpWage + "$ monthly");
		
		Emp_UC9 dmrtEp = new Emp_UC9("Dinesh", "Dmart", 6, 30, 100, 60);
		int dmartEmpWage = dmrtEp.calculateEmpWage();
		System.out.println(dmrtEp.empName + " is working with " + dmrtEp.companyName + ", and he is earning "
				+ dmartEmpWage + "$ monthly");
		
	}
}
