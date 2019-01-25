package sec04_properties.exam01_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		//Properties는 키와 값을 String으로 만들어진 Map컬렉션이다.
		Properties properties = new Properties();
		
		//PropertiesExample와 동일한 곳에 지금 프라퍼티 파일이 존재하므로 아래와 같은
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		//유니코드로 파일 경로가 출력
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");	//한글복원
		System.out.println(path);
		//첫번째 경로 읽는법(해당 폴더내 존재할때 사용)
		properties.load(new FileReader(path));
		//두번쨰 경로 읽는 법(절대경로)
		//properties.load(new FileReader("D:\\JAVA\\Practice_Chapter33(CollectionFrameWork)\\src\\sec04_properties\\exam01_properties"));
		
		//키값을 주고 값을 읽어옴
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//얻어온 값을 출력해봄
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
	}

}
