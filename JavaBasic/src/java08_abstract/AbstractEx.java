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
		System.out.println(" ����, "+ major+" ����" );
	}
	
}

class Student extends Person{
	private String subject;
	
	public Student(String subject) {
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println(" �л�, "+ subject+" ������" );
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
//		Person p = new Person();
		
		Person[] arr = new Person[2];
		
		arr[0] = new Student("�ڹ�");
		arr[1] = new Professor("��ǻ�Ͱ���");
		
		arr[0].display();
		arr[1].display();
	}
}
