package com.my.test.home;

public class StudentInfo {
    private Student stu;

    public StudentInfo(Student stu) {
        this.stu = stu;
    }
    public StudentInfo(){

    }

    public Student getStu() {return stu;}
    public void setStu(Student stu) {this.stu = stu;}
    public void stuInfoPrint(){
        if (null != stu) {
            System.out.println("===========================");
            System.out.println("이름 : " + stu.getName());
            System.out.println("나이 : " + stu.getAge());
            System.out.println("===========================");
            System.out.println();
        }
    }
}
