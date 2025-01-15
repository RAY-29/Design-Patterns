package main.java.patterns.ObserverPattern.Observable;

import main.java.patterns.ObserverPattern.Observer.NotificationsAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    private List<NotificationsAlertObserver> observerList;

    private int stockCount = 0;

    public IphoneObservableImpl(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(NotificationsAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationsAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationsAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if( stockCount == 0) notifySubscribers();
        this.stockCount += newStockAdded;

    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
