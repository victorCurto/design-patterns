package behavioralPatterns.chainOfResponsability.example1.middleware;

public abstract class BaseHandler {
    private BaseHandler next;

    public static BaseHandler link(BaseHandler first, BaseHandler... chain) {
        BaseHandler head = first;
        for (BaseHandler nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }


    public abstract boolean check(String email, String password);


    protected boolean checkNext(String email, String password) {
        if (next == null)
            return true;
        return next.check(email, password);
    }
}
