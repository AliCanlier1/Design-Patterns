package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{
    private String name;
    private List<Observer> subscribers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Channel(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public boolean deleteObserver(Observer observer) {
        return this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.getNotified(this);
        }
    }

    public void uploadVideo(){
        notifyObservers();
    }
}
