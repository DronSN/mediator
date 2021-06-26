package ru.skvrez.mediator;

public class AuthenticationMediator implements Mediator{
    @Override
    public void notify(String event) {
        if (event.equals("login")) {
            System.out.println("Login button pushed");
        } else if (event.equals("logout")) {
            System.out.println("Logout button pushed");
        } else {
            System.out.println("Unknown button pushed");
        }
    }
}
