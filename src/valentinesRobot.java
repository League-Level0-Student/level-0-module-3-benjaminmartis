import org.jointheleague.graphical.robot.Robot;

public class valentinesRobot {
public static void main(String[] args) {
	drawHear();
	
}
	private static void drawHear() {
	

	Robot yeet = new Robot("batman");
	yeet.setSpeed(25);
	yeet.setY(450);
	yeet.setX(450);
	yeet.penDown();
	yeet.setAngle(35);
	yeet.move(200);
	for (int i = 0; i < 180 ; i++) {
		yeet.turn(-1);
		yeet.move(1);
	}
	yeet.setAngle(-35);
	yeet.setX(450);
	yeet.setY(450);
	yeet.move(200);
	for (int i = 0; i < 180 ; i++) {
		yeet.turn(1);
		yeet.move(1);
	}
	yeet.setAngle(90);
	yeet.move(50);
	}
	
	}

	
	


