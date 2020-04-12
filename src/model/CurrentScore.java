package model;


public class CurrentScore implements Observer {
	//these each represent how many of each type of score was made, not the actual score itself
	//look at display() below to get better understanding
	private int twoPointersMade;
	private int threePointersMade;
	private int freeThrowsMade;
	private int twoPointersAttempted; //will be using the attempted in figuring our percentages for each type of scoring from the line later in AverageScore
	private int threePointersAttempted;
	private int freeThrowsAttempted;
	

	public void update(int twoPointersMade, int threePointersMade, int freeThrowsMade, int twoPointersAttempted,
			int threePointersAttempted, int freeThrowsAttempted) {
		// TODO Auto-generated method stub
		this.twoPointersMade = twoPointersMade;
		this.threePointersMade = threePointersMade;
		this.freeThrowsMade = freeThrowsMade;
		this.twoPointersAttempted = twoPointersAttempted;
		this.threePointersAttempted = threePointersAttempted;
		this.freeThrowsAttempted = freeThrowsAttempted;		
		display();
	}
	
	public void display() {
		//prints how many two pointers, three pointers, and free throws were attempted and them how many were made (successful) during the game
		System.out.println("Points Made and Attempted:");
		System.out.println("Two Pointers Attempted: " + twoPointersAttempted); //prints the number of times a two pointer was attempted
		System.out.println("Two Pointers Made: " + twoPointersMade); //prints the number of times a two pointer was successful
		System.out.println("Three Pointers Attempted: " + threePointersAttempted); //prints the number of three pointers attempted
		System.out.println("Three Pointers Made: " + threePointersMade); //prints the number of times a three pointer was successful
		System.out.println("Free Throws Attempted: " + freeThrowsAttempted); //prints the number of times a free throw was attempted
		System.out.println("Free Throws Made: " + freeThrowsMade); //prints the number of times a free throw was successful
		
		//here each type of score bench mark is multiplied by the right number to give a total score
		//EX: if a player made 3 two pointers then it would be multiplied by 2 to give the score of 6 which is then added to the total score
		System.out.println("Total Score: " + ((twoPointersMade * 2) + (threePointersMade * 3) + freeThrowsMade));
		
	}

}
