package com.University;

public class University {
	 public static void main(String[] args) {

		 College c = new College();
	        Department dept = c.getDepartmentData();

	        System.out.println("-------- College Details --------");
	        System.out.println("\nCollege Name    : " + c.collegeName);
	        System.out.println("College Address : " + c.collegeAddress);
	        
	        System.out.println("\n----------------------------------");
	        System.out.println("\n-------- Department Details --------");
	        System.out.println("Department Name : " + dept.departmentName);
	        System.out.println("HOD Name        : " + dept.hodName);

	        printDivision(dept.d1);
	        printDivision(dept.d2);
	    }

	    static void printDivision(Division d) {

	        System.out.println("\n----------------------------------");
	        System.out.println("Division Name  : " + d.divisionName);
	        System.out.println("Class Teacher : " + d.classTeacher);

	        printStudent(d.s1);
	        printStudent(d.s2);
	        printStudent(d.s3);
	        
	    }

	    static void printStudent(Student s) {

	        System.out.println("------------------------------------");
	        System.out.println("Student Roll No     : " + s.rollNo);
	        System.out.println("Student Name        : " + s.studentName);
	        System.out.println("Mobile No           : " + s.mobileNo);
	        System.out.println("Gender              : " + s.gender);
	        System.out.println("Admission Year      : " + s.admissionYear);
	        System.out.println("Fees Paid           : " + s.feesPaid);
	        System.out.println("CGPA                : " + s.cgpa);
	        System.out.println("Exam Seat No        : " + s.examSeatNo);
	        System.out.println("Is Student Regular  : " + s.isRegular);
	    }
	
}
