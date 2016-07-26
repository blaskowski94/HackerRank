import java.util.Scanner;

public class AryJump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] ary1 = new int[n];

			for (int j = 0; j < n; j++) {
				ary1[j] = scan.nextInt();
			}

			boolean flag = findSolution(ary1, 0, m);
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scan.close();
	}

	public static boolean findSolution(int[] map, int position, int jump) {

		try {
			if (position < 0)
				return false;
			if (map[position] == 1)
				return false;
		} catch (ArrayIndexOutOfBoundsException e) {
			return true;
		}

		map[position] = 1;

		return findSolution(map, position + jump, jump) || findSolution(map, position + 1, jump)
				|| findSolution(map, position - 1, jump);
	}

}
