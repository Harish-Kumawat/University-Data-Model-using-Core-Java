package com.University;

public class College {
	String collegeName;
    String collegeAddress;

    public Department getDepartmentData() {

        Department dept = new Department();

        collegeName = "Siddhant College of Engineering";
        collegeAddress = "Pune, Maharashtra";

        dept.departmentName = "Information Technology";
        dept.hodName = "Dr. Mehta";

        
        dept.d1.divisionName = "Division A";
        dept.d1.classTeacher = "Mr.Sharma";

        dept.d1.s1.rollNo = 1;
        dept.d1.s1.studentName = "Rahul";
        dept.d1.s1.mobileNo = 8337329332L;
        dept.d1.s1.gender = 'M';
        dept.d1.s1.admissionYear = 2020;
        dept.d1.s1.feesPaid = 147000;
        dept.d1.s1.cgpa = 8.2f;
        dept.d1.s1.examSeatNo = 892383;
        dept.d1.s1.isRegular = false;

        dept.d1.s2.rollNo = 2;
        dept.d1.s2.studentName = "Akshay";
        dept.d1.s2.mobileNo = 8337899332L;
        dept.d1.s2.gender = 'M';
        dept.d1.s2.admissionYear = 2019;
        dept.d1.s2.feesPaid = 137000;
        dept.d1.s2.cgpa = 8.8f;
        dept.d1.s2.examSeatNo = 892893;
        dept.d1.s2.isRegular = false;

        dept.d1.s3.rollNo = 3;
        dept.d1.s3.studentName = "Sushant";
        dept.d1.s3.mobileNo = 8338922332L;
        dept.d1.s3.gender = 'M';
        dept.d1.s3.admissionYear = 2021;
        dept.d1.s3.feesPaid = 167000;
        dept.d1.s3.cgpa = 7.8f;
        dept.d1.s3.examSeatNo = 894493;
        dept.d1.s3.isRegular = true;       

        
        dept.d2.divisionName = "Division B";
        dept.d2.classTeacher = "Ms. Patil";

        dept.d2.s1.rollNo = 6;
        dept.d2.s1.studentName = "Najmin";
        dept.d2.s1.mobileNo = 99998888777L;
        dept.d2.s1.gender = 'F';
        dept.d2.s1.admissionYear = 2019;
        dept.d2.s1.feesPaid = 110000;
        dept.d2.s1.cgpa = 7.4f;
        dept.d2.s1.examSeatNo = 454493;
        dept.d2.s1.isRegular = true;

        dept.d2.s2.rollNo = 6;
        dept.d2.s2.studentName = "Surya";
        dept.d2.s2.mobileNo = 8898987672L;
        dept.d2.s2.gender = 'M';
        dept.d2.s2.admissionYear = 2022;
        dept.d2.s2.feesPaid = 110830;
        dept.d2.s2.cgpa = 6.4f;
        dept.d2.s2.examSeatNo = 890733;
        dept.d2.s2.isRegular = false;

        dept.d2.s3.rollNo = 7;
        dept.d2.s3.studentName = "Anushka";
        dept.d2.s3.mobileNo = 8392845132L;
        dept.d2.s3.gender = 'F';
        dept.d2.s3.admissionYear = 2021;
        dept.d2.s3.feesPaid = 110090;
        dept.d2.s3.cgpa = 6.9f;
        dept.d2.s3.examSeatNo = 890823;
        dept.d2.s3.isRegular = false;
        

        return dept;
    }
}    
    
