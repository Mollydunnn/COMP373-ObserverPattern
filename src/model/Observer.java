package model;

public interface Observer {

	//implemented by all updates when new scores are updated through the data class
	void update(int twoPointersMade, int threePointersMade, int freeThrowsMade, int twoPointersAttempted, int threePointersAttempted, int freeThrowsAttempted);

}
