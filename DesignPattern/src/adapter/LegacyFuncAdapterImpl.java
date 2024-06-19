package adapter;

public class LegacyFuncAdapterImpl implements LegacyFuncAdapter{

	// 기존 Legacy interface 및 구현체를 이용 has a 관계
	private LegacyFunc legacyFunc;
	
	public LegacyFuncAdapterImpl(LegacyFunc legacyFunc) {
		this.legacyFunc = legacyFunc;
	}
	
	// legacy 의 결과를 이어서 추가로 처리할 내용
	private int convertLegacyData(int legacyResult) {
		 return legacyResult*2;
	}
	
	@Override
	public int calc(int num) {
		// Legacy 는 *10
		return convertLegacyData(legacyFunc.calc(num));
	}

}
