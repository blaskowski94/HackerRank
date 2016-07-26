import java.util.HashSet;
import java.util.Scanner;

public class RepeatedNames {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		HashSet<String> h = new HashSet<String>();
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < n; i++){
			String s = scan.nextLine().trim();
			h.add(s);
			System.out.println(h.size());
		}
	}

}
