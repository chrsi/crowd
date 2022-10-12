package at.csiber.crowd.meetings;

import at.csiber.crowd.reactions.ReactionHandler;

public interface ChatListener {
    void registerReactionHandler(ReactionHandler reactionHandler);
    void start();
}
