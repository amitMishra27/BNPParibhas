package com.bnpparibhas.Model;

import com.bnpparibhas.Utility.Utility;

import lombok.Data;

@Data
public class Employee {
	
	private String empname;
	
	private String empjob;
	
	private Float empsal;
	
	private Integer empnum;
	
	public static void main(String[] args) {
		System.out.println(Utility.getSysDate());
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
