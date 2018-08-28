package java05_array;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		// 2.1 -------------------
		System.out.println("------1------");
		int[] invert_arr = new int[arr.length];

		for (int i = 0 ; i < invert_arr.length; i++) {
			invert_arr[i] = arr[arr.length - i -1];
		}
		
		System.out.print("invert_arr : ");
		for (int el : invert_arr) {
			System.out.print(el + " ");
		}
		System.out.println();
		
		// 2.2  -------------------
		System.out.println("------2------");
		int res = 0;
		for (int i = 0 ; i < arr.length; i++) {
			if(i%2 != 0) { // 홀수일때
				res -= arr[i];
			}else {
				res += arr[i];
			}
		}
		System.out.println(res);
	
		// 2.3  -------------------		
		System.out.println("------3------");
		int[] rank_arr = new int[arr.length];
		Arrays.fill(rank_arr, 1);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j =0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					rank_arr[j]++;
				}
			}
		}
		System.out.print("rank_arr : ");
		for (int el:rank_arr)
			System.out.print(el + " ");
		System.out.println();
		
		// 2.4  -------------------	
		System.out.println("------4------");
		int[] sort_arr = new int[arr.length];
		System.arraycopy(arr, 0, sort_arr, 0, arr.length);
		Arrays.sort(sort_arr);
		
		int[] over_arr = new int[sort_arr.length];
		int[] ret_arr = new int[sort_arr.length];
		
		int over_arr_index = 0;
		int ret_arr_index = 0;
		int ret_num = -1;
//		for (int i = 0; i<sort_arr.length;i++) {
//			// 맨 마지막 index 처리
//			if(i == sort_arr.length -1) {
//				if(sort_arr[i-1] != sort_arr[i]) {
//					ret_arr[ret_arr_index++] = sort_arr[i];
//					break;
//				}
//			}
//			if (sort_arr[i] != sort_arr[i+1]) { 
//				if (sort_arr[i] == ret_num) {
//					continue;
//				}
//				ret_arr[ret_arr_index++] = sort_arr[i];
//			}else {
//				ret_num = sort_arr[i];
//				over_arr[over_arr_index++] = sort_arr[i++];
//			}
//		}
		for (int i = 0; i<sort_arr.length;i++) {
			if(i<sort_arr.length-1 && sort_arr[i] == sort_arr[i+1]) {
				while(i<sort_arr.length-1 && sort_arr[i] == sort_arr[i+1]) {
					i++;
				}
				over_arr[over_arr_index++] = sort_arr[i];
			}else {
				ret_arr[ret_arr_index++] = sort_arr[i];
			}
		}
//		System.out.printf("sort_arr: ");
//		for (int el:sort_arr) {
//			System.out.print(el + " ");
//		}
//		System.out.println();
		System.out.printf("over_arr: ");
		for (int el:over_arr) {
			System.out.print(el + " ");
		}
		System.out.println();
		System.out.printf("ret_arr: ");
		for (int el:ret_arr) {
			System.out.print(el + " ");
		}
	}

}

