/*----------------------------------------------------------------------------------------------------------------------,
	Sınıf Çalışması: Klavyeden girilen iki tane int türden sayının toplamını ve çarpımını aşağıdaki gibi ekrana basan
	programı yazınız:
	Girilen sayılar 10 ve 20 ise
	
	10 + 20 = 30
	10 * 20 = 200
	şeklinde ekran çıktısı olacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		FindResults.run();	
	}
}

public class FindResults {
	
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Please enter the first number:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the second number:");
		int b =  Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d + %d = %d%n", a, b, NumberUtil.add(a, b));
		System.out.printf("%d * %d = %d%n", a, b, NumberUtil.multiply(a, b));
	}

}

public class NumberUtil {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
}
