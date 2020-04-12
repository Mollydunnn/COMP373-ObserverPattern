package view;

import model.AverageScore;
import model.BBDataClass;
import model.CurrentScore;

public class Driver {
	
	public static void main (String args[]) {
		
		AverageScore avgScore = new AverageScore();
		CurrentScore currentScore = new CurrentScore();
		
		BBDataClass bbData = new BBDataClass();
		
		bbData.registerObserver(currentScore);
		bbData.registerObserver(avgScore);
		bbData.dataChanged();
		
	}

}
