import java.util.Scanner;

public class PalindromeOfNumbers {
	static int r, sum = 0, temp;

	static void PalinFunc(int num) {
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not a Palindrome");

	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check the whether palindrome or not");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		PalinFunc(num);
		scan.close();

	}

}
