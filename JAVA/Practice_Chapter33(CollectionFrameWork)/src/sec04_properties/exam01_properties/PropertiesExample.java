package sec04_properties.exam01_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception{
		//Properties�� Ű�� ���� String���� ������� Map�÷����̴�.
		Properties properties = new Properties();
		
		//PropertiesExample�� ������ ���� ���� ������Ƽ ������ �����ϹǷ� �Ʒ��� ����
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		//�����ڵ�� ���� ��ΰ� ���
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");	//�ѱۺ���
		System.out.println(path);
		//ù��° ��� �д¹�(�ش� ������ �����Ҷ� ���)
		properties.load(new FileReader(path));
		//�ι��� ��� �д� ��(������)
		//properties.load(new FileReader("D:\\JAVA\\Practice_Chapter33(CollectionFrameWork)\\src\\sec04_properties\\exam01_properties"));
		
		//Ű���� �ְ� ���� �о��
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//���� ���� ����غ�
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
	}

}
