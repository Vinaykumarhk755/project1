package assignment;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) throws InvalidOrderException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the orders added");
int noOfItemsToAdd=scanner.nextInt();
OrderServiceUtil util=new OrderServiceUtil();
for(int i=0;i<noOfItemsToAdd;i++)
{
	System.out.println("enter order id: ");
	String id=scanner.next();
	System.out.println("enter custemer name: ");
	String name=scanner.next();
	System.out.println("enter amount: ");
	float amount=scanner.nextFloat();
	System.out.println("enter mode of payment: ");
	String payment=scanner.next();
	util.addOrder(new Order(id,name,amount,payment));
}
System.out.println("total amount for above order is: "+util.totalAmount());
System.out.println("enter the id to search: ");
String searchId=scanner.next();
System.out.println("order details of id: "+"searchid "+util.searchById(searchId));
scanner.close();
	}

}
