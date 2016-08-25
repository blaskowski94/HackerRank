
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StudentPriority {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Compare comp = new Compare();
		PriorityQueue<newStudent> pq = new PriorityQueue<newStudent>(comp);
		for (int i = 0; i < n; i++) {
			String event = scan.next();
			if (event.equals("ENTER")) {
				newStudent temp = new newStudent(scan.next(), scan.nextDouble(), scan.nextInt());
				pq.offer(temp);
			} else if (event.equals("SERVED")) {
				pq.poll();
			} else
				System.out.println("Not entered or served");
		}
		int temp = pq.size();
		if (temp == 0) {
			System.out.println("EMPTY");
		} else {
			for (int i = 0; i < temp; i++) {
				System.out.println(pq.poll().name);
			}
		}
		scan.close();
	}
}

class newStudent {

	String name;
	double gpa;
	int token;

	public newStudent(String name, double gpa, int token) {
		this.name = name;
		this.gpa = gpa;
		this.token = token;
	}

	public newStudent() {
		name = "";
		gpa = 0.0;
		token = 0;
	}

}

class Compare implements Comparator<newStudent> {
	@Override
	public int compare(newStudent o1, newStudent o2) {
		if (o1.gpa < o2.gpa)
			return 1;
		else if (o1.gpa > o2.gpa)
			return -1;
		else {
			if (o1.name.compareTo(o2.name) != 0)
				return o1.name.compareTo(o2.name);
			else {
				if (o1.token < o2.token)
					return 1;
				else
					return -1;
			}
		}
	}
}
