package adapter;

public class LegacyFuncImpl implements LegacyFunc{

	@Override
	public int calc(int num) {
		// Legacy 는 *10
		return num * 10;
	}

}
