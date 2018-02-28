//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String a = JOptionPane.showInputDialog("what number is your guess?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int b=Integer.parseInt(a);
			// 5. if the guess is correct
			if (b==random) {
				JOptionPane.showMessageDialog(null, "WIN!");
			}
				// 6. win
			// 7. if the guess is high
			if ( b>random ) {
				JOptionPane.showMessageDialog(null, "Sorry but your geuss is too high");
				JOptionPane.showMessageDialog(null, "YOU LOSE!");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			if (b<random) {
				JOptionPane.showMessageDialog(null, "sorry but your geuss is too low");
				JOptionPane.showMessageDialog(null, "YOU LOSE!");
			}
				// 10. tell them it's too low

		// 12. tell them they lose
	}

}


