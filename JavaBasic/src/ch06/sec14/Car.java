package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	// private 변수를 외부 객체에서 사용할 수 있도록 getter, setter을 사용
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
//			this.stop = true;
			setStop(true);
		}else {
			this.speed = speed;
//			this.stop = false;
			setStop(false);
		}
	}
	
	public boolean isStop() {	// boolean 타입은 get -> is로 작성
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}

// setter, getter은 형식적으로 존재하는 자체가 중요한 것이다.
// 사실 setter, getter의 기능자체는 별거 없다. 오히려 쓸몽없는 코드 줄수만 늘리는 것처럼 보인다.
// 하지만, setter, getter가 있으므로써 캡슐화 형식을 지킬 수 있다.