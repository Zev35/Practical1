package Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		int[] n = new int[500];

		Random rn = new Random();

		for (int i = 0; i < 500; i++) {
			n[i] = rn.nextInt(500);

		}

		Arrays.sort(n);

		for (int j = 0; j < 500; j++) {
			System.out.print(n[j] + "\t");
		}

		Scanner ui = new Scanner(System.in);
		System.out.println();
		System.out.println("Give me Nth smallest number");
		int num = ui.nextInt();
		System.out.println(n[num - 1]);
	}

}
