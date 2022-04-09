/*------------------------------------------------------------------------------------------------------
 Klavyeden bir n sayısı okuyunuz ve aşağıdaki deseni oluşturan programı yazınız (örneğimizde n = 6’dır
 ------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		ShowStars.run();
	}
}

public class ShowStars {
	public static void run() 
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int n = Integer.parseInt(scanner.nextLine());
		show(n);
	}
	
	public static void show(int n) 
	{
		for (int i = 0; i <= n ; i++) {
			
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
		
        for (int i = (n - 1) ; i >= 0 ; i--) {
        	
            for (int j = (n - i); j > 0 ; j--) {
                System.out.print(" ");
            }
            
            for (int k = (2 * i); k > 1; k--) {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
	}
}

/*-----------------------------------------------------------------------------------------------------------------
Parametresi ile aldığı long türden saniye cinsinden süreyi saat, dakika ve saniye olarak ayrıştırarak ekrana 
yazdıran displayDuration isimli metodu yazınız. Eğer saat, dakika ya da saniye değeri 0(sıfır) ise ekrana 
yazdırılmayacaktır
 -----------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		ShowDuration.run();
	}
}

public class ShowDuration {
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Lütfen zamanı sn cinsinden giriniz:");
		long duration = Long.parseLong(kb.nextLine());
		displayDuration(duration);
	}
	
	public static void displayDuration(long duration)
	{
		if(duration == 0)
			return;
		
		long hour = duration / 3600;
		long minute = (duration % 3600) / 60;
		long second = (duration % 3600) % 60;
		
		if(hour != 0) {
			System.out.printf("%d second is equal to %02d hour ", duration, hour);
		}
		if(minute != 0) {
			System.out.printf("%02d minute ", minute);
		}
		if(second != 0) {
			System.out.printf("%02d second ", second);
		}
	}
}

/*------------------------------------------------------------------------------------------------
 Bir sayının asal çarpanlarını yazdıran programı yazınız.
 ------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		ShowPrimeFactors.run();
	}
}

public class ShowPrimeFactors {

	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz:");
		int number = Integer.parseInt(kb.nextLine());
		findPrimeFactors(number);
	}
	
	public static boolean isPrime(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
    	return true;
	}
	
	public static void findPrimeFactors(int a)
	{
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				if(isPrime(i))
					System.out.printf("%d ", i);
				
			}
		}
	}
}

/*-------------------------------------------------------------------------------------------------------------
2’den büyük tüm çift sayılar iki asal sayının toplamı biçiminde yazılabilir (Goldbach teoremi). Klavyeden bir 
çift sayı alan ve bunu iki asal sayının toplamı biçiminde yazdıran programı yazınız
 ------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		ShowPrime.run();
	}
}

public class ShowPrime {

	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Lütfen çift bir sayı giriniz:");
		int number = Integer.parseInt(kb.nextLine());
		golbach(number);
	}
	
	public static boolean isPrime(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
    	return true;
	}
	
	public static void golbach(int a) 
	{
		if(a % 2 == 0 && a > 2) {
			for(int i = 2; i < a; i++) {
				if(isPrime(i)) {
					for(int j = 2; j < a; j++) {
						if(isPrime(j)) {
							if((i+j) == a) {
								System.out.println(i + " + " + j);
							}
						}
					}
				}
			}
		}
	}
}





