package sec_verify07;

public class DatabaseExample {
	final static int RECORD_NUM = 10; // ������ ���ڵ��� ���� ���Ѵ�.
	final static String TABLE_NAME = "TEST_TABLE";
	final static String[] CODE1 = { "010", "011", "017", "018", "019" };
	final static String[] CODE2 = { "����", "����" };
	final static String[] CODE3 = { "10��", "20��", "30��", "40��", "50��" };

	public static void main(String[] args) {
		for (int i = 0; i < RECORD_NUM; i++) {
			System.out.println(" INSERT INTO " + TABLE_NAME + " VALUES (" + " '" + getRandArr(CODE1) + "'" + ", '"
					+ getRandArr(CODE2) + "'" + ", '" + getRandArr(CODE3) + "'" + ",  " + getRand(100, 200) // 100~200
																											// ������ ����
																											// ��´�.
					+ "); ");
		}
	}
	public static String getRandArr(String[] arr) {
		String ret = arr[(int)(Math.random()*arr.length)];
		return ret;
	}
	
	public static int getRand(int value) {
		int ret = 0;
		ret = (int)(Math.random()*101);
		return ret;
	}
	
	public static int getRand(int value, int value1) {
		int ret = getRand(value)+(value1-value);
		return ret;
	}
	
	

}
