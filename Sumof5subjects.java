import java.util.Scanner;
public class Sumof5subjects{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
int s1,s2,s3,s4,s5,total;
double percentage;
System.out.print("enter marks for Subjects 1:");
s1=sc.nextInt();
System.out.print("enter marks for Subjects 2:");
s2=sc.nextInt();
System.out.print("enter marks for Subject 3:");
s3=sc.nextInt();
System.out.print("enter marks for subject 4:");
s4=sc.nextInt();
System.out.print("enter marks for subject 5:");
s5=sc.nextInt();
total=s1+s2+s3+s4+s5;
percentage=(double)total/5;
System.out.println("total marks="+total);
System.out.println("Percentage="+percentage+"%");
sc.close();
  }