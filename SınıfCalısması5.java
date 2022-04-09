/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana yazdıran
	programı yazınız. 
	Not: İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {	
	public static void main(String [] args)
	{
		FindRoot.run();
	}
}

public class FindRoot {
	
	public static void run() 
	{
		//ax2 + bx1 + c
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Lütfen denklemin katsayılarını giriniz:");
		System.out.print("a:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("b:");
		int b = Integer.parseInt(kb.nextLine());
		
		System.out.print("c:");
		int c = Integer.parseInt(kb.nextLine());
		
		NumberUtil.calculateRoots(a, b, c);
	}
}

class NumberUtil {
	
	public static double getDelta(int a, int b, int c)
	{
		return b * b - 4 * a * c;
	}
	
	public static void calculateRoots(int a, int b, int c)
	{
		double x1, x2;
		double delta = getDelta(a, b, c);
		
		if(delta > 0) 
		{
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);	
			System.out.println("Kökler birbirinden farklıdır.");
			System.out.printf("x1 = %f , x2 = %f", x1, x2);
		}
		else if(delta == 0)
		{
			x1 = x2 = -b / (2 * a);
			System.out.println("Kökler aynıdır.");
			System.out.printf("x1 = x2 = %f", x1);
		}
		else
		{
			System.out.print("Gerçek kök yoktur.");
		}
	}
}
