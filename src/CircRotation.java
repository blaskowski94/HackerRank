
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircRotation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();
		List<Integer> a = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		for(int i = 0; i < k; i++){
			a.add(0, a.remove(n-1));
		}
		for(int i = 0; i < q; i++){
			System.out.println(a.get(scan.nextInt()));
		}
	}
	
}
