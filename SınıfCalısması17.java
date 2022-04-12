/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayıdan büyük ilk Fibonacci sayısına 
	eri dönen nextFibonacciNumber
	isimli metodu yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{		
		NextFibonacciNumberTest.run();		
	}
}

class NextFibonacciNumberTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val < -999)
				break;
			
			System.out.printf("%d. sayısından büyük ilk Fibonacci sayısı:%d%n", val, NumberUtil.nextFibonacciNumber(val));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int nextFibonacciNumber(int val) 
	{
		if (val < 0)
			return 0;
		
		int prev1 = 1, prev2 = 0, next;
		
		for (;;) {
			next = prev1 + prev2;
			
			if (next > val)
				return next;
			
			prev2 = prev1;
			prev1 = next;
		}
	}	
}
