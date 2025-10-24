package ObserverPattern.Observable;
import java.util.*;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneStocksObservable implements StockObservable {
    List<NotificationAlertObserver> objList = new ArrayList<>();
    int currentStock = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        objList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        objList.remove(observer);
    }

    @Override
    public void notifyme(){
        for(NotificationAlertObserver obj: objList){
            obj.update();
        }
    }

    @Override
    public void set(int stock){
        if(currentStock==0){
            notifyme();
        }
        currentStock = stock;
    }
}
