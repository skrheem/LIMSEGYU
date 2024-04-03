package chap05;

import java.util.Scanner;

public class stringinverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String a = in.nextLine();

		for (int b = a.length() - 1; b >= 0; b--) {
			System.out.print(a.charAt(b));
		}

	}

}
