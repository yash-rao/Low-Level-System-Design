package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    String email;
    StockObservable stock;

    public EmailAlertObserver(String email, StockObservable stock){
        this.email = email;
        this.stock = stock;
    }

    @Override
    public void update(){
        sendEmailMsg();
    }

    public void sendEmailMsg(){
        System.out.println("Email Sent to "+email);
    }
}
