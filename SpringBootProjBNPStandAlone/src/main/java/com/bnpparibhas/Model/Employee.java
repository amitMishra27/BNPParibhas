package com.bnpparibhas.Model;


import lombok.Data;

@Data
public class Employee {
	
	private String empname;
	
	private String empjob;
	
	private Float empsal;
	
	private Integer empnum;
	
	
	public void m1()
	{

		System.out.println("Hello Utility:1234");
		System.out.println("abc123");

	}


	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpjob() {
		return empjob;
	}

	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}

	public Integer getEmpnum() {
		return empnum;
	}

	public void setEmpnum(Integer empnum) {
		this.empnum = empnum;
	}

	public Float getEmpsal() {
		return empsal;
	}

	public void setEmpsal(Float empsal) {
		this.empsal = empsal;
	}

	
}
