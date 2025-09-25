class Whatsapp1{
void sent(){
System.out.println("single tick");
}
}
class Whatsapp2 extends Whatsapp1{
void sent(){
System.out.println("double blue tick");
}
void voicemsg(){
System.out.println("voice note");
}
}
class Whatsapp3 extends Whatsapp2 {
void sent(){
System.out.println("single tick");
}
void voicecall(){
System.out.println("videocall connected");
}
}
class Whatsapp4 extends Whatsapp3{
void voicecall(){
System.out.println("HD videocall");
}
}
public class WhatsappDriver{
public static void main(String args[])
{
Whatsapp4 W=new Whatsapp4();
W.sent();
W.voicemsg();
W.voicecall();
}
}