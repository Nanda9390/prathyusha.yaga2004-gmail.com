public class AccessControls{
public int x=10;
private int y=20;
protected int z=30;
int a=40;
public static void main(String[]args)
{
AccessControls e=new AccessControls();
System.out.println("public variable:"+e.x);
System.out.println("private variable:"+e.y);
System.out.println("protected variable value:"+e.z);
System.out.println("default variable value:"+e.a);
}
}
