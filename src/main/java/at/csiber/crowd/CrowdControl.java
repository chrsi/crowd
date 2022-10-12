package at.csiber.crowd;

import at.csiber.crowd.meetings.ChatListener;
import at.csiber.crowd.reactions.ReactionHandler;
import org.springframework.stereotype.Service;

@Service
public class CrowdControl {
    private final ChatListener chatListener;
    private final ReactionHandler reactionHandler;

    public CrowdControl(ChatListener chatListener, ReactionHandler reactionHandler) {
        this.chatListener = chatListener;
        this.reactionHandler = reactionHandler;
    }

    public void initialize() {
        chatListener.registerReactionHandler(reactionHandler);
    }

    public void start() {
        chatListener.start();
    }
}
