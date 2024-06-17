package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
		// 파라미터 new Applicant<Person>(new Person())는 Applicant.java에 정의한 거임 

		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
//		registerCourse2는 Student의 하위 클래스만 가능
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
//		registerCourse3는 Worker의 상위 클래스만 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

}
