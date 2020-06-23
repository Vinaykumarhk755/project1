package bin.lambda;
interface I{
	void name(String name);
}
public class LambdaDemo {

	public static void main(String[] args) {
	I obj=	(String name) ->System.out.println("my name is "+name);
	obj.name("vinay");
	
	}

	}


