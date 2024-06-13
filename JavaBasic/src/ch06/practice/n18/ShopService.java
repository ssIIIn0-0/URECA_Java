package ch06.practice.n18;

public class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {
	}

	static ShopService getInstance() {
		return instance;
	}
}