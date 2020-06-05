
class Person {

	String name;
	public Person(String name) {

		this.name = name;

	}

}



class Student extends Person {
	
	public Student(String name) {

		super(name);

	}

}



public class Tester {

	public static void main(String[] args) {

		Person p= new Person("사람");

		Student s = new Student("학생");

		p = s; 		

		System.out.println(p.name);
		System.out.println(s.name);
		


		
	}

}