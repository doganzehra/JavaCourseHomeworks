/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren pow isimli
	 metodu NumberUtil sınıfı içerisinde yazınız.
	 Açıklamalar:
	 - Math sınıfının pow metodu kullanılmayacaktır
	 - Metot negatif b değerleri için 1(bir) değerine geri dönecektir
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
		System.out.print("Please enter the number:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the power:");
		int b = Integer.parseInt(kb.nextLine());
		System.out.printf("%d sayısının %d üssü %d'dir.", a, b, pow(a, b));
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
}

