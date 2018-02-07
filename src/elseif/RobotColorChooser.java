
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot("batman");
		rob.setSpeed(25);
		rob.penDown();
		//3. ask the user what color they would like the robot to draw
		String a = JOptionPane.showInputDialog("What colour would you like your robot to draw in, red, blue or green?");
		//4. use an if/else statement to set the pen color that the user requested
		if (a.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		if (a.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		if (a.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
        //5. if the user doesn’t enter anything, choose a random color
		if (a.equals("")) {
			rob.setRandomPenColor();
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		rob.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}

	}
}
