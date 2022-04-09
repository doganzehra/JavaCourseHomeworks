/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı en fazla 3(üç) basamaklı int türden bir sayının basamakları toplamına geri
	dönen digitsSum isimli metodu NumberUtil sınıfı içerisinde yazınız. Metot aldığı argümanın en fazla 3(üç) basamaklı 
	olup olmadığını kontrol etmeyecektir. Basamaklar toplamı pozitif olarak döndürülecektir
----------------------------------------------------------------------------------------------------------------------*/
package csd;
class App {	
	public static void main(String [] args)
	{
		SumTest.run();
	}
}

public class SumTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Please enter the number:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.printf("%d sayısının basamakları toplamı: %d", a, NumberUtil.digitSum(a));
			
	}
}

public class NumberUtil {
	
	public static int digitSum(int a)
	{
		int b1, b2, b3, result;
		b1 = a / 100;
		b2 = a % 100 / 10;
		b3 = a % 10;
		result = b1 + b2 + b3;
		return Math.abs(result);
	}

}
