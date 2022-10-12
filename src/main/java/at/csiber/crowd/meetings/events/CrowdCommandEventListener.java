package at.csiber.crowd.meetings.events;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CrowdCommandEventListener<T extends CrowdCommandEvent> {
    Set<T> eventHandler = new HashSet<>();

    public void add(T reactionHandler) {
        eventHandler.add(reactionHandler);
    }

    public void triggerCommand(String command) {
        for (T handler : eventHandler) {
            handler.reactTo(command);
        }
    }
}
