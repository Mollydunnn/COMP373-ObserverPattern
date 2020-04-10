package dal;
import java.util.*;

import model.Observer;
import model.Subject;

public class BBDataClass implements Subject {
	//different scores benchmarks used in basketball used as main data
	int twoPointer;
	int threePointer;
	int freeThrows;
	int attempts; //will be using attempts in figuring our percentage from the line later in AverageScore
	ArrayList<Observer> observerList;
	
	public BBDataClass() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.remove(observerList.lastIndexOf(observer));
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Iterator<Observer> iterator = observerList.iterator(); iterator.hasNext();) {
			Observer observer = iterator.next();
			observer.update(twoPointer, threePointer, freeThrows, attempts);
		}
	}
	


}
