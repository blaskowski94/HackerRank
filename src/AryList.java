import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AryList {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<int[]> a = new ArrayList<int[]>(n);
		for(int i = 0; i < n; i++){
			int d = scan.nextInt();
			int[] e = new int[d];
			for(int j = 0; j < d; j++){
				e[j] = scan.nextInt();
			}
			a.add(e);
		}
		
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			int x = scan.nextInt()-1;
			int y = scan.nextInt()-1;
			
			try{
				int z = a.get(x)[y];
				System.out.println(z);
			}catch(Exception e){
				System.out.println("ERROR!");
			}
		}
		
		scan.close();
		

	}

}
