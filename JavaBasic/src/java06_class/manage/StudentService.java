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
		System.out.println("=== 학생 정보 입력 ===");
		System.out.printf("이름 입력: ");
		stu.setName(sc.nextLine());
		System.out.printf("나이 입력: ");
		stu.setAge(sc.nextInt());
	}
	
	public void insertScore() {
		System.out.println("=== 점수 정보 입력 ===");
		System.out.printf("국어 성적: ");
		stu.setKor(sc.nextInt());
		System.out.printf("영어 성적: ");
		stu.setEng(sc.nextInt());
		System.out.printf("수학 성적: ");
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
		System.out.println("=== 학생 종합 정보 출력 ===");
		System.out.println("이름: " + stu.getName());
		System.out.println("나이: " + stu.getAge());
		System.out.println("국어: " + stu.getKor());
		System.out.println("영어: " + stu.getEng());
		System.out.println("수학: " + stu.getMath());
		System.out.println("총점: " + stu.getSum());
		System.out.println("평균: " + stu.getAvg());
	}
}
