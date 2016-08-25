
import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}
		double pos = 0;
		double neg = 0;
		double zero = 0;
		for(int i = 0; i < n; i++){
			if(a[i] > 0)
				pos++;
			else if(a[i] < 0)
				neg++;
			else
				zero++;
		}
		double posFrac = pos/n;
		double negFrac = neg/n;
		double zeroFrac = zero/n;
		System.out.println(posFrac);
		System.out.println(negFrac);
		System.out.println(zeroFrac);
	}

}
