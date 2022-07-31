package behavioralPatterns.observer.example1;

public class MainProgram {
    public static void main(String[] args){

        BusinessDomainSubject businessSubject = new BusinessDomainSubject();

        UIObserver observer1 = new UIObserver(businessSubject);

        businessSubject.setValueFromBusiness(197.00);

        UIObserver observer2 = new UIObserver(businessSubject);
        businessSubject.setValueFromBusiness(677.60);

        businessSubject.unregister(observer1);

        businessSubject.setValueFromBusiness(676.40);

    }
}
