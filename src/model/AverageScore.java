package model;

public class AverageScore implements Observer {

	private float twoPointerRate;
	private float threePointerRate;
	private float freeThrowRate;
	
	
	public void update(int twoPointersMade, int threePointersMade, int freeThrowsMade, int twoPointersAttempted,
			int threePointersAttempted, int freeThrowsAttempted) {
		// TODO Auto-generated method stub
		this.twoPointerRate = ((twoPointersMade/twoPointersAttempted)*100);
		this.threePointerRate = ((threePointersMade/threePointersAttempted)*100);
		this.freeThrowRate = ((freeThrowsMade/freeThrowsAttempted)*100);
		display();
	}
	
	public void display() {
		System.out.println("Two Pointer Stats: " + twoPointerRate + "% of the two pointers attempted were successfully");
		System.out.println("Three Pointer Stats: " + threePointerRate + "% of the three pointers attempted were successfully");
		System.out.println("Free Throw Stats: " + freeThrowRate + "% of the free throws attempted were successfully");

	}

}
