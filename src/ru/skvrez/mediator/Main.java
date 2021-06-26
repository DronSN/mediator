package ru.skvrez.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator editMediator = new EditMediator();
        Mediator authMediator = new AuthenticationMediator();

        Button editButton = new Button("edit", editMediator);
        editButton.push();

        Button insertButton = new Button("insert", editMediator);
        insertButton.push();

        Button deleteButton = new Button("delete", editMediator);
        deleteButton.push();

        Button loginButton = new Button("login", authMediator);
        loginButton.push();

        Button logoutButton = new Button("logout", authMediator);
        logoutButton.push();
    }
}
