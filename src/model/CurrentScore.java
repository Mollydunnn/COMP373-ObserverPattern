package model;
import java.util.*;


public class CurrentScore implements Observer {
	//these each represent how many of each type of score was made, not the actual score itself
	//look at display() below to get better understanding
	private int twoPointer;
	private int threePointer;
	private int freeThrows;
	private int attempts;
	
	public void update(int twoPointer, int threePointer, int freeThrows, int attempts) {
		// TODO Auto-generated method stub
		this.twoPointer = twoPointer;
		this.threePointer = threePointer;
		this.freeThrows = freeThrows;
		this.attempts = attempts;
		display();
	}
	
	public void display() {
		//prints how many two pointers, three pointers, and free throws were made during the game
		System.out.println("The following have been made in this game:");
		System.out.println("Two Pointers: " + twoPointer);
		System.out.println("Three Pointers: " + threePointer);
		System.out.println("Free Throws: " + freeThrows);
		//here each type of score bench mark is multiplied by the right number to give a total score
		//EX: if a player made 3 two pointers then it would be multiplied by 2 to give the score of 6 which is then added to the total score
		System.out.println("Total Score: " + ((twoPointer * 2) + (threePointer * 3) + freeThrows));
		
	}

}
