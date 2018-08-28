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
			System.out.println("더이상 넣을 수 없습니다. (" + element +")");
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
		if(idx == arr.length) { // 끝까지 못찾은 경우
			System.out.println("지우려는 값이 존재하지 않습니다.");
			return;
		}
		for(int i = idx ; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
			if(arr[i] == null) break; // 가르키는 노드가 null 이면 더이상 당기지않아도 됨.(그 뒤도 null이기 때문)
			if((i+1  == arr.length -1) && arr[i+1] != null) {// 마지막 전 노드까지 왔고, 마지막 노드가 null이 아니면.
				arr[i+1] = null; // 마지막 노드 null로 줌( 한칸 땡겼으니까)
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
