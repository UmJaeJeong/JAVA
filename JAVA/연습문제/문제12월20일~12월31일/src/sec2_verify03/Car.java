package sec2_verify03;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	Car(){
		System.out.println("car1.company : "+this.company);
		System.out.println();
	}
	Car(String model){
		this.model = model;
		System.out.println("car2.company : "+this.company);
		System.out.println("car2.model : "+this.model);
		System.out.println();

		}
	Car(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("car3.company : "+this.company);
		System.out.println("car3.model : "+this.model);
		System.out.println("car3.color : "+this.color);
		System.out.println();


	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("car4.company : "+this.company);
		System.out.println("car4.model : "+this.model);
		System.out.println("car4.color : "+this.color);
		System.out.println("car4.maxSpeed : "+this.maxSpeed);
		System.out.println();


	}

	
}
