import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeStuff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayDeque<Integer> AryDq = new ArrayDeque<Integer>(m);
		Set<Integer> set = new HashSet<Integer>();
		int largest = -1;

		if (m != n) {
			for (int i = 0; i < n; i++) {
				if (AryDq.size() < m) {
					int num = scan.nextInt();
					AryDq.addLast(num);
					set.add(num);
				} else {
					if (set.size() > largest)
						largest = set.size();
					if (largest == m) {
						break;
					}
					int rem = AryDq.removeFirst();
					if (!AryDq.contains(rem)) {
						set.remove(rem);
					}
					AryDq.addLast(scan.nextInt());
					set.add(AryDq.getLast());
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				AryDq.addLast(scan.nextInt());
			}
			set.addAll(AryDq);
			if (set.size() > largest)
				largest = set.size();
		}
		System.out.println(largest);
		scan.close();
	}

}
