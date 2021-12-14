package com.bl.empwage;

public interface Iemployeewage {
     public void addCompany(Company company);
	
	public int getTotalWage(String companyName);
	
	public Company getCompany(int index);
	
	public Company getCompany(String companyName);
}
