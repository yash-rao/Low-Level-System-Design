package ObserverPattern;

import ObserverPattern.Observable.IphoneStocksObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MessageAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String arg[]){
        StockObservable iphone = new IphoneStocksObservable();
        NotificationAlertObserver observer_1= new EmailAlertObserver("yash@gmail.com", iphone);
        NotificationAlertObserver observer_2= new MessageAlertObserver("88788889877", iphone);
        iphone.add(observer_1);
        iphone.add(observer_2);

        iphone.set(10);
        iphone.set(0);
        iphone.set(10);
    }
}
