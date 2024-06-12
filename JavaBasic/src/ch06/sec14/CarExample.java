package ch06.sec14;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
//		car.speed = 10;	// 외부에서 car 객체의 필드를 변경
//		
//		// 외부에서 car 객체의 필드를 조회
//		System.out.println("car.stop " + car.stop);
		
		// getter, setter을 사용하므로써,
		// private 변수 자체를 지킬 수 있고,
		// 수천개의 코드를 뒤질 필요 없이 setter, getter만 수정해서 변경사항을 추가할 수 있다
		car.setSpeed(-10);
		System.out.println("car.stop " + car.isStop());		// car.stop true
		System.out.println("car.speed " + car.getSpeed());	// car.speed 0
		
		// getter setter을 통해 speed값만 바꿨음에도 stop값도 바뀐걸 볼 수 있다.
	}
}
