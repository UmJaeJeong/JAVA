package sec_verify02;

public class WrapperExample {

	public static void main(String[] args) {
		Integer i= new Integer(10);
		char c = '4';
		Double d = new Double(3.12345666);
		System.out.println("�빮�� A�� �ҹ��ڷ� ��ȯ : "+"A".toLowerCase());
		System.out.println("���� c�� ���ڷ� ��ȯ�Ͽ� ��� : "+Integer.valueOf(c));
		System.out.println("���ڿ� ��-123���� ������ ��ȯ�Ͽ� ��� : "+Integer.valueOf("-123"));
		
		System.out.println("16������ ǥ���� ���ڿ� ��10���� ������ ��ȯ�Ͽ� ��� : "+Integer.toHexString(Integer.valueOf("16")));
		
		System.out.println("28�� 2���� ǥ���� ��Ÿ���� ���ڿ� ��� : "+ Integer.toBinaryString(Integer.valueOf("28")));
		String  bin = Integer.toBinaryString(Integer.valueOf("28"));
		int cnt = 0;
		for(int j=0; j<bin.length();j++) {
			if(bin.charAt(j)=='1') {
				cnt++;
			}
		}
		System.out.println("28�� 2�������� 1�� ������� : "+cnt);
		
		System.out.println("28�� 16���� ǥ���� ��Ÿ���� ���ڿ� ��� : "+Integer.toHexString(Integer.valueOf("28")));
		
		System.out.println("i��(=10)�� double�� ��ȯ�Ͽ� ��� : "+Double.valueOf(i));
		System.out.println("d��(=3.1234566)�� ���ڿ��� ��ȯ�Ͽ� ��� : "+String.valueOf(3.1234566));
		System.out.println("���ڿ� 44.13e-16�� double�� ��ȯ�Ͽ� ��� : "+Double.valueOf(44.13e-16));

	}

}
