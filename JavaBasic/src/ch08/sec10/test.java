package ch08.sec10;

public class test {

	public static void main(String[] args) {
		IFC ifc = new Impl();	// 자동형변환
		IFB ifb = new Impl();	// 자동 형변환
//		ifb.mc();	// 호출 못함, IFB 타입으로 선언이 되어 있기 때문에
		
		if (ifb instanceof IFC) {
			IFC ifc2 = (IFC) ifb;	// 강제 형뼌환 IFC자식 IFB 부모
			ifc2.mc();
		}
		
		
		IFC ifc_s = new Impl();
		ifc_s.mb();
		IFC ifc2_s = new SubImpl();
		ifc2_s.mb();
	}
}

// 강제 타입변환 추가
//	public class B(자식) extends A(부모) (){}
//	
//	A a = new B();	// 자동 타입 변환 (자식 -> 부모)
//	B b = (B) a;	// 강제 타입 변환
//	// B b = (B) new A(); 이런건 그냥 문법에 안맞음
//	// 여기서 알 수 있는건,
//	// 강제 타입 변환을 하고 싶으면, 
//	// 1. 자동 타입 변환을 먼저! 한다
//	// 2. instanceof 로 상속이 됬는지 안됬는지 확인한다 (생략 가능)
//	// 3. 자동 타입 변환한 변수를 가지고 강제 타입 변환을 해야한다.