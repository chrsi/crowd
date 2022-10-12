package at.csiber.crowd.cli;

import at.csiber.crowd.CrowdControl;
import at.csiber.crowd.cli.SystemInput;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CrowdCommandLine implements CommandLineRunner {
    private final CrowdControl crowdControl;

    public CrowdCommandLine(CrowdControl crowdControl) {
        this.crowdControl = crowdControl;
    }

    @Override
    public void run(String... args) {
        crowdControl.initialize();
        crowdControl.start();
        closeResources();
    }

    private void closeResources() {
        SystemInput.getScanner().close();
    }


}
