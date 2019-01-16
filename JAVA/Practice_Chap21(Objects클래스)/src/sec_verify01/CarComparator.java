package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car a, Car b) {
		
		if( (a.model.compareTo(b.model)) < 0 )
			return -1;
		else if((a.model.compareTo(b.model)) == 0 )
			return 0;
		else
			return 1;        						
	}
}
