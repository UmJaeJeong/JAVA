package sec_verify09;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Test");
		File[] f = file.listFiles();
		

		for (int i = 0; i < f.length; i++) {
			if (f[i].exists()) {
				if (f[i].delete())
					System.out.println(f[i] + "를 삭제 하였습니다.");
				else
					System.out.println("파일삭제 실패");
			} else {
				System.out.println("선택한 파일이 없습니다.");
			}
		}
	}

}
