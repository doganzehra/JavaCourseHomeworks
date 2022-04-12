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
			sum = number % 10;
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
• Bir sayının basamaksal kökü tüm basamaklarının toplanması ile elde edilen sayıdır. Basamakları toplama işlemi,
tek basamaklı bir sayı elde edilene kadar sürdürülür:
36987 -> 3 + 6 + 9 + 8 + 7 = 33
33 -> 3 + 3 = 6 → basamaksal kök
 ------------------------------------------------------------------------------------------------------------------------------------------*/


