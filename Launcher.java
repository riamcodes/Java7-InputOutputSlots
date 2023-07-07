//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 7 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

//import the scanner class
import java.util.Scanner;

//Launcher class contains main method and launches the game
public class Launcher {

	//launches game using code from the previous lab 
	//contains the main method
	public static void main(String[] args) {
		
		SlotMachine slot = new SlotMachine();
		Scanner input = new Scanner(System.in);
		System.out.print("How much money would you like to insert? ");
		double money =  input.nextDouble();
		slot.insertMoney(money);
		//Create a counter that tracks the number of times the player has spun
		int counter = 0;
		while(true)
		{
		System.out.print("Spin/Quit (S/Q) : ");
		String s = input.next();
		if(s.equalsIgnoreCase("Q"))
		break;
		else
		slot.play();
		counter ++;
		//On every fifth spin, use the BonusPlayingField by sending the setBonus message to the SlotMachine.
		if (counter == 5) {
		slot.setBonus();
		slot.play();
		//After that spin is complete, send the setRegular message to the SlotMachine to resume normal play
		slot.setRegular();
		counter = 0;
		}//end if
		}
		slot.quit();

	}

}

