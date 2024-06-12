package ch06.sec11.ex01;

public class KoreanExample {

	public static void main(String[] args) {
//		Korean k1 = new Korean(); Korean은 생성자를 만들었기 때문에 파라미터를 넣어야한다
		Korean k1 = new Korean("111111-111111", "유레카");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "aaa";	// name은 final아님
		System.out.println(k1.name);

	}

}
