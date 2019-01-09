package sec_verify11;

public class Task implements Priority{
	String taskName;
	int time;
	int priority_number;
	
	public Task(String taskName, int time) {
		this.taskName = taskName;
		this.time = time;
	}
	
	@Override
	public int getPriority() {
		return this.priority_number;
	}
	
	@Override
	public void setPriority(int value) {
		this.priority_number = value;
	}
}
