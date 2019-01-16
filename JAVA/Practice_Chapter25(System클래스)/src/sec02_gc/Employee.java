package sec02_gc;

public class Employee 
{
	public int eno;	
	
	//생성자
	public Employee(int eno) 
	{
		this.eno = eno;
		System.out.println("Employee(" + eno + ") 가 메모리에 객체 생성됨");
	}

	//Object의 finalize()재정의(gc()가 호출되면 자동 실행됨)
	@Override
	public void finalize() 
	{
		System.out.println("Employee(" + eno + ") 이 메모리에서 객체 제거됨");
	}
}
