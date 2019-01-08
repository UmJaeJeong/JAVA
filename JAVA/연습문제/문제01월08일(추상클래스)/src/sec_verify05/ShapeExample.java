package sec_verify05;

public class ShapeExample {

	static int i = 0;

	static double sumArea(Shape[] arr) 
	{
		double area = 0.0;
		area = arr[i].calcArea();
		i++;
		return area;		
	}

	public static void main(String[] args) 
	{
		Shape[] arr = {
				new Circle(5.0), new Rect(3,4), new Circle(1)
				};
		
		for(Shape s : arr) {
			System.out.print(s.getClass().getSimpleName());
			System.out.println("면적의 합:"+sumArea(arr));
		}
		
	}
}
