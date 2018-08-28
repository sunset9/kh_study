package java06_class.manage;

import java.util.Scanner;

public class StudentService {

	private Student stu;
	private Scanner sc;
	
	public StudentService() {
		stu = new Student();
		sc = new Scanner(System.in);
	}
	
	public void insertInfo() {
		System.out.println("=== �л� ���� �Է� ===");
		System.out.printf("�̸� �Է�: ");
		stu.setName(sc.nextLine());
		System.out.printf("���� �Է�: ");
		stu.setAge(sc.nextInt());
	}
	
	public void insertScore() {
		System.out.println("=== ���� ���� �Է� ===");
		System.out.printf("���� ����: ");
		stu.setKor(sc.nextInt());
		System.out.printf("���� ����: ");
		stu.setEng(sc.nextInt());
		System.out.printf("���� ����: ");
		stu.setMath(sc.nextInt());
		
		calcSum();
		calcAvg();
	}
	
	private void calcSum() {
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
	}
	
	private void calcAvg() {
		stu.setAvg(stu.getSum() / (double)3);
	}
	
	public void printStu() {
		System.out.println("=== �л� ���� ���� ��� ===");
		System.out.println("�̸�: " + stu.getName());
		System.out.println("����: " + stu.getAge());
		System.out.println("����: " + stu.getKor());
		System.out.println("����: " + stu.getEng());
		System.out.println("����: " + stu.getMath());
		System.out.println("����: " + stu.getSum());
		System.out.println("���: " + stu.getAvg());
	}
}
