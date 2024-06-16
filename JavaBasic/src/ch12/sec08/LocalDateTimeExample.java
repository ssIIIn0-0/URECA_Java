package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// Date 관련해서는 LocalDateTime을 사용
		// 백엔드에서 날짜, 시간 데이터를 전송 (JSON), java 8이상
		String str = "1986-04-08 12:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		System.out.println(dateTime);
		System.out.println(dateTime.getYear());
		System.out.println(dateTime.getMonth()); // Text
		System.out.println(dateTime.getMonthValue()); // Number
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonth()); // Text
		System.out.println(now.getMonthValue()); // Number
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());

	}

}
