package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Zoho {

	public static void main(String[] args) {

		/*
		 * int[] arr = new int[] {1,2,3,4,5}; for(int i=0; i<arr.length; i++) {
		 * 
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		MiddlePrinter(inp);

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.reverse().toString());

	}

	private static void MiddlePrinter(String inp) {
		int mid = inp.length() / 2;

		int j = 0;

		int length = inp.length();

		int g = 0;

		int h = 0;
		
		int a = 0;

		while (j < inp.length()) {
			for (int i = length - 1; i > h; i--) {
				System.out.print(" ");
			}
			for (int z = 0; z <= g; z++) {
				if (mid < inp.length()) {
					System.out.print(inp.charAt(mid));
					mid++;
				}else if(mid>=inp.length()) {
					mid = a;
					System.out.print(inp.charAt(mid));
                    mid++;
				}
			}
			
			mid = inp.length() / 2;
			g++;
			h++;
			System.out.println();
			j++;
			a=0;
		}

	}

}
