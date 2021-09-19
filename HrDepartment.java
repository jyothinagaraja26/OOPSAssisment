package com.gl.assisment1;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
	   String deptHr="Welcome to Hr Department";
		return deptHr;
	}
	public String getTodaysWork() {
	   String workHr="Fill  today's timesheet and mark your attendence";
		return workHr;
	}
	public String getWorkDeadline() {
		String statusHr="Complete by EOD";	
		return statusHr;
	}
	public String doActivity() {
	  String activityHr="Team lunch";
		return activityHr;
	}
	

}
