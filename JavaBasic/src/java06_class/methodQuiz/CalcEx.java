package java06_class.methodQuiz;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		
		Calculatator calc = new Calculatator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 > ");
		op = sc.nextLine().charAt(0);
		System.out.print("피연산자1 > ");
		num1 = sc.nextInt();
		System.out.print("피연산자2 > ");
		num2 = sc.nextInt();
		
		if(op != '+' && op != '-'&& op != '*'&& op != '/') {
			System.out.println("연산자를 잘못 입력하셨습니다.");
			return;
		}
		
		switch(op) {
		case '+':
			System.out.println(num1+"+"+num2+"="+calc.sum(num1,num2));
			break;
		
		case '-':
			System.out.println(num1+"-"+num2+"="+calc.sub(num1,num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+calc.mul(num1,num2));
			break;
		case '/':
			System.out.println(num1+"/"+num2+"="+calc.div(num1,num2));
			break;
//		default:
//			System.out.println("연산자를 잘못 입력하셨습니다.");
//			break;
		}
		
	}

}
