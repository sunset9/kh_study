package java06_class.manage.ver2;

import java.util.Scanner;

import java06_class.manage.Student;

public class StudentService_ver2 {

	private Student[] stuArr;
	private Scanner sc;
	
	public StudentService_ver2() {
		stuArr = new Student[3];
		for (int idx = 0 ; idx<stuArr.length; idx++) {
			stuArr[idx] = new Student();
		}
		sc = new Scanner(System.in);
	}
	
	private int getIdx() {
		int idx;
		do {
			System.out.print("�� ��° �л�?");
			idx = sc.nextInt();
			sc.nextLine();
			if(idx<1 ||idx>3) {
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}while(idx<1 ||idx>3);
		
		return idx -1;
	}
	
	private void insertInfo(Student stu, int idx) {
		System.out.printf("=== %d��° �л� ���� �Է� ===\n", idx+1);
		System.out.printf("�̸� �Է�: ");
		stu.setName(sc.nextLine());
		System.out.printf("���� �Է�: ");
		stu.setAge(sc.nextInt());sc.nextLine();
		
	}
	
	public void insertInfoAll() {
		for (int idx = 0 ; idx<stuArr.length; idx++) {
			
			insertInfo(stuArr[idx], idx);
		}
	}
	
	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr[idx], idx);
	}
	
	private void insertScore(Student stu, int idx) {
		System.out.printf("=== %d��° ���� ���� �Է� ===\n", idx+1);
		System.out.printf("���� ����: ");
		stu.setKor(sc.nextInt());
		System.out.printf("���� ����: ");
		stu.setEng(sc.nextInt());
		System.out.printf("���� ����: ");
		stu.setMath(sc.nextInt());sc.nextLine();
		
		calcSum(stu);
		calcAvg(stu);
	}
	
	public void insertScoreAll() {
		for (int idx = 0 ; idx<stuArr.length; idx++) {
			insertScore(stuArr[idx], idx);
		}
	}
	
	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr[idx], idx);
	}
	
	public void insertStu() {
		int idx = getIdx();
		insertInfo(stuArr[idx], idx);
		insertScore(stuArr[idx], idx);
	}
	
	public void insertStuAll() {
		for (int idx = 0 ; idx<stuArr.length; idx++) {
			insertInfo(stuArr[idx], idx);
			insertScore(stuArr[idx], idx);
		}
	}
	
	private void calcSum(Student stu) {
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
	}
	
	private void calcAvg(Student stu) {
		stu.setAvg(stu.getSum() / (double)3);
	}
	
	public void printStu(Student stu, int idx) {
		System.out.printf("=== %d��° �л� ���� ���� ��� ===\n", idx +1);
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getKor()+"\t"+stu.getEng()+"\t"+stu.getMath()
			+"\t"+stu.getSum()+"\t"+stu.getAvg());
//		System.out.println("�̸�: " + stu.getName());
//		System.out.println("����: " + stu.getAge());
//		System.out.println("����: " + stu.getKor());
//		System.out.println("����: " + stu.getEng());
//		System.out.println("����: " + stu.getMath());
//		System.out.println("����: " + stu.getSum());
//		System.out.println("���: " + stu.getAvg());
	}
	
	public void printStuAll() {
		for (int idx = 0 ; idx<stuArr.length; idx++) {
			printStu(stuArr[idx], idx);
		}
	}
	
	public void printStuIdx() {
		int idx = getIdx();
		printStu(stuArr[idx], idx);
	}
}
