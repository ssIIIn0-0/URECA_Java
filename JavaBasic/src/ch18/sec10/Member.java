package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	// 이 버전 아이디를 2L로 바꾸면 출력이 안됨.

	private String id;
	private String name;
	// transient : 객체직렬화 과정에서 민감한 데이터는 빼놓을 수 있음
	// 이걸 써서 출력에서는 ssn = null로 나옴
	private transient String ssn;
	
	public Member(String id, String name, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.ssn  = ssn;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
	}

	

	
}
