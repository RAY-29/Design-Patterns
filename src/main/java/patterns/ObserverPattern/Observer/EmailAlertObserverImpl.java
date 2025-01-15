package main.java.patterns.ObserverPattern.Observer;

import main.java.patterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationsAlertObserver{

    private String emailId;

    private StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Hello");
    }

    public void sendMail(String emailId, String msg){
        System.out.println(msg + " sent to : " + emailId);
    }
}
