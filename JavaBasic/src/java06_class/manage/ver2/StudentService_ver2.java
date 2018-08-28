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
			System.out.print("몇 번째 학생?");
			idx = sc.nextInt();
			sc.nextLine();
			if(idx<1 ||idx>3) {
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}while(idx<1 ||idx>3);
		
		return idx -1;
	}
	
	private void insertInfo(Student stu, int idx) {
		System.out.printf("=== %d번째 학생 정보 입력 ===\n", idx+1);
		System.out.printf("이름 입력: ");
		stu.setName(sc.nextLine());
		System.out.printf("나이 입력: ");
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
		System.out.printf("=== %d번째 점수 정보 입력 ===\n", idx+1);
		System.out.printf("국어 성적: ");
		stu.setKor(sc.nextInt());
		System.out.printf("영어 성적: ");
		stu.setEng(sc.nextInt());
		System.out.printf("수학 성적: ");
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
		System.out.printf("=== %d번째 학생 종합 정보 출력 ===\n", idx +1);
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getKor()+"\t"+stu.getEng()+"\t"+stu.getMath()
			+"\t"+stu.getSum()+"\t"+stu.getAvg());
//		System.out.println("이름: " + stu.getName());
//		System.out.println("나이: " + stu.getAge());
//		System.out.println("국어: " + stu.getKor());
//		System.out.println("영어: " + stu.getEng());
//		System.out.println("수학: " + stu.getMath());
//		System.out.println("총점: " + stu.getSum());
//		System.out.println("평균: " + stu.getAvg());
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
