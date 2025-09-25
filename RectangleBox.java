class Box{
private double width;
private double height;
private double depth;
public Box(double width,double height,double depth){
this.width=width;
this.height=height;
this.depth=depth;
}
public double calculatevolume(){
return width*height*depth;
}
}
public class RectangleBox{
public static void main(String[]args){
Box box=new Box(5.0,3.0,2.0);
double volume=box.calculatevolume();
System.out.println("volume of the box:"+volume);
}
}