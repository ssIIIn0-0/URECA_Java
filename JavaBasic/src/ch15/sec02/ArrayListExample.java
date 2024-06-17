package ch15.sec02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();

		// 추가
		list.add(new Board("제목1", "내용1", "시은"));
		list.add(new Board("제목2", "내용2", "시은"));
		list.add(new Board("제목3", "내용3", "시은"));
		list.add(new Board("제목4", "내용4", "시은"));
		list.add(new Board("제목5", "내용5", "시은"));

		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));

		// 순회
		// for + index
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// for each
		for (Board board : list) {
			System.out.println(board);
		}

		// iterator
		Iterator<Board> itr = list.iterator();
		while (itr.hasNext()) {
			Board board = itr.next();
			System.out.println(board);
		}

//		// 삭제
//		list.remove(2);
//		System.out.println(list);

		// 순회 중 삭제
		// list안에 객체가 삭제될 시, 다음 객체는 인덱스가 밀려서 list안에 모든 요소를 탐색하지 못하는 오류가 발생할 수 있다.
		// 이런 경우, 순회를 거꾸로 해야한다.
//		for (int i = 0; i < list.size(); i++) {
//			Board board = list.get(i);
//			if(board.getSubject().equals("제목2")) {
//				list.remove(i);
//			}
//		}
		// for + index는 뒤부터
		for (int i = list.size(); i >= 0; i--) {
			Board board = list.get(i);
			if (board.getSubject().equals("제목2")) {
				list.remove(i);
			}
		}

		// iterator
		Iterator<Board> itr2 = list.iterator();
		while (itr.hasNext()) {
			Board board = itr2.next();
			if (board.getSubject().equals("제목2")) {
				itr2.remove();
			}
		}

		System.out.println(list);
	}

}
