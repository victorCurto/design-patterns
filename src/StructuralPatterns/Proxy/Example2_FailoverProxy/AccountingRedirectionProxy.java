package StructuralPatterns.Proxy.Example2_FailoverProxy;

public class AccountingRedirectionProxy implements IAccountingAdapter{

    IAccountingAdapter externalAccounting;
    IAccountingAdapter localAccounting;

    AccountingRedirectionProxy(){
        externalAccounting = new SAPAccountingAdapter();
        localAccounting = new LocalAccounting();
    }

    @Override
    public void postReceivable(String ReceivableEntry) {
        try{
            externalAccounting.postReceivable(ReceivableEntry);
        }catch (Exception e){
            localAccounting.postReceivable(ReceivableEntry);
        }
    }

    @Override
    public void postSale(String Sale) {
        try{
            externalAccounting.postSale(Sale);
        }catch (Exception e){
            localAccounting.postSale(Sale);
        }
    }
}
