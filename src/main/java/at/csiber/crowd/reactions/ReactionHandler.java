package at.csiber.crowd.reactions;

import at.csiber.crowd.meetings.events.CrowdCommandEvent;

public interface ReactionHandler extends CrowdCommandEvent {
    void reactTo(String trigger);
}
