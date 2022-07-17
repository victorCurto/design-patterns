package structuralPatterns.Proxy.Example2_FailoverProxy;

public class LocalAccounting implements IAccountingAdapter{
    @Override
    public void postReceivable(String ReceivableEntry) {
        //Save the sale in a local file (to be forwarded to external accounting later)
        System.out.println("Local Accounting - postReceivable()");
    }

    @Override
    public void postSale(String Sale) {
        //Save the sale in a local file (to be forwarded to external accounting later)
        System.out.println("Local Accounting - postSale()");
    }
}
