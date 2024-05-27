package ObserverPattern;

public class Test {
    public static void main(String[] args) {

        Observable ytChannel = new Channel("Youtube Channel");
        Observer ytSubscriber1 = new Subscriber("Youtube User1");
        Observer ytSubscriber2 = new Subscriber("Youtube User2");
        Observer ytSubscriber3 = new Subscriber("Youtube User3");
        Observable newsChannel = new Channel("News Channel");
        Observer newsSubscriber1 = new Subscriber("News User1");
        Observer newsSubscriber2 = new Subscriber("News User2");
        Observer newsSubscriber3 = new Subscriber("News User3");
        Observer newsSubscriber4 = new Subscriber("News User4");

        ytSubscriber1.subscribeObservable(ytChannel);
        ytSubscriber2.subscribeObservable(ytChannel);
        ytSubscriber3.subscribeObservable(ytChannel);

        ytChannel.notifyObservers();

        ytSubscriber1.unsubscribeObservable(ytChannel);

        ytChannel.notifyObservers();

        newsSubscriber1.subscribeObservable(newsChannel);
        newsSubscriber2.subscribeObservable(newsChannel);
        newsSubscriber3.subscribeObservable(newsChannel);
        newsSubscriber4.subscribeObservable(newsChannel);

        newsChannel.notifyObservers();

        newsSubscriber3.unsubscribeObservable(newsChannel);

        newsChannel.notifyObservers();



    }
}
