package java09_innerClass.quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];

	@Override
	public void add(String element) {
		int idx;
		for(idx = 0; idx < arr.length; idx++) {
			if(arr[idx] == null) {
				arr[idx] = element;
				break;
			}
		}
		if(idx == arr.length) {
			System.out.println("���̻� ���� �� �����ϴ�. (" + element +")");
			return;
		}
	}

	@Override
	public void remove(String element) {
		int idx = 0;
		for(idx = 0; idx < arr.length; idx++) {
			if(arr[idx].equals(element)) {
				break;
			}
		}
		if(idx == arr.length) { // ������ ��ã�� ���
			System.out.println("������� ���� �������� �ʽ��ϴ�.");
			return;
		}
		for(int i = idx ; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			if(arr[i] == null) break; // ����Ű�� ��尡 null �̸� ���̻� ������ʾƵ� ��.(�� �ڵ� null�̱� ����)
			if((i+1  == arr.length -1) && arr[i+1] != null) {// ������ �� ������ �԰�, ������ ��尡 null�� �ƴϸ�.
				arr[i+1] = null; // ������ ��� null�� ��( ��ĭ �������ϱ�)
			}
		}
	}

	@Override
	public String get(int idx) {
		if(arr[idx] == null) {
			return null;
		}else {
			return arr[idx];
		}
	}

	@Override
	public int find(String element) {
		int i;
		for (i = 0; i<arr.length;i++) {
			if(arr[i] != null && arr[i].equals(element)) {
				break;
			}else if(arr[i] == null) {
				return -1;
			}
		}
		return i;
	}

	@Override
	public void print() {
		for (String str : arr) {
			if(str == null) break;
			System.out.printf(str + " ");
		}
		System.out.println();
	}
		
}
