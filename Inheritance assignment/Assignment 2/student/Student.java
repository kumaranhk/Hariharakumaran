package org.student;

import org.department.Department;

public class Student extends Department {
    public void studentName(){
        System.out.println("Kumaran");
    }
    public void studentDept(){
        System.out.println("Mechanical");
    }
    public void studentId(){
        System.out.println("013");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.studentName();
        student.studentDept();
        student.studentId();
        //Single inheritance
        student.deptNmae();
        //Multilevel Inheritance
        student.collegeName();
        student.collegeCode();
        student.collegeRank();
    }
}
