package ObserverPattern;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void subscribeObservable(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public boolean unsubscribeObservable(Observable observable) {
        return observable.deleteObserver(this);
    }

    @Override
    public void getNotified(Observable observable) {
        Channel channel = (Channel) observable;
        System.out.println("Hey "+this.name+" there is a notification from "+channel.getName()+"!");
    }
}
