package ch16.sec02.ex02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();

		// 서로 같음
		btnOk.setClickListener(() -> {
			System.out.println("OK button click");
		});

		btnOk.setClickListener(() -> System.out.println("OK button click"));
		btnOk.click();

		Button btnCancel = new Button();

		// 서로 같음
		btnCancel.setClickListener(() -> {
			System.out.println("OK button click");
		});

		btnCancel.setClickListener(() -> System.out.println("btn Cancel click"));
		btnCancel.click();

	}

}
