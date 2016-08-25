
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

class Output{
	public void display(double n){
		System.out.printf("%.3f", n);
		System.out.println();
	}
}

class Calculate{
    Scanner scan = new Scanner(System.in);
    NumberFormatException e = new NumberFormatException("All the values must be positive");
	Output output = new Output();
    
    int get_int_val() throws IOException{
    	int temp = scan.nextInt();
        if(temp <= 0){
        	throw e;
        }
        else
        	return temp;
    }
    
    double get_double_val() throws NumberFormatException{
    	double temp = scan.nextDouble();
        if(temp <= 0){
        	throw e;
        }
        else
        	return temp;
    }
    
    static Calculate do_calc(){
    	return new Calculate();
    }
    
    // cube volume
    double get_volume(int a){
		return a * a * a; 
    }
    
    //cuboid volume
    double get_volume(int l, int b, int h){
        return l * b * h;
    }
    
    //hemisphere volume
    double get_volume(double r){
        return (2 * Math.PI * r * r * r) / 3;
    }
    
    //cylinder volume
    double get_volume(double r, double h){
        return Math.PI * r * r * h;
    }
}

public class Volume {

	 public static void main(String[] args) {
	   DoNotTerminate.forbidExit();
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (IOException e) {
	    e.printStackTrace();
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
} //end of Do_Not_Terminate