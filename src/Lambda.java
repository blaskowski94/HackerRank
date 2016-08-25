
import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	PerformOperation is_odd(){
		return a -> (a%2 == 0 ? false : true);
	}
	
	PerformOperation is_palindrome(){
		return a -> {
			String str = Integer.toString(a);
			for(int i = 0; i < str.length()/2; i++){
				if(str.charAt(i) != str.charAt(str.length()-1-i))
					return false;
			}
			return true;
		};
	}
	
	PerformOperation is_prime(){
		return a -> {
			int factors = 0;
			for(int i = 1; i < a; i++){
				if(a % i == 0)
					factors++;
				if(factors > 2)
					return false;
			}
			if(factors == 2)
				return true;
			else
				return false;
		};
	}
}

public class Lambda {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.is_odd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.is_prime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.is_palindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}


