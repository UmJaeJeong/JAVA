package sec_verify06;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double aver = 0.0;
		for(int i : a) {
			aver+=(double)i/a.length;
		}
		return aver;
	}

}
