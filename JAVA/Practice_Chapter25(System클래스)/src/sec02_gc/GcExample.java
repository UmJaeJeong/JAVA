package sec02_gc;

public class GcExample
{
	public static void main(String[] args) 
	{
		Employee emp;
		
		//Employee(1),Employee(2)�� �ᱹ ������ ��ü�� ��
		emp = new Employee(1);  
		emp = null;		
		emp = new Employee(2);		
		emp = new Employee(3);
				
		System.out.print("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();  //finalize()�� �ڵ� ����
	}
}
