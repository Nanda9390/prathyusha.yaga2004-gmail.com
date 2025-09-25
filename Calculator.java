public class Calculator{
private Static int object count=0;
public Calculator(){
object count++;
}
public Static int power int(int num1,int num2){
return(int)math.pow(num1,num2);
}
public Static double power Double(double num1,double num2){
return math.pow(num1,num2);
}
public Static int getobject count() {
return object count;
}
public Static void main(String[]args){
Calculator c1=new Calculator();
Calculator c2=new Calculator();
System.out.println("2^3="+Calculator:power int(2,3));
System.out.println("2^3="+Calculator:power Double(2.5,4.5));
System.out.println("number of objects created:"+Calculator.getobject count());
}
}