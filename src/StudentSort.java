import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		Comp checker = new Comp();
		ArrayList<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		studentList.sort(checker);
		for (Student st : studentList) {
			System.out.println(st.name);
		}
		in.close();
	}

}

class Student {

	int ID;
	String name;
	double gpa;

	public Student(int ID, String name, double gpa) {
		this.ID = ID;
		this.name = name;
		this.gpa = gpa;
	}

}

class Comp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.gpa < o2.gpa)
			return 1;
		else if (o2.gpa < o1.gpa)
			return -1;
		else {
			if (o1.name.equals(o2.name)) {
				if (o1.ID < o2.ID)
					return 1;
				else
					return -1;
			} else
				return o1.name.compareTo(o2.name);
		}
	}

}
