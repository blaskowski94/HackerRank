
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStuff {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		try{
			int x = scan.nextInt();
			int y = scan.nextInt();
			int div = x/y;
			System.out.println(div);
		}catch(InputMismatchException e){
			System.err.println("java.util.InputMismatchException");
		}catch(ArithmeticException e){
			System.err.println(e.toString());
		}
	}
}
