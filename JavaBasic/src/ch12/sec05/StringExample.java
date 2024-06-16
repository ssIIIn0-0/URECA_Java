package ch12.sec05;

import java.util.StringTokenizer;

public class StringExample {

	public static void main(String[] args) {
		// 문자열 출력시 원래는 이렇게 하지만, 
		String result = "Hello" + "World" + "AAA";
		
		// 앞으로는 StringBuilder 을 이용해서 출력하자 
//		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb = new StringBuilder();
		
		// old style
//		sb.append("Hello");
//		sb.append("World");
//		sb.append("AAA");
		
		// new style, method chain pattern
		sb.append("Hello")
			.append("Wolrd")
			.append("AAA");	
		System.out.println(sb);
		
		// 반복문
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			String str = " " + i;
			ans.append(str);
		}
		System.out.println(ans);
		
		// StringTokenizer
		String str = "시은,씬,시논";
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// 이걸 알고리즘 풀때 유용하게 사용할 수 있음
		int N = 5;
		String input = "10 27 5 4 19";
		StringTokenizer st2 = new StringTokenizer(input);
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st2.nextToken());
			System.out.println(num);
		}
	}

}
