package ch06.sec14;
// lombok : 귀찮은걸 대신 해줌
// @Setter
// @Getter 이런식으로 사용하면 눈에는 get, set이 안보이지만, 내부적으로 만들어져있음

public class MyClass {
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int n5;
	private int n6;
	private int n7;

//	우클릭 -> source -> Generate Getter & Setter 이거 누르면
//	한번에 만들어줌
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}
	public int getN6() {
		return n6;
	}
	public void setN6(int n6) {
		this.n6 = n6;
	}
	public int getN7() {
		return n7;
	}
	public void setN7(int n7) {
		this.n7 = n7;
	}
}
