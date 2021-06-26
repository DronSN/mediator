package ru.skvrez.mediator;

public class Button {
    private String action;
    private Mediator mediator;

    public Button(String title, Mediator mediator) {
        this.action = title;
        this.mediator = mediator;
    }

    public String getAction() {
        return action;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void push() {
        if (mediator != null) {
            mediator.notify(action);
        }
    }
}
