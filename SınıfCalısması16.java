/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı n sayısı için n-inci Fibonacci sayısını döndüren fibonacciNumber isimli 
	metodu NumberUtil sınıfı içerisinde ve aşağıdaki kod ile test ediniz
	Açıklama:
		- Fibonnaci sayıları
			0 1 1 2 3 5 8 13 21 34 ...
		- Metot pozitif olmayan n değerleri için kontrol yapmayacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		NumberUtil.run();
	}
}

public class NumberUtil {

	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n < 1)
				break;
			
			System.out.printf("%d. Fibonacci sayısı:%d%n", n, NumberUtil.fibonacciNumbers(n));
		}
		System.out.println("Tekrar yapıyor musunuz?");
	}
	
	 public static int fibonacciNumbers(int number)
	 {
		if( number <= 2) {
			return number - 1;
		} 
		
		int x = 0, y = 1, sum = 0;
		for(int i = 2; i < number; i++) {
			sum = x + y;
			x = y;
			y = sum;
		}
		return sum;
	
	 }
}

