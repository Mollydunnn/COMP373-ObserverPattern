package model;

public interface Observer {

	//implemented by all updates when new scores are updated through the data class
	void update(int twoPointer, int threePointer, int freeThrows, int attempts);

}
