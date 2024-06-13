package ch11.sec03;

public class ExceptionTest {

	public static void main(String[] args) {
//		int[][] map = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		String[] array = {"100", "200"};
		
//		for (int i = 0; i < array.length; i++) {
//			try {
//				int value = Integer.parseInt(array[i]);
//				System.out.println(value);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("index 오류");		// for (int i = 0; i <= array.length; i++)
//				e.printStackTrace();	// 오류사항을 콘솔창에 직접찍어주는 기능
//			}catch(NumberFormatException e) {
//				System.out.println("숫자 문자열 오류");	// array = {"100", "20*"};
//			}
//		}
		
		for (int i = 0; i <= array.length; i++) {
			try {
				String s = null;
				s.length();
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("기타 예외 발생");
			}
		}
		
		for (int i = 0; i <= array.length; i++) {
			try {
				String s = null;
				s.length();
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(Exception e) {
				System.out.println("기타 예외 발생");
//			}catch(ArrayIndexOutOfBoundsException e | NumberFormatException e) {
				// Exception 으로 모든 예외를 잡아버리기 때문에 이건 잘못된 구조야! 라고 오류가 발생한다. 
				e.printStackTrace();	// 오류사항을 콘솔창에 직접찍어주는 기능
			}
		}
	}

}

// 그럼 RuntimeException을 try-catch로 처리하는 게 좋은 건가?
// 강사님은 아니라고 생각하심
// 왜? 일단 RuntimeException은 절대 발생하면 안되는 오류임
// 근데 이게 발생할까봐 try-catch를 생성한다?? 이건 말이 안되는거임