
public class Method Overloading{
public static void student(){
System.out.println("student method with no arguments");
}
public static void student(Strng name){
System.out.println("student name:"+name);
public static void student(String name,int age){
System.out.println("student age:"+age);
}
public static void students(String name.int,age,String branch)
{
System.out.println("student name:"+name);
System.out.println('student age:"+age);
System.out.println("student branch;"=branch);
public static void main(String args[])
{
student();
System.out.println("========");
student("Lakshmi");
System.out.println("========");
student("Lakshmi",14);
System.out.println("=========");
student("Lakshmi","14","school assistant");
}
}
