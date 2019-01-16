package sec04_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {
	
	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");		
		System.out.println("�ü�� �̸�: " + osName);
		System.out.println("����� �̸�: " + userName);
		System.out.println("����� Ȩ���丮: " + userHome);
		
		System.out.println("---------------------------------");
		System.out.println(" [key]                      value");
		System.out.println("---------------------------------");
		
		//Property�� ���� Set��ü �����Ͽ� keySet���� ������ ���		
		Properties props = System.getProperties();  //��� �ý����� �Ӽ��� ��Ƽ� ����
		//props.list(System.out);
		//Properties�÷����� Ű�� ���� ��ü�� String�̴�. ���⼭�� Properties�÷����� 
		//Ű���� �����ͼ� Set�÷����� ����� ����غ���. �ֳ� map�迭�� Ű���� �˾Ƶ� 
		//���� �����µ� ������ ���� ������ ���̴�.
		Set<Object> keys = props.keySet();  
		
		for(Object objKey : keys) {
			String key = (String) objKey;  //Ű���� String�̹Ƿ� ���� ĳ�����Ѵ�.
			String value = System.getProperty(key);   //Ű���� �̿��Ͽ� �� ���
			System.out.println("[" + key + "]" + value);
		}
	}
}
