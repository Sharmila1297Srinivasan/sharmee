package calculation;
import java.util.Scanner;
import java.lang.String;

public class DemoOfMeasurements {
	static double ar;
	static double ht;
	static double br;
	static double a;
	static double b;
	static double c;
	static Scanner scan = new Scanner(System.in);
	
	static void squareInp() {
		System.out.println("Enter the Area Of Square");
		ar = scan.nextDouble();
	}
	static void triInp() {
		System.out.println("Enter the height of the Triangle");
		ht = scan.nextDouble();
		System.out.println("Enter the breadth of the Triangle");
		br = scan.nextDouble();
		
		
	}
	
	static void triPInp() {
		System.out.println("Enter the a value of the Triangle");
		a = scan.nextDouble();
		System.out.println("Enter the b value of the Triangle");
		b = scan.nextDouble();
		System.out.println("Enter the c value of the Triangle");
		c = scan.nextDouble();
	}
	

	public static void main(String[] args) {
		System.out.println("A.Area Of Square\nB.Area Of Triangle\nC.Perimeter Of Square\nD.Perimeter Of Triangle");
		System.out.println("Enter any from the above option");
		String ans = scan.next();
		switch(ans){
			
		case "A":
			squareInp();
			double area = AreaOfSquare.area(ar);
			System.out.println("The area of square is"+area);
			break;
		
		case "B":
			triInp();
			double area1 = AreaOfTriangle.areaOfTri(ht, br);
			System.out.println("The Area Of Triangle is:"+area1);
			break;
		
		case "C":
			squareInp();
			double peri1 = PerimeterOfSquare.periOfSquare(ar);
			System.out.println("The Perimeter Of Square is:"+peri1);
			break;
			
		case "D":
			triPInp();
			double peri2 = PerimeterOfTriangle.periOfTri(a, b, c);
			System.out.println("The Perimeter Of Triangle is:"+peri2);
			break;
			
			
			
			
			
			
			
		}

	}

}
