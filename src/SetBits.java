import java.util.BitSet;
import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		BitSet[] B = { b1, b2 };

		for (int i = 0; i < m; i++) {
			String op = scan.next();
			int i1 = scan.nextInt() - 1;
			int i2 = scan.nextInt() - 1;
			switch (op) {
			case "AND":
				B[i1].and(B[i2]);
				break;
			case "OR":
				B[i1].or(B[i2]);
				break;
			case "XOR":
				B[i1].xor(B[i2]);
				break;
			case "FLIP":
				i2++;
				B[i1].flip(i2);
				break;
			case "SET":
				i2++;
				B[i1].set(i2);
				break;
			default:
				break;
			}

			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}

		scan.close();
	}

}
