package studio2;

public class Ruin {

	public static void main(String[] args) {
		int winLimit= 10;
		int wins= 0;
		int ruins= 0;
		int gamesPlayed= 0;
		int dayNumber= 0;
		int totalSimulations= 2;
		double winRate = 0.7;
		int startAmount= 2;

	for (totalSimulations = 0; totalSimulations <500; totalSimulations++)	{
		for(int Simulations= 0; Simulations<1; Simulations++)	{	
			dayNumber++;
		for (startAmount = 50; startAmount<100 && startAmount > 0;) {
			double winChance= Math.random();
				if(startAmount <= winLimit && winChance > 0.7){ 
					startAmount++;
					gamesPlayed++;
				} else {
					startAmount--;
					gamesPlayed++;
			}
				
		}
	if (startAmount==100) {
		wins++;
	} else {
		ruins++;
	}
	System.out.println("Day: "+ dayNumber);
	System.out.println("Wins: " + wins);
	System.out.println("Ruins: " +ruins);
	System.out.println("Total Plays: "+ gamesPlayed);
	System.out.println("");
	
	}
		gamesPlayed= 0;
		wins= 0;
		ruins= 0;
	}
	double alpha = ((1-winRate)/winRate);
	double expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/ (1- Math.pow(alpha,winLimit));
	double ruinRate= 0;
	System.out.println("Ruin Rate: "+ expectedRuin);
}
}
	
