package ch08.sec10;
// 구현 객체
// public class Impl implements IFA, IFB, IFC{
// IFC가 IFB를 상속받고, IFB가 IFA를 상속받기 때문에 여기서는 implements IFC만 해도 가능
public class Impl implements IFC{
	@Override
	public void mc() {
		System.out.println("mc");
		
	}

	@Override
	public void mb() {
		System.out.println("mb");
		
	}

	@Override
	public void ma() {
		System.out.println("ma");
		
	}
	

}
