package testdemo2;

public class Main {

	

	public static void displayGreeting() {
		System.out.println("HELLO");
		System.out.println("This app shows sales data");
		System.out.println("Test 1");
	}
	
	public static void main(String[] args){
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
		
		
	}
}

