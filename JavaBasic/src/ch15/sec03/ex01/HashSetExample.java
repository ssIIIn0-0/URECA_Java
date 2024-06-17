package ch15.sec03.ex01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		set.add("Java");
//		set.add("Java");
//		set.add("Java");
//		set.add("Java");
//		set.add("Java");
//		set.add("유레카");
//		set.add("백엔드");
//		
//		System.out.println(set.size());	// 3, set은 중복X
//		for(String str : set) {
//			System.out.println(str);
//		}
		
		Set<Member> set = new HashSet<>();
		set.add(new Member("시은1", 25));
		set.add(new Member("시은2", 25));
		set.add(new Member("시은3", 25));
		
		System.out.println(set.size());
		
		for (Member member : set) {
			System.out.println(member);
		}
		
		set.remove(new Member("시은2", 25));
		System.out.println(set.size());
	}

}
