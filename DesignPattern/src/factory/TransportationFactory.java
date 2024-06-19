package factory;

// ~Factory는 보통 singleton 으로 구성 여기선 제외
public class TransportationFactory {
	public static Transportation getTransportation(String clsf) {
		Transportation t = null;
		switch(clsf) {
			case "Air" : t = new Airplane(); break;
			case "Car" : t = new Car(); break;
		}
		return t;
	}
}
