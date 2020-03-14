
public class AreaOfRectangle {
	static int areaOfRec(int length, int bre) {
		int area= length*bre;
		return area;
	}
	static void display() {
		System.out.println("Area and Perimeter Of Rectangle are shown below");// how to display in main
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		int areaValue = areaOfRec(6,5);
		System.out.println("The Area Of Rectangle is "+areaValue);
		int periValue = PerimterRec.perimeterOfRectangle(10,2);
		System.out.println("The Perimeter Of Rectangle is "+periValue);
		System.out.println("Main Ends");
		
		

	}

}
