package ch12.sec03.ex04;

// 원래 필드, setter, getter.. 적어야하는데! record는 알아서 해줌
// 하지만, 롬복 Lombok 이라는 걸 더 많이 써서 record는 많이 쓰지 않는다.
public record Member(String id, String name, int age) {
	// 필드도 함수 이름 옆 파라미터에 적음
}
