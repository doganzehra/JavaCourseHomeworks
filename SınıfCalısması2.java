/*----------------------------------------------------------------------------------------------------------------------,
	Sınıf Çalışması: Parametresi ile aldığı double tür x1, y1, x2, y2 koordinat bilgilerine göre iki nokta arasındaki 
	((x1, y1) ve (x2, y2) noktaları) uzaklığa geri dönen distance isimli metodu PointUtil isimli sınıf içerisinde yazınız.
  	ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)
	{
		FindDistance.run();
	}
}

public class FindDistance {
	
	public static void run() 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Please enter x1 coordinate:");
		double x1 = Double.parseDouble(kb.nextLine());
		System.out.print("Please enter y1 coordinate:");
		double y1 = Double.parseDouble(kb.nextLine());
		System.out.print("Please enter x2 coordinate:");
		double x2 = Double.parseDouble(kb.nextLine());
		System.out.print("Please enter y2 coordinate:");
		double y2 = Double.parseDouble(kb.nextLine());
		
		double result = PointUtil.distance(x1, y1, x2, y2);
		System.out.printf("Distance is: %f", result);	
	}
}

public class PointUtil {
	
	public static double distance(double x1, double y1, double x2, double y2) 
	{
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
