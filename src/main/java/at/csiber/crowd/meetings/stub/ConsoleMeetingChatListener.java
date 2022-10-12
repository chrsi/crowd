package at.csiber.crowd.meetings.stub;

import at.csiber.crowd.cli.SystemInput;
import at.csiber.crowd.meetings.ChatListener;
import at.csiber.crowd.meetings.events.CrowdCommandEventListener;
import at.csiber.crowd.reactions.ReactionHandler;
import org.springframework.stereotype.Service;

@Service
public class ConsoleMeetingChatListener implements ChatListener {
    private final CrowdCommandEventListener<ReactionHandler> eventListener;

    public ConsoleMeetingChatListener(CrowdCommandEventListener<ReactionHandler> eventListener) {
        this.eventListener = eventListener;
    }

    @Override
    public void registerReactionHandler(ReactionHandler reactionHandler) {
        eventListener.add(reactionHandler);
    }

    @Override
    public void start() {
        String line = "";
        while (!line.equalsIgnoreCase("exit"))
        {
            line = SystemInput.getScanner().nextLine();
            eventListener.triggerCommand(line);
        }
        System.out.println("gone!");
    }
}
