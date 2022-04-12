/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong 
	 isimli metodu NumberUtil sınıfı içerisinde yazınız.
	 
	 Açıklamalar:
	 - Bir sayının her basamağının basamak sayıncı kuvvetleri toplandığında sayının kendisine eşitse bu sayıya Armstrong
	 sayısı denir. Örneğin:
	 
	 153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
	 
	 - Kuvvet alma işlemi için yazılmış olan pow metodunu kullanınız
	 
	 - Sayı negatif ise Armstrong sayısı kabul etmeyiniz
	 
	 - Metodu, 1 basamaklı, 2 basamaklı, 3 basamaklı, 4 basamaklı, 5 basamaklı ve 6 basamaklı Armstrong sayılarını
	 ekrana yazdırarak test ediniz	 
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
		for(int i = 0; i <= 999999; i++) {
			if(i == isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static int countDigits(int a)
	{
		if(a == 0) {
			return 1;
		}
		
		int count = 0;
		while(a != 0) {
			++count;
			a /= 10;
		}
		return count;
	}
	
	public static int pow(int a, int b)
	{
		if(b < 0) {
			return 1;
		}
	
		int result = 1;
		for(int i = 1; i<= b; i++) {
			result *= a;
		}
	
		return result;
	}
	
	public static int isArmstrong(int a) 
	{
		if(a > 0) {
			int sum = 0;
			int count = countDigits(a);
			while(a != 0) {
				sum += pow(a %10, count);
				a /= 10;
			}
			return sum;
		}
		return 0;
	}
}
