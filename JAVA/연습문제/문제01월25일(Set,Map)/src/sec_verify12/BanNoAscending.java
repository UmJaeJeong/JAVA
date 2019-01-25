package sec_verify12;

import java.util.Comparator;

public class BanNoAscending implements Comparator<Student>{

	@Override	
	public int compare(Student o1, Student o2) {
		return (o1.ban<o2.ban) ? -1 : 1;
	}
	
}
