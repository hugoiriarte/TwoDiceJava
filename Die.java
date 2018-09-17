
//declaring the class to be public 
public class Die
{
		//variable with no value yet
		private int randomValue;
		//constant which will be the highest number the die can roll
		private static final int HIGHEST_DIE_VALUE = 6;
		//constant which will be the lowest number the die can roll
		private static final int LOWEST_DIE_VALUE = 1;
		
		//constructor 
		public Die()
		{		
				//giving randomValue its value of a smiple math equation 
				randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
		}
		
		//Accessor method that returns the die's value
		public int getValue()
		{	
			//the return that will give the random value between 1 and 6
			return randomValue;
		}
	
}