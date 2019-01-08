package sec_verify08;

public class UnitExample {

	public static void main(String[] args) {
		Unit[] units = new Unit[5];
		units[0] = new AirForce();
		units[0].setName("제1전투비행단");
		units[1] = new AirForce();
		units[1].setName("제38전투비행전단");
		units[2] = new Navy();
		units[2].setName("서애 류성용함");
		units[3] = new Army();
		units[3].setName("맹호부대");
		units[4] = new Army();
		units[4].setName("무적태풍부대");
		
		
		for(Unit a : units) {
			if(a instanceof Unit)
			a.attack();
		}


	}

}
