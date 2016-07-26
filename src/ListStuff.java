import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ListStuff {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<Integer>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            l.add(scan.nextInt());
        }

        int q = scan.nextInt();
        
        for(int i = 0; i < q; i++){
        	scan.nextLine();
        	String temp = scan.nextLine();
        	if(temp.equals("Insert")){
        		l.add(scan.nextInt(), scan.nextInt());
        	}
        	else if(temp.equals("Delete")){
        		l.remove(scan.nextInt());
        	}
        }
      
        for(int i = 0; i < l.size(); i++){
        	System.out.print(l.get(i) + " ");
        }
        
        
        scan.close();
    }
}