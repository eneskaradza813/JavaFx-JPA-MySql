package app.controller.events;

import javafx.event.Event;
import javafx.event.EventHandler;

public class CancelEvent implements EventHandler<Event>{

    @Override
    public void handle(Event event) {
        System.exit(0);
    }

    
}
