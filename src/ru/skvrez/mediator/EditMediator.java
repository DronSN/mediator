package ru.skvrez.mediator;

public class EditMediator implements Mediator{
    @Override
    public void notify(String event) {
        if (event.equals("insert")) {
            System.out.println("Insert button pushed");
        } else if (event.equals("delete")) {
            System.out.println("Delete button pushed");
        } else {
            System.out.println("Unknown button pushed");
        }
    }
}
