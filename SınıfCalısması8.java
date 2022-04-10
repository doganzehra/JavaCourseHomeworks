
/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren countDigits isimli metodu 
	 NumberUtil isimli sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
	 Not: İleride daha iyisi yazılacaktır
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
		System.out.printf("%d sayısının basamak sayısı %d'dir.", number, countDigits(number));
	}
	
	public static int countDigits(int number) 
	{
		int counter = 1;
		while(number > 10) {
			number /= 10;
			++counter;
		}
		return counter;
	}
}



