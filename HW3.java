/*-------------------------------------------------------------------------------------------------------------
abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
koşul 1 cba > abc olacak
koşul 2 abc asal sayı olacak
koşul 3 cba asal sayı olacak
koşul 4 ab asal sayı olacak
koşul 5 bc asal sayı olacak
koşul 6 cb asal sayı olacak
koşul 7 ba asal sayı olacak
Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
 ------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		FindNumber.run();
	}
}

public class FindNumber {
	
	public static void run() 
	{
		find();
	}
	
	public static void find() {
		for(int i = 100; i <= 999; i++) 
		{
			if(reverse(i) > i) {
				if(isPrime(i)) {
					if(isPrime(reverse(i))) {
						if(isPrime(firstTwo(i))) {
							if(isPrime(lastTwo(i))) {
								if(isPrime(reverse(lastTwo(i)))) {
									if(isPrime(reverse(firstTwo(i)))) {
										System.out.println(i);
								}
							}
						}
					}
				}
			}
		}
	}
	
}
	public static boolean isPrime(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				return false;
			}
		}
    	return true;
	}
	
	public static int firstTwo(int abc) 
	{
		int ab = abc / 10;
		return ab;
	}
	
	public static int lastTwo(int abc) 
	{
		int bc = abc % 100;
		return bc;
	}
	
	public static int reverse(int number)
    {
        int reverseNumber = 0;
		while (number > 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        return reverseNumber;
    }
	
}

/*-----------------------------------------------------------------------------------------------------------------------------------------
 2. Aşağıda açıklanan isPrimeX isimli metodu yazınız:
isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer sayı asal ise bu kez sayının 
basamak değerleri toplanarak elde edilen sayının asal olup olmadığı test edilecektir. Bu işlem sonuçta tek basamaklı bir sayı 
kalana kadar devam edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX metodu true
değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot false değerine geri 
dönecektir. 
 ------------------------------------------------------------------------------------------------------------------------------------------*/
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
		System.out.print("Lütfen  bir sayı giriniz:");
		int number = Integer.parseInt(kb.nextLine());
		System.out.print(isPrimeX(number));
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
    	return true;
	}
	
	public static int digitSum(int number) 
	{
		int sum=0;
		while(number != 0)
		{
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	public static boolean isPrimeX(int number) 
	{
		while(number != 0) {
			if(isPrime(number)) {
				number = digitSum(number);
				return true;
			}
			return false;
		}
		return false;
	}	
}

/*-----------------------------------------------------------------------------------------------------------------------------------------
  3. Parametresi ile aldığı int türden bir sayının basamaksal kökünü bulan calculateDigitalRoot isimli metodu yazınız ve test 
ediniz
Açıklamalar:
Bir sayının basamaksal kökü tüm basamaklarının toplanması ile elde edilen sayıdır. Basamakları toplama işlemi,
tek basamaklı bir sayı elde edilene kadar sürdürülür:
36987 -> 3 + 6 + 9 + 8 + 7 = 33
33 -> 3 + 3 = 6 → basamaksal kök
 ------------------------------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		CalculateUtil.run();
	}
}

public class CalculateUtil {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Lütfen bir sayı girin:");
		int number = Integer.parseInt(kb.nextLine());
		System.out.printf("%d sayısının basamaksal kökü:%d", number, calculateDigitalRoot(number));
		
	}
	
	public static int countDigits(int val)
	{
		if (val == 0)
			return 1;
		
		int count = 0;
		
		while (val != 0) {
			++count;
			val /= 10;					
		}
		
		return count;
	}
	
	public static int digitSum(int number) 
	{
		int sum = 0;
		while(number != 0)
		{
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	
	public static int calculateDigitalRoot(int number) 
	{
		while(countDigits(number) > 1) {
			number = digitSum(number);
		}
		return number;

	}
}

/*-----------------------------------------------------------------------------------------------------------------------------------------
4. Pozitif bir sayının factorian sayısı olup olmadığını test eden isFactorian isimli metodu yazınız ve test ediniz.
Açıklamalar:
• Basamaklarının faktoriyelleri toplamı kendisine eşit olan sayıya factorian denir.
• Sayma sayılarında (pozitif sayılarda) 4 tane factorian sayı vardır. Bunlardan ilk ikisi şüphesiz 1 ve 2'dir.
• Diğerlerini de bulan test kodunu yazınız.
• İpucu: Kalan iki sayı da 100000 değerinden küçüktür
 ------------------------------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		NumberUtil.run();
	}
}

class NumberUtil {
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		for(int i = 1; i < 100000; ++i) {
			isFactorian(i);
		}
	}
	
	public static int factorial(int number)
	{
		int factorial = 1;
		for(int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int digitFactorialSum(int number) 
	{
		int sum = 0;
		while(number != 0)
		{
			sum += factorial(number % 10);
			number /= 10;
		}
		return sum;
	}
	
	public static void isFactorian(int number)
	{
		if(digitFactorialSum(number) == number) {
			System.out.println(number);
		}
	}
}







