package sec01_exit;

public class ExitExample {
	public static void main(String[] args) {
		//실행순서
		/*
		1. for문 실행
		2. i값 출력
		3. System.exit(i)실행
		4. System.setSecurityManager()실행
		5. status가 5가 아니면 예외 발생
		6. 5일때 정상 종료
		*/		
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			//System.exit()호출시 자동 실행(재정의를 안하다면 프로그램 자동 종료)
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					//프로그램이 종료가 안되도록 일부러 예외 발생시킴
					throw new SecurityException("예외발생");  
				}
				System.out.println("프로그램 종료");
			}
		});
			
		for(int i=0; i<10; i++) {
			//i값 출력
			System.out.println(i);
			try {		
				//어떤값이라도 들어가면 JVM에게 프로그램 종료 요청함
				System.exit(i);     
			} 
			catch(SecurityException e) {
				System.out.println(e.getMessage());
			}
		}	
	}
}
