package sec_verify07;

public class SamsungHandPhoneExample {

	public static void main(String[] args) {
		SamsungHandPhone ph = new SamsungHandPhone();
		ph.setColor("���");
		ph.setCompany("Samsung");
		ph.setModel("Samsung");
		ph.setRelease(10);
		System.out.printf(ph.toString());
	}

}
