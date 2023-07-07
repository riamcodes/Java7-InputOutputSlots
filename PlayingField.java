//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 7 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

//import ArrayList
import java.util.ArrayList;
//PlayingField is a superclass of BonusPlayingField
//PlayingField class contains PlayingField constructor and spin method 
public class PlayingField {

	//Wheel Array List
	private ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	
	//PlayingField Constructor 
	PlayingField(){
		
		//Add 3 wheels to the ArrayList
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		wheels.add(new Wheel());
		
	}//end PlayingField
	
	//spin method spins the 3 wheels and returns the corresponding statement and money based on how many wheels match 
	public double spin() {
		double value = 0 ;
		
		String name1 = wheels.get(0).spin();
		String name2 = wheels.get(1).spin();
		String name3 = wheels.get(2).spin();

		
		System.out.printf("Spun %s-%s-%s\n", name1, name2, name3);
		 
		//compares the wheel spins to identify how many matches exist
		if (name1.equals(name2)||name1.equals(name3))
		{
			value +=.5;
		}
		if (name2.equals(name3))
		{
			value += .5;
		}
		//prints how much money is won
		if (value == 0)
		{
			System.out.println("No prize");
		}
	    if (value == 0.5)
			System.out.println("Won 50 cents");
	    if (value == 1)
			System.out.println("Won $1");
		return value;
		
	}//end spin

}
