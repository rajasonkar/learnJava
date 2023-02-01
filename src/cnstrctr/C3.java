package cnstrctr;

public class C3 extends C2{
C3(){
	super();
	System.out.println("IN C3");
}
public static void main(String []args)
{
	C3 c = new C3();
	C2 a = new C2();
	C1 b = new C1();
	
	C1 bn =  new C3();
}
}
