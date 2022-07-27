package behavioralPatterns.chainOfResponsability.example1.middleware;

import behavioralPatterns.chainOfResponsability.example1.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class ConcreteHandleC extends BaseHandler {
    private Server server;

    public ConcreteHandleC(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}