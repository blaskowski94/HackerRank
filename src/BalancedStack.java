import java.util.Scanner;
import java.util.Stack;

public class BalancedStack {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		while(scan.hasNextLine()){
			String input = scan.nextLine();
			boolean flag = true;
			for(int i = 0; i < input.length(); i++){
				if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{'){
					s.push(input.charAt(i));
				}
				else if(input.charAt(i) == ')'){
					if(!s.isEmpty() && s.peek() == '('){
						s.pop();
					}
					else{
						flag = false;
					}
				}
				else if(input.charAt(i) == ']'){
					if(!s.isEmpty() && s.peek() == '['){
						s.pop();
					}
					else{
						flag = false;
					}
				}
				else if(input.charAt(i) == '}'){
					if(!s.isEmpty() && s.peek() == '{'){
						s.pop();
					}
					else{
						flag = false;
					}
				}
			}
			if(flag && s.isEmpty()){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
			s.clear();

		}
		scan.close();
	}

}
