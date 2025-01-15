package main.java.patterns.ObserverPattern.Observer;

import main.java.patterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationsAlertObserver{

    String username;

    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable stocksObservable){
        this.username = username;
        this.observable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(username, "Hello");

    }

    public void sendMail(String username, String msg){
        System.out.println(msg + " sent to : " + username);
    }
}
