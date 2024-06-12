package ch07.sec04.ex01;

public class Computer extends Calculator{
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer areaCircle()");
		return Math.PI*r*r;
	}
}
