
public class asg3 {
public static void main(String args[])
{
	/*boolean a;
	int c;
	c = (int)a;
	System.out.println("\n c = " +c); boolean cant be casted in integer implicitly or explicitly */
	
	float b=3.5f;
	int c;
	c=(int)b;
	System.out.println("\n c = "+c);//explicit type casting as float value cannot be stored in integer implicitly
	
	long l = 12345;
	int c1;
	c1= (int)l;//explicit type casting as long value cannot be stored in integer implicitly
	System.out.println("\n c1 = " +c1);
	
	

}
}
/*
output:
c = 3

c1 = 12345

*/	
	
	