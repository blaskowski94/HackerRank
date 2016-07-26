import java.math.BigDecimal;
import java.util.*;

class BigDec {

	public static void main(String[] argh) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		String temp;
		/*
		 * BigDecimal[] a = new BigDecimal[s.length]; for (int i = 0; i <
		 * a.length; i++) { a[i] = new BigDecimal(s[i]); }
		 */

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				BigDecimal sj1 = new BigDecimal(s[j - 1]);
				BigDecimal sj = new BigDecimal(s[j]);
				if (sj1.compareTo(sj) < 0) {
					temp = s[j - 1];
					s[j - 1] = s[j];
					s[j] = temp;
				}

			}
		}

		/*
		 * for (int i = 0; i < a.length; i++) { s[i] = a[i].toString(); }
		 */

		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
