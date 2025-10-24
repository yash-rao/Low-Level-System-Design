package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MessageAlertObserver implements NotificationAlertObserver {
    String phone;
    StockObservable stock;

    public MessageAlertObserver(String phone, StockObservable stock){
        this.phone = phone;
        this.stock = stock;
    }

    @Override
    public void update(){
        sendMsg();
    }

    public void sendMsg(){
        System.out.println("Message Sent to "+phone);
    }
}
