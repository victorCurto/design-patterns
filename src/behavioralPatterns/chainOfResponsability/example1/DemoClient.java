package behavioralPatterns.chainOfResponsability.example1;

import behavioralPatterns.chainOfResponsability.example1.middleware.BaseHandler;
import behavioralPatterns.chainOfResponsability.example1.middleware.ConcreteHandleA;
import behavioralPatterns.chainOfResponsability.example1.middleware.ConcreteHandleB;
import behavioralPatterns.chainOfResponsability.example1.middleware.ConcreteHandleC;
import behavioralPatterns.chainOfResponsability.example1.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoClient {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        BaseHandler baseHandler = BaseHandler.link(
                new ConcreteHandleB(2),
                new ConcreteHandleC(server),
                new ConcreteHandleA()
        );

        // Server gets a chain from client code.
        server.setMiddleware(baseHandler);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}