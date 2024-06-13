package ch08.sec09;

public class test {

	public static void main(String[] args) {
		IFC ifc = new Impl();
		ifc.ma();
		ifc.mb();
		ifc.mc();
		
		IFB ifb = new Impl();
		ifb.ma();
		ifb.mb();
//		ifb.mc();	// ifb는 ifc보다 상위 계층이므로 ifc에 있는 메소드는 출력X

	}

}
