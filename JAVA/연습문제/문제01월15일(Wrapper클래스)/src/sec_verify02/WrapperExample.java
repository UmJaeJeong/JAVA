package sec_verify02;

public class WrapperExample {

	public static void main(String[] args) {
		Integer i= new Integer(10);
		char c = '4';
		Double d = new Double(3.12345666);
		System.out.println("대문자 A를 소문자로 변환 : "+"A".toLowerCase());
		System.out.println("문자 c를 숫자로 변환하여 출력 : "+Integer.valueOf(c));
		System.out.println("문자열 “-123”을 정수로 변환하여 출력 : "+Integer.valueOf("-123"));
		
		System.out.println("16진수로 표현된 문자열 “10”을 정수로 변환하여 출력 : "+Integer.toHexString(Integer.valueOf("16")));
		
		System.out.println("28의 2진수 표현을 나타내는 문자열 출력 : "+ Integer.toBinaryString(Integer.valueOf("28")));
		String  bin = Integer.toBinaryString(Integer.valueOf("28"));
		int cnt = 0;
		for(int j=0; j<bin.length();j++) {
			if(bin.charAt(j)=='1') {
				cnt++;
			}
		}
		System.out.println("28의 2진수에서 1의 개수출력 : "+cnt);
		
		System.out.println("28의 16진수 표현을 나타내는 문자열 출력 : "+Integer.toHexString(Integer.valueOf("28")));
		
		System.out.println("i값(=10)을 double로 변환하여 출력 : "+Double.valueOf(i));
		System.out.println("d값(=3.1234566)을 문자열로 변환하여 출력 : "+String.valueOf(3.1234566));
		System.out.println("문자열 44.13e-16을 double로 변환하여 출력 : "+Double.valueOf(44.13e-16));

	}

}
