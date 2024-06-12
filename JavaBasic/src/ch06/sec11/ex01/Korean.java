package ch06.sec11.ex01;

public class Korean {
	final String nation = "korea";	// 불변!
	final String ssn;	// 오류 -> 오류X <= 생성자에서 ssn값이 정해진다
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	// 다형성에 의해서 생성자 여러개 만들 수 있는데 왜 오류나?
	// -> 생성자가 여러개인건 ㄱㅊ 근데 생성자1과 2에 둘다 ssn이 들어가있지?
	// 그럼 fianl로 저장한 ssn이 변경될 위험이 있어서 오류가 발생해
//	public Korean(String nation, String ssn, String name) {
//		this.nation = nation;
//		this.ssn = ssn;
//		this.name = name;
//	}
//	
}
