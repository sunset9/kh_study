package java12_generics;

class Parent<T>{
	T data;
}

class child1 extends Parent<String>{
	// data1의 타입이 String 으로 상속된다
}

class child2<K> extends Parent<K>{
	// 상속받은 제네릭 타입 결정 미루기
}

class child3<M,N> extends Parent<M>{
	// M : 상속받은 제네릭 미결정
	// N : 자식클래스만의 제네릭 타입
}

public class GenericsEx_08_Inheritance {
	public static void main(String[] args) {
				
	}
	
}
