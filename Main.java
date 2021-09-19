package com.gl.assisment1;

public class Main {
	
	public static void main(String[] args) {
		
		//creating objects for admin,hr and tech
		
		AdminDepartment admin=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tech=new TechDepartment();
	
		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println(hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");
		
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}
}
