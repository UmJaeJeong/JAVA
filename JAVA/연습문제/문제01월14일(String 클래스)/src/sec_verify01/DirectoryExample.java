package sec_verify01;

public class DirectoryExample {

	public static void main(String[] args) {
		String data = "D:/내폴더/photo/2016/travel/food.jpg";
		String[] arr = data.split("/");
		int idx = data.indexOf(".");
		
		System.out.println("파일 이름: "+data.substring(idx));
		idx = arr[5].indexOf(".");
		System.out.println("확장자 : "+arr[5].substring(0, idx));
		
		
	}

}
