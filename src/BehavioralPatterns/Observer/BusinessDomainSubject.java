package BehavioralPatterns.Observer;

import java.util.ArrayList;

public class BusinessDomainSubject implements Subject {

    private ArrayList<Observer> observers;
    private double valueFromBusiness;

    public BusinessDomainSubject(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("BehavioralPatterns.Observer: "+ (observerIndex+1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(valueFromBusiness);
        }
    }

    public void setValueFromBusiness(double newValueFromBusiness){
        this.valueFromBusiness = newValueFromBusiness;
        notifyObserver();
    }

}
