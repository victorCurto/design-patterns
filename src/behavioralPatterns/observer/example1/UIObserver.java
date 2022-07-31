package behavioralPatterns.observer.example1;

public class UIObserver implements Observer {

    private double valueFromBusiness;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject businessSubject;

    public UIObserver(Subject subject){
        this.businessSubject = subject;
        this.observerID = ++observerIDTracker;
        System.out.println("New BehavioralPatterns.Observer "+ this.observerID);
        subject.register(this);
    }

    @Override
    public void update(double valueFromBusiness) {
        this.valueFromBusiness = valueFromBusiness;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID+ "\nvalue: "+valueFromBusiness+"\n");
    }
}
