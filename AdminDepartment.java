package com.gl.assisment1;

public  class AdminDepartment extends SuperDepartment {
	
	// method without argument and with return type
	public String departmentName() {
		 String deptAdmin="Welcome to Admin Department"; 
		return deptAdmin;
	}
	public String getTodaysWork() {
		 String docAdmin="Complete your document submission";	
		return docAdmin;
	}
	public String getWorkDeadline() {
		 String statusAdmin= "Complete by EOD";
		return statusAdmin;
	}
	
}
