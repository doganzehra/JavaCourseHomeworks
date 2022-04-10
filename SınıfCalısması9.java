/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamakları 
	 toplamını döndüren sumDigits isimli 
	 metodu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki
	  kod ile test ediniz. Metot negatif sayılar için basamakları 
	 toplamını pozitif olarak döndürecektir 
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
		System.out.println("Please enter the number:");
		int number = Integer.parseInt(kb.nextLine());
		System.out.printf("%d sayısının basamakları toplamı %d'dir.", number, sumDigits(number));
	}
	
	public static int sumDigits(int number) 
	{
		int sum = 0;
		while(number != 0) {
			sum += number % 10;
			number /= 10;	
		}
		return Math.abs(sum);
	}
}
