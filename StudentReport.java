package com.Report;
import com.Student.Student;
import com.Sports.Sports;
public class StudentReport extends Student implements Sports{
public void StudentReportInfo(){
StudentInfo();
}
String Sportsname="Cricket";
int score=100;
public void SportsInfo(){
System.out.println("Sports Information");
System.out.println("Sports name:"+Sportsname);
System.out.println("score:"+score);
}
public static void main(String[]args)
{
StudentReport s=new StudentReport();
s.StudentReportInfo();
System.out.println("==========");
s.SportsInfo();
}
}