package ch04.sec07;

import java.util.Iterator;

public class BreakContinueExample {

	public static void main(String[] args) {
		// break
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) break;
		}
		
		// continue 5 만나면 skip
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
		
		// nested
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 5) continue;
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}

	}

}
