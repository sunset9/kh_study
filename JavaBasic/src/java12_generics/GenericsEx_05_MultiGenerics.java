package java12_generics;

class Class05<T1, T2>{
	private T1 data1;
	private T2 data2;
	
	public <K1, K2> K2 change(K1 data) {
		K2 result = (K2) data;
		
		return result;
		
	}
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
}

public class GenericsEx_05_MultiGenerics {
	public static void main(String[] args) {
		
		Class05<Integer, String> c5 = new Class05<>();
		
		c5.setData1(111);
		c5.setData2("aa");
		
		Integer data = 100;
		Double res = c5.change(data);
				
		
				
	}
}
