package ch12.sec03.ex05;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// lombok : dto 같은 클래스를 만들 때 귀찮음 메소드, 생성자 선언을 도와준다.

@Getter
@Setter
@ToString
@Data
public class Member {
	private String id;
	private String name;
	private int age;
}
