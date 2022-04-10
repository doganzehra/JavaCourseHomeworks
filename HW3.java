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

