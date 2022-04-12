/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu NumberUtil
	 sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	 
	 123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
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
		System.out.printf("%d sayısının ters hali %d'dir.", number, reversed(number));
	}
	
	public static int reversed(int number)
    {
        int reverseNumber = 0;
		while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }
}


