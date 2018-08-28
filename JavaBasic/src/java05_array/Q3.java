package java05_array;

public class Q3 {

	public static void main(String[] args) {

		// 1 ---------------
		System.out.println("Q1.");
		int[][] arr = new int[5][5];

		int num = 1;
		
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				arr[i][j] = num++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 2 ---------------
		System.out.println("\nQ2.");
		num = 1;
		
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=4; j>=0; j-- ) {
				arr[i][j] = num++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
		
		// 3 ---------------
		System.out.println("\nQ3.");
		num = 1;
		
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				arr[j][i] = num++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}	
		
		// 4 ---------------
		System.out.println("\nQ4.");
		num = 1;
		
		// 입력부
		for( int i=0; i<5; i++ ) {
			for( int j=4; j>=0; j-- ) {
				arr[j][i] = num++;
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 5 ---------------
		System.out.println("\nQ5.");
		num = 1;
		
		int m = 0;
		int n = 0;
		int mSign = 1;
		int nSign = 1;
		int hMax = arr.length -1;
		int hMin = 0;
		int vMax = arr.length -1;
		int vMin = 1;
		
		for (int k = 0 ; k<25; k++) {
			arr[m][n] = num++;
			if(mSign *nSign >0) {
				if(((n >= hMax) && nSign >0) || ((n<=hMin)&& nSign<0)){
					if(nSign>0 ) hMax --;
					else hMin ++;
					nSign *= -1;
					m = m+ (mSign *1);
					continue;
				}
				n = n+ (nSign *1);
			}else {
				if(((m >= vMax) && (mSign >0)) || ((m<=vMin) && (mSign <0))) {
					if(mSign>0) vMax--;
					else vMin++;
					mSign *= -1;
					n = n+ (nSign *1);
					continue;
				}
				m = m+ (mSign *1);
			}
		}
		
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
