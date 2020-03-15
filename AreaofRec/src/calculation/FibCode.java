package calculation;

import java.util.Scanner;

public class FibCode {
	static int f1=0;
	static int f2=1;		
	static int f3;
	
	static void fibSeries(int input) {
		System.out.println(f1+"\n"+f2);
		for(int i=2;i<=input;i++) {
			f3=f1+f2;
			if(f3<=input)/*in case to get fib series num upto the between range*/
			System.out.println(f3 +" ");
			f1=f2;
			f2=f3;
			}
		
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the range of fib series");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("The fib series of "+input+ " is:");
		fibSeries(input);
		scan.close();
		
		
	}

}
