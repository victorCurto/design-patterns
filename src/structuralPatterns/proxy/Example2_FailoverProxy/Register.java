package structuralPatterns.proxy.Example2_FailoverProxy;

public class Register {
    IAccountingAdapter accounting;

    Register(){
        accounting = new AccountingRedirectionProxy();
    }

    public void makePayment(){
        System.out.println("makePayment");
        completeSaleHandling();
    }

    private void completeSaleHandling(){
        accounting.postSale("CurrentSale");
    }
}
