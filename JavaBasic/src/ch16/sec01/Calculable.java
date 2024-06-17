package ch16.sec01;

@FunctionalInterface
// 이 어노테이션 설정하면 메소드는 1개만 가능
public interface Calculable {
	void calculate(int x, int y);
}
