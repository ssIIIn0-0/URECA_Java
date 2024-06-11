package ch04.sec03;

public class SwitchExample2 {

	public static void main(String[] args) {
		int num = 5;
		
		switch(num) {
			case 1:	System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3:	System.out.println("3"); break;
			case 4:	System.out.println("4"); break;
			case 5:	System.out.println("5"); break;
			case 6:	System.out.println("6"); break;
			default:	System.out.println("default"); break;
		}
		
		String str = "2";

		switch(str) {
			case "1":	System.out.println("1"); break;
			case "2":	System.out.println("2"); break;
			case "3":	System.out.println("3"); break;
			default:	System.out.println("default"); break;
		}
		
		char ch = 'B';
		switch(ch) {
		case 'A':	System.out.println("A"); break;
		case 'B':	System.out.println("B"); break;
		case 'C':	System.out.println("C"); break;
		default:	System.out.println("default"); break;
	}

	}

}