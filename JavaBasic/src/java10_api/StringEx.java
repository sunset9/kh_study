package java10_api;

public class StringEx {
	public static void main(String[] args) {
		
		String str1= "Apple";
		String str2 = new String("Banana");
		
		System.out.println("----length()----");
		System.out.println("str1 길이: " + str1.length());
		System.out.println("str2 길이: " + str2.length());
		System.out.println("Cherry 길이: " + "Cherry".length());
		
		System.out.println("\n----equals()----");
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("Cherry.equals(str1): " + "Cherry".equals(str1));
		System.out.println("Apple.equals(str1): " + "Apple".equals(str1));
		
		System.out.println("\n----toLowerCase()----");
		//str1을 모두 소문자로 변환하여 출력
		
		String lower = str1.toLowerCase();
		System.out.println(lower);
		
		System.out.println("\n----toUpperCase()----");
		//str1을 모두 대문자로 변환하여 출력
		String upper = str1.toUpperCase();
		System.out.println(upper);
		
		System.out.println("\n---------------------");
		// "Hello Java"에서 J 값 얻어서
		// char변수 ch에 저장, 출력 (charAt)
		
		char ch = "Hello Java".charAt(6);
		System.out.println(ch);

		// str1에 ", HIHIHI" 라는 문자열 추가하고 출력
//		str1 = str1 + ", HIHIHI";
		str1 = str1.concat(", HIHIHI");
		System.out.println(str1);

		// 'A'을 'a'로 변환
		str1 = str1.replace("A", "A".toLowerCase());
		System.out.println(str1);

		// "ple"를 "PLE"로 변환
		str1 = str1.replace("ple", "ple".toUpperCase());
		System.out.println(str1);

		// "PL" 찾아서 출력 (substring)
		System.out.println(str1.substring(str1.indexOf("PL"),"PL".length()+2));

		// str1에 "pP"가 있는지 판별
		if(str1.contains("pP")) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		
		System.out.println("\n----trim()----");
		// trim(): 문자열의 앞 , 뒤에 존재하는 ' ' (space) 제거해주는 역할
		String trimData = "    AAA B 3Se R   ";
		System.out.println(trimData.trim());
		
		System.out.println("\n----split()----");
		// split(): 문자열의 특정 구분자를 기준으로 문자열을 나누어서 배열로 반환하는 메소드
		String splitDate = "A,B,C,D,E";
		String[] splited = splitDate.split(",");
		for (String str : splited) {
			System.out.println(str);
		}

		
	}
} 
