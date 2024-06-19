package Builder;

public class Test {

	public static void main(String[] args) {
		NormalBook nBook = new NormalBook();
		nBook.setIsbn("111");
		nBook.setTitle("제목1");
		
		NormalBook nBook2 = new NormalBook ("222", "이름", "제목2");	// 파라미터 순서오류가 생길 수 있음
		// 적당한 field를 set 할 수 있는 적당한 생성자를 추가로 요구

		BuilderBook bBook = BuilderBook.builder()
				.title("제목3")
				.isbn("333")
				.author("이름3");
		System.out.println(bBook);
		
		// Board
		Board board = new Board.Builder()
				.title("제목3")
				.content("333")
				.category("분류1")
				.build();
		
		System.out.println(board);
	}

}
