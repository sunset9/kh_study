package java12_generics;

class Parent<T>{
	T data;
}

class child1 extends Parent<String>{
	// data1�� Ÿ���� String ���� ��ӵȴ�
}

class child2<K> extends Parent<K>{
	// ��ӹ��� ���׸� Ÿ�� ���� �̷��
}

class child3<M,N> extends Parent<M>{
	// M : ��ӹ��� ���׸� �̰���
	// N : �ڽ�Ŭ�������� ���׸� Ÿ��
}

public class GenericsEx_08_Inheritance {
	public static void main(String[] args) {
				
	}
	
}
