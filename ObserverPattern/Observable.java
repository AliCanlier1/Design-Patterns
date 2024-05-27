package ObserverPattern;

public interface Observable {
    void addObserver(Observer observer);
    boolean deleteObserver(Observer observer);
    void notifyObservers();
}
