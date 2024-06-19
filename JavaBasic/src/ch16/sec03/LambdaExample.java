package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.action1((name, job) -> {
			System.out.print(name + " 이 ");
			System.out.println(job + " 을 합니다.");
		});
		
		
		// 둘이 같음
		person.action2((content) -> {
			System.out.println(content + " 라고 말합니다. ");
		});
		
		// 소괄호, 중괄호 생략, 중괄호 안에 있는 ; 생략
		person.action2(content -> System.out.println(content + " 라고 말하지 않습니다. "));


		person.action2((content) -> System.out.println(content));
		// method reference
		person.action2(System.out::println);
		
	}

}
