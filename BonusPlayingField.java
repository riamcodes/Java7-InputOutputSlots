//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 7 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken
import java.util.Random;

// BonusPlayingField is a subclass of PlayingField - every 5 spins it is called to give the playing Field a bonus and multiply their won money by the random bonus value assigned
public class BonusPlayingField extends PlayingField{

	//BonusPlayingFieldConstructor 
	BonusPlayingField() {
		super();
	
	}

	//spin method overrides spin method from superclass PlayingField
	@Override
	public double spin() {
		double value = super.spin();
		
		//generate bonus array 
		int[] bonuses = {2,2,3,3,4,4,5,5};
		
		//Generate a random number to use as an index to retrieve one of the bonus values from the bonuses array
	   Random rand = new Random();
		int bonus = bonuses[rand.nextInt(8)];
		
		//print the bonus value to the screen
		System.out.printf("Bonus %sX...\n",bonus);
		
		//Adjust the payout amount by multiplying it by the bonus
		value = value * bonus;
		System.out.printf("Adjusted payout %.2f \n", value);
		
		//return the adjusted payout
		return value;
	}
}
