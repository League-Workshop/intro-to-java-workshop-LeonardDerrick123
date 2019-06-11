package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	int a= new Random().nextInt(4);
	System.out.println(a);
	String videogame=JOptionPane.showInputDialog("What is awesome");
 
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
if(videogame.equals("minecraft")) {
	a=1;
}
	// 3. Print out this variable
if(videogame.equals("roblox")){
	a=2;
}
	// 4. Get the user to enter something that they think is awesome
if(videogame.equals("fortnite")) {
	a=3;
}
	// 5. If the random number is 0
if(a==0) {
	JOptionPane.showMessageDialog(null, "you suck NOOB!!!!!!!!!!!!!!!!!!!!");
}
if(a==1) {
	JOptionPane.showMessageDialog(null, "you are AWESOME just like "+videogame+"!!!!!!!!!!!!!!!!!!!!");
	
}

if(a==2||a==3) {
	JOptionPane.showMessageDialog(null, "that does not use JAVA you FOOL!!!!!!!!!!!!!!!!!!!!");
}

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


