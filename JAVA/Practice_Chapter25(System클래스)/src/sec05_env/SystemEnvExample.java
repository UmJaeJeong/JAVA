

package sec05_env;

public class SystemEnvExample {
	
	public static void main(String[] args) {
		//ȯ�溯�� �о�� ���
		String javaHome = System.getenv("JAVA_HOME");	
		String path = System.getenv("Path");
		String temp = System.getenv("TEMP");
		
		System.out.println("[ JAVA_HOME ]  " + javaHome);
		System.out.println("[ Path ]  " + path);
		System.out.println("[ TEMP ]  " + temp);		
	}
}
