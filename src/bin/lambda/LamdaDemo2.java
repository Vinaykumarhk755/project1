package bin.lambda;
interface I1
{
	int square(int num);
}
public class LamdaDemo2 {

	public static void main(String[] args) {
	I1 obj1=(int num)->
	{
	num = num*num;
	System.out.println("square of numbers is ");
	return num;
	
	};
int b=obj1.square(10);
System.out.println(b);
	}

}
