# COMP373-ObserverPattern
This is Molly Dunn and Nida Hameed's implementation of an example of the Observer Pattern.  

## To Run
To Run: Clone this project into an IDE (Eclipse). Open and run the Driver.java file in the view package to view the output.  

## Summary
We created an application about updating a team's score in a basketball game. The Observer.java and the Subject.java are interfaces and the observers (CurrentScore and AverageScore) implement the observer interface. The subject interface houses the observers in use. And, the notifyObservers() is in the BBDataClass.java. The observer pattern is implemented in this example as an object, the Subject interface, maintains a list of its observers, the CurrentScore.java and AverageScoreDisplay.java classes, and notifies them automatically of changes and updates from the BBDataClass.java. 
