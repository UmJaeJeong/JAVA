package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		String data = "D:/������/photo/2016/travel/food.jpg";
		String[] arr = data.split("/");
		int idx = data.indexOf(".");
		
		System.out.println("���� �̸�: "+data.substring(idx));
		idx = arr[5].indexOf(".");
		System.out.println("Ȯ���� : "+arr[5].substring(0, idx));
		
		
	}

}
