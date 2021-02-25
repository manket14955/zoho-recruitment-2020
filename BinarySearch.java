package devuda;

import java.util.Scanner;

public class BinarySearch {

	static int[] arr = new int[] { 14, 16, 19, 20, 21, 26, 27, 40 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(binarySearch(n, 0, arr.length));

	}

	private static int binarySearch(int n, int s, int e) {
		if (e >= s) {
			int mid = (s + e) / 2;

			System.out.println("mid = " + mid + " arr[mid] " + arr[mid] + " s " + s + " e " + e);
			if (arr[mid] == n) {
				return mid;
			} else if (n > arr[mid]) {
				return binarySearch(n, mid + 1, e);

			} else {
				return binarySearch(n, s, mid - 1);
			}
		}
		return -1;
	}

}
