package StructuralPatterns.Proxy.Example2_FailoverProxy;


public class Test_pattern {
    public static void main(String[] args) {
        Register register = new Register();

        register.makePayment();
    }
}
