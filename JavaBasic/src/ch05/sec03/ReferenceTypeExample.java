package ch05.sec03;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 다차원 배열
		int[] intArr1 = new int[4];			// 1차원 배열
		int[][] intArr2 = new int[4][]; 	// 2차원 배열
		int[][][] intArr3 = new int[4][][]; 	// 3차원 배열
		
		intArr2[0] = new int[3];
		intArr2[2] = new int[10];
		
		
	}

}
