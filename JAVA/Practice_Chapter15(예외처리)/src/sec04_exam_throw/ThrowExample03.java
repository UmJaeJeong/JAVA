package sec04_exam_throw;

public class ThrowExample03 {
	
	public static void main(String[] args){
		String file1 = creatFile("test.txt");
		String file2 = creatFile("");
		
		System.out.println(file1+" 파일이 성공적으로 생성되었습니다.");
		System.out.println(file2+" 파일이 성공적으로 생성되었습니다.");
	}
	
	public static String creatFile(String fileName) {
		
		try {
			if(fileName == null || fileName.equals("")) {
				throw new Exception("파일이름이 유효하지 않습니다.");
			}
		}catch(Exception e) {
			//fileName이 부 적적할 경우, 파일 이름을  '제목없음.txt'로 한다.
			fileName = "제목없음";
		}
		return fileName;
	}
	
}
