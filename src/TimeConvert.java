

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConvert {
	
	public static void main(final String[] args) throws ParseException {
		final Scanner scan = new Scanner(System.in);
		final String time = scan.nextLine();
		final SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
		final SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
		final Date date = parseFormat.parse(time);
		System.out.println(outputFormat.format(date));
	}
	
}
