package StructuralPatterns.Proxy.Example2_FailoverProxy;

public interface IAccountingAdapter {
    void postReceivable(String ReceivableEntry);
    void postSale(String Sale);
}
