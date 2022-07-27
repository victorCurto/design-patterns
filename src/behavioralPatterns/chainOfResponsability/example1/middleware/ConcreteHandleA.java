package behavioralPatterns.chainOfResponsability.example1.middleware;

/**
 *  Checks a user's role.
 */
public class ConcreteHandleA extends BaseHandler {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}