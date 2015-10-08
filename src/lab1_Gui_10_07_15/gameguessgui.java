package lab1_Gui_10_07_15;

import javax.swing.JOptionPane;

public class gameguessgui {

	public static void main(String[] args) {
		
	int rand, userNum;
	int min=1, max=10;
	String tBig=" Sorry, the number you guessed is to big ";
	String tSmall=" Sorry, the  number is to small ";
	String uString, message, sInput;
	
	rand = min+(int)(Math.random()*max);
	sInput = JOptionPane.showInputDialog (" Guess a Number 1 - 10");
	userNum = Integer.parseInt(sInput);
	
	if (userNum > max || userNum < min ){
		message = String.format(" Number is out of valid Range ");
	}
	else {
		
		if ( userNum == rand )
			JOptionPane.showMessageDialog(null, " We got the same number you won the Computer! ");
		
		else{ uString = (userNum > rand )? tBig : tSmall;
		message = String.format( "%s\n The Correct number was %d. ",  uString, rand);
		JOptionPane.showMessageDialog(null,message);
		}
		
	}
		
	}

}
