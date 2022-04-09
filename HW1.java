/*-------------------------------------------------------------------------------------------------------------------
1. Klavyeden alınan int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve = 
sembolleriyle gösteriniz:
-------------------------------------------------------------------------------------------------------------------*/
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
		System.out.print("Please enter the first number:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the second number:");
		int b = Integer.parseInt(kb.nextLine());
		System.out.print("Please enter the third number:");
		int c = Integer.parseInt(kb.nextLine());
		
		sort(a, b, c);
	}
	
	public static void sort(int a, int b, int c) 
	{
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int mid = (a + b + c) - max - min;
		
		if(mid < min) 
		{
			System.out.printf("%d < %d", mid, min);
		}
		else if(mid == min)
		{
			System.out.printf("%d = %d", mid, min);
		}
		else {
			System.out.printf("%d < %d", min, mid);
		}
		
		
		if(mid < max) {
			System.out.printf(" < %d", mid, max);
		}
		else if(mid == max)
		{
			System.out.printf(" = %d", mid, max);
		}
	}
}

/*----------------------------------------------------------------------------------------------------------------------
Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz.
Metot sayıların aynı olması durumunda da ortanca değere geri dönecektir. Örneğin sayılar 10, 10, 20 ise ortanca 
değer 10 olacaktır.
----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {	
	public static void main(String [] args)
	{
		ShowMid.run();
	}
}

public class ShowMid {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Lütfen ilk sayıyı girin:");
		int a = Integer.parseInt(kb.nextLine());
		System.out.print("Lütfen ikinci sayıyı girin:");
		int b = Integer.parseInt(kb.nextLine());
		System.out.print("Ltüfen üçüncü sayıyı girin:");
		int c = Integer.parseInt(kb.nextLine());
		
		System.out.printf("Üç sayı içinden ortancası: %d", mid(a, b, c));
	}
	
	public static int mid(int a, int b, int c)
	{
		if(a <= b && b <= c) {
			return b;
		}
		else if(a >= b && a <= c) {
			return a;
		}
		else if(a >= b && b >= c) {
			return b;
		}
		else if(a >= c && a <= b) {
			return a;
		}
		else {
			return c;
		}
	}
}

/*----------------------------------------------------------------------------------------------------------------------
Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli 
metodu yazınız ve test ediniz. Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır) döndürecektir.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		ShowSign.run();
	}
}

public class ShowSign {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int a = Integer.parseInt(kb.nextLine());
		int result = signum(a);	
		System.out.printf("Sign is:%d", result);
	}
	
	public static int signum(int a) 
	{
		if(a > 0) {
			return 1;
		}
		else if(a == 0) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
