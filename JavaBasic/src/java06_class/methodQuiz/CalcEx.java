package java06_class.methodQuiz;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		
		Calculatator calc = new Calculatator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ > ");
		op = sc.nextLine().charAt(0);
		System.out.print("�ǿ�����1 > ");
		num1 = sc.nextInt();
		System.out.print("�ǿ�����2 > ");
		num2 = sc.nextInt();
		
		if(op != '+' && op != '-'&& op != '*'&& op != '/') {
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
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
//			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
//			break;
		}
		
	}

}
