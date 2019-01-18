package sec_verify06;

public class PriorityThreadExample {

	public static void main(String[] args) {
		PriorityThread power = new PriorityThread("power");
		PriorityThread water = new PriorityThread("water");
		PriorityThread fire = new PriorityThread("fire");
		power.setPriority(Thread.MIN_PRIORITY);
		water.setPriority(Thread.NORM_PRIORITY);
		fire.setPriority(Thread.MAX_PRIORITY);
		power.start();
		water.start();
		fire.start();
		
	}

}
