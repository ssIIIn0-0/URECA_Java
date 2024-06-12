package ch07.sec08.ex01;

public class Car {
	public Tire tire;	// has a 관계, Tire, Hankook, Kumho 객체가 다 온다
	
	public void run() {
		tire.roll();
	}
}
