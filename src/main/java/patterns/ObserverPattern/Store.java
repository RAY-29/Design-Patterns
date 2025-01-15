package main.java.patterns.ObserverPattern;

import main.java.patterns.ObserverPattern.Observable.IphoneObservableImpl;
import main.java.patterns.ObserverPattern.Observable.StocksObservable;
import main.java.patterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import main.java.patterns.ObserverPattern.Observer.NotificationsAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationsAlertObserver observer1 = new EmailAlertObserverImpl("xyz", iphoneObservable);
        NotificationsAlertObserver observer2 = new EmailAlertObserverImpl("abc", iphoneObservable);
        NotificationsAlertObserver observer3 = new EmailAlertObserverImpl("ert", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
