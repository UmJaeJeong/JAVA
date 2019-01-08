package sec_verify06;

public class RobotExample {

	public static void main(String[] args) {
		DanceRobot dance = new DanceRobot();
		DrawRobot draw = new DrawRobot();
		SongRobot song = new SongRobot();
		dance.dance();
		draw.draw();
		song.song();
		
	}

}
