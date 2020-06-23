package bin.lambda;
interface I5
{
	String method(String message);
}
public class LamdaDemo3 {

	public static void main(String[] args) {
		
		 I5 reverse = (message) -> {
			 String result = "";
			 int i;
			 for(i = message.length()-1; i >= 0; i--)
			 result += message.charAt(i);
			 return result;
		 };
		 
		String b=reverse.method("Vinay Kumar");
		 System.out.println(b);
	
	
		 
	}

}
