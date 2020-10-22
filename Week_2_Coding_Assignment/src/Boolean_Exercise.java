
public class Boolean_Exercise {

	public static void main(String[] args) {
		// Question #2: create the following Boolean variables and choose what values they hold
		boolean isHotOutside = true; // 'true' has to be lower-case
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
				
		// Question #3: Create the following variables 
			
		double costOfMilk = 3.78;
		double moneyInWallet = 15;
		int thirstLevel = 7;
				
		// Question #4: Using the variables you created above and Boolean operators, 
		//create variables for the following scenarios:
				
		boolean shouldBuyIcecream = (isHotOutside == true) && (hasMoneyInPocket == true);
		boolean willGoSwimming = (isHotOutside == true) && (isWeekday == false);
		boolean isAGoodDay = (isHotOutside == true) && (isWeekday == false) 
		&& (hasMoneyInPocket == true);
		boolean willBuyMilk = (isHotOutside == true) && (thirstLevel >= 3) 
				&& (costOfMilk <= 2*moneyInWallet);
				
		//Assuming that we are supposed to print out the variables from Question #4, we have:
		System.out.println("shouldBuyIcecream evaluates to " + shouldBuyIcecream);
		System.out.println("willGoSwimming evaluates to " + willGoSwimming);
		System.out.println("isAGoodDay evaluates to " + isAGoodDay);
		System.out.println("willBuyMilk evaluates to " + willBuyMilk);

	}

}
