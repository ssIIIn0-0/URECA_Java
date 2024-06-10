package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 10;
		if(v1 > 10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}
		//System.out.println(v2);	// 이건 오류
		// 이게 오류가 안나려면, v2를 if문 밖에 변수 선언, 초기화 해주기
	}
}
// 로컬 변수는 반드시 사용전에 값이 지정되어 있어야 한다.
