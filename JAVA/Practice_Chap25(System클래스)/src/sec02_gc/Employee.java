package sec02_gc;

public class Employee 
{
	public int eno;	
	
	//������
	public Employee(int eno) 
	{
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿� ��ü ������");
	}

	//Object�� finalize()������(gc()�� ȣ��Ǹ� �ڵ� �����)
	@Override
	public void finalize() 
	{
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ��ü ���ŵ�");
	}
}
