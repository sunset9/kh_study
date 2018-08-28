package java08_abstract;

//abstract class Person{
//	protected String name;
//
//	public abstract void display();
//	
//}

class Professor extends Person{
	private String major;
	
	public Professor(String major) {
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println(" 교수, "+ major+" 전공" );
	}
	
}

class Student extends Person{
	private String subject;
	
	public Student(String subject) {
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println(" 학생, "+ subject+" 수강중" );
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
//		Person p = new Person();
		
		Person[] arr = new Person[2];
		
		arr[0] = new Student("자바");
		arr[1] = new Professor("컴퓨터공학");
		
		arr[0].display();
		arr[1].display();
	}
}
