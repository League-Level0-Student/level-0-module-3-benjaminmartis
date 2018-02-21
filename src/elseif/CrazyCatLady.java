                  //    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String a = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
	int b = Integer.parseInt(a);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
	if (b>3) {
		JOptionPane.showMessageDialog(null, "You a crasy cat lady");
	}
	
		// 4. If they have 3 or less, call the method below to show them a cat video
	if (b<3||b==3) {
		playVideo("https://www.youtube.com/watch?v=OxgKvRvNd5o");
	}
	}
	

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

