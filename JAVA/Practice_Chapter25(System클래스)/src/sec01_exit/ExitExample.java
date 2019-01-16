package sec01_exit;

public class ExitExample {
	public static void main(String[] args) {
		//�������
		/*
		1. for�� ����
		2. i�� ���
		3. System.exit(i)����
		4. System.setSecurityManager()����
		5. status�� 5�� �ƴϸ� ���� �߻�
		6. 5�϶� ���� ����
		*/		
		//���� ������ ����
		System.setSecurityManager(new SecurityManager() {
			//System.exit()ȣ��� �ڵ� ����(�����Ǹ� ���ϴٸ� ���α׷� �ڵ� ����)
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					//���α׷��� ���ᰡ �ȵǵ��� �Ϻη� ���� �߻���Ŵ
					throw new SecurityException("���ܹ߻�");  
				}
				System.out.println("���α׷� ����");
			}
		});
			
		for(int i=0; i<10; i++) {
			//i�� ���
			System.out.println(i);
			try {		
				//����̶� ���� JVM���� ���α׷� ���� ��û��
				System.exit(i);     
			} 
			catch(SecurityException e) {
				System.out.println(e.getMessage());
			}
		}	
	}
}
