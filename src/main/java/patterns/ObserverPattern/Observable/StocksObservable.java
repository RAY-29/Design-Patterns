package main.java.patterns.ObserverPattern.Observable;

import main.java.patterns.ObserverPattern.Observer.NotificationsAlertObserver;

public interface StocksObservable {

    public void add(NotificationsAlertObserver observer);

    public void remove(NotificationsAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
