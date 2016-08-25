

import java.util.Scanner;

public class DiagDiff {
	
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		final int n = scan.nextInt();
		final int[][] a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = scan.nextInt();
		
		int primSum = 0;
		int secSum = 0;
		for (int i = 0; i < n; i++)
			primSum += a[i][i];
		for (int i = 0; i < n; i++)
			secSum += a[i][n - i - 1];
		
		System.out.println(Math.abs(primSum - secSum));
	}
	
}
