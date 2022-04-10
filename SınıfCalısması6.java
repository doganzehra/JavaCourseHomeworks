/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların pozitif ve negatif olanlarının ayrı ayrı toplamını 
	 bulan programı yazınız. Programda hiç negatif veya pozitif sayı girilmemişse uygun mesajlar verilmelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;
class App {	
	public static void main(String [] args)
	{
		FindSums.run();
	}
}

class FindSums {
	public static void printResult(int posSum, int negSum)
	{
		if (posSum != 0)
			System.out.printf("Pozitif sayıların toplamı:%d%n", posSum);
		else
			System.out.println("Hiç pozitif sayı girmediniz");
		
		if (negSum != 0)
			System.out.printf("Negatif sayıların toplamı:%d%n", negSum);
		else
			System.out.println("Hiç negatif sayı girmediniz");
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("Sayıları girmeye başlayınız:");
		
		int posSum = 0, negSum = 0;
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0)
			if (val > 0)
				posSum += val;
			else
				negSum += val;		
		
		printResult(posSum, negSum);
	}
}
