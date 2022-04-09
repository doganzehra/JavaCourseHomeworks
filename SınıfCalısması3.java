/*----------------------------------------------------------------------------------------------------------------------,
	Math sınıfının min ve max metotları ile 3 tane sayının en küçüğünün ve en büyüğünün bulunması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		FindNumbers.run();
	}
}

public class FindNumbers {
	
	public static void run() 
	{
		java.util.Scanner kb =  new java.util.Scanner(System.in);
		System.out.print("Please enter the first number:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the second number:");
		int b = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the third number:");
		int c = Integer.parseInt(kb.nextLine());
		
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, Math.min(Math.min(a, b), c));
		System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, Math.max(Math.max(a, b), c));

	}
}
