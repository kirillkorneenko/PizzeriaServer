package by.bsuir.pizzeria.email;

import by.bsuir.pizzeria.beans.users.User;
import org.springframework.context.ApplicationEvent;


public class OnRegistrationCompleteEvent extends ApplicationEvent {
    private User user;

    public OnRegistrationCompleteEvent(
            User user) {
        super(user);

        this.user = user;

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}