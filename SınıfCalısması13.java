/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyel değerini döndüren factorial isimli metodu
	 NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	 Açıklamalar:
	 - Faktoriyel işlemi aşağıdaki gibidir: 
		 0! = 1
		 1!= 1
		 2! = 1 * 2
		 3! = 1 * 2 * 3
		 
		 ...
		 
		 n! = 1 * 2 * 3 * ... * (n - 1) * n
	 
	 - Negatif sayılar için faktoriyel değeri 1 olarak döndürelecektir	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;
class App {	
	public static void main(String [] args)
	{
		NumberUtil.run();
	}
}

class NumberUtil {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz:");
		int number = Integer.parseInt(kb.nextLine());
		System.out.printf("%d! = %d", number, factorial(number));
	}
	
	public static int factorial(int number)
	{
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	
}
