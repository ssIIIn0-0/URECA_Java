package ch12.sec03.ex04;

public class MemberExample {
	public static void main(String[] args) {
		Member m = new Member("winter", "눈", 25);
		Member m2 = new Member("winter", "눈", 25);
		
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m);	// toString
		System.out.println(m.hashCode());
		System.out.println(m.equals(m2));
	}
}
