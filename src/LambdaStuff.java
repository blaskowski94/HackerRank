
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaStuff {
	
	public static void main(String[] args){
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Bob", 22));
		list.add(new Person("Peter", 21));
		list.add(new Person("Greg", 24));
		list.add(new Person("Ernesto", 30));
		list.add(new Person("Megan", 19));
		
		System.out.println(list.toString());
		//list.sort(Comparator.comparing(p -> p.getName()));
		//list.sort(Comparator.comparing(Person::getName));
		list.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
		//Collections.sort(list, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println(list.toString());
	}

}

class Person{
	String name;
	int age;
	
	Person(String n, int a){
		name = n;
		age = a;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	
	@Override
	public String toString(){
		return name + " " + age;
	}
}

//class ComparePersonByName implements Comparator<Person>{
//
//	@Override
//	public int compare(Person p1, Person p2) {
//		return p1.getName().compareTo(p2.getName());
//	}
//	
//}
