package java10_api;

public class StringEx {
	public static void main(String[] args) {
		
		String str1= "Apple";
		String str2 = new String("Banana");
		
		System.out.println("----length()----");
		System.out.println("str1 ����: " + str1.length());
		System.out.println("str2 ����: " + str2.length());
		System.out.println("Cherry ����: " + "Cherry".length());
		
		System.out.println("\n----equals()----");
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("Cherry.equals(str1): " + "Cherry".equals(str1));
		System.out.println("Apple.equals(str1): " + "Apple".equals(str1));
		
		System.out.println("\n----toLowerCase()----");
		//str1�� ��� �ҹ��ڷ� ��ȯ�Ͽ� ���
		
		String lower = str1.toLowerCase();
		System.out.println(lower);
		
		System.out.println("\n----toUpperCase()----");
		//str1�� ��� �빮�ڷ� ��ȯ�Ͽ� ���
		String upper = str1.toUpperCase();
		System.out.println(upper);
		
		System.out.println("\n---------------------");
		// "Hello Java"���� J �� ��
		// char���� ch�� ����, ��� (charAt)
		
		char ch = "Hello Java".charAt(6);
		System.out.println(ch);

		// str1�� ", HIHIHI" ��� ���ڿ� �߰��ϰ� ���
//		str1 = str1 + ", HIHIHI";
		str1 = str1.concat(", HIHIHI");
		System.out.println(str1);

		// 'A'�� 'a'�� ��ȯ
		str1 = str1.replace("A", "A".toLowerCase());
		System.out.println(str1);

		// "ple"�� "PLE"�� ��ȯ
		str1 = str1.replace("ple", "ple".toUpperCase());
		System.out.println(str1);

		// "PL" ã�Ƽ� ��� (substring)
		System.out.println(str1.substring(str1.indexOf("PL"),"PL".length()+2));

		// str1�� "pP"�� �ִ��� �Ǻ�
		if(str1.contains("pP")) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println("\n----trim()----");
		// trim(): ���ڿ��� �� , �ڿ� �����ϴ� ' ' (space) �������ִ� ����
		String trimData = "    AAA B 3Se R   ";
		System.out.println(trimData.trim());
		
		System.out.println("\n----split()----");
		// split(): ���ڿ��� Ư�� �����ڸ� �������� ���ڿ��� ����� �迭�� ��ȯ�ϴ� �޼ҵ�
		String splitDate = "A,B,C,D,E";
		String[] splited = splitDate.split(",");
		for (String str : splited) {
			System.out.println(str);
		}

		
	}
} 
