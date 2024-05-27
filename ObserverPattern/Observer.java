package ObserverPattern;

public interface Observer {
    void subscribeObservable(Observable observable);
    boolean unsubscribeObservable(Observable observable);
    void getNotified(Observable observable);
}
