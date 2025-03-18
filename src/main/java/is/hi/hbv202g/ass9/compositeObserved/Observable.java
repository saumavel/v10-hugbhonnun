package is.hi.hbv202g.ass9.compositeObserved;
import java.util.List;
import java.util.ArrayList;
public abstract class Observable {
    private final List<Observer> observers;
    public Observable() {
        observers=new ArrayList<>();
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
