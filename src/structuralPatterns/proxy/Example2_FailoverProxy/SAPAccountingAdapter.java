package structuralPatterns.proxy.Example2_FailoverProxy;

//Ilustrate Externall service unavailable
public class SAPAccountingAdapter implements IAccountingAdapter {

    @Override
    public void postReceivable(String ReceivableEntry) {
        throw new RuntimeException(); //Simulation unavailable externall service
        //System.out.println("SAP Accounting - postReceivable()");
    }

    @Override
    public void postSale(String Sale) {
        throw new RuntimeException(); //Simulation unavailable externall service
        //System.out.println("SAP Accounting - postSale()");
    }
}
