package ch12.sec03.ex02;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(10, "시은");
		Student s2 = new Student();
		s2.setNo(20);
		s2.setName("씬");
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
