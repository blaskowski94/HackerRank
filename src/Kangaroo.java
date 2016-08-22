import java.util.Scanner;

public class Kangaroo {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x1 = scan.nextLong();
		long v1 = scan.nextLong();
		long x2 = scan.nextLong();
		long v2 = scan.nextLong();
		boolean flag = false;
		
		for(long i = 0; i < Integer.MAX_VALUE; i++){
			long pos1 = x1+(i*v1);
			long pos2 = x2+(i*v2);
			if(pos1 == pos2){
				System.out.println(i);
				System.out.println(pos1);
				System.out.println(pos2);
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	scan.close();
	}
	
}
