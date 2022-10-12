package at.csiber.crowd.reactions.stub;

import at.csiber.crowd.reactions.ReactionHandler;
import org.springframework.stereotype.Service;

@Service
public class EchoReactionHandler implements ReactionHandler {
    @Override
    public void reactTo(String trigger) {
        System.out.println(trigger);
    }
}
