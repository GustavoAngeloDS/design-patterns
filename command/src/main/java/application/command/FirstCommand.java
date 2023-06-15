package application.command;

import application.Command;
import application.service.Service;
import application.model.TransientRequest;

public class FirstCommand implements Command {

    Service service = new Service();

    @Override
    public void execute(TransientRequest transientRequest) {
        service.performAction(transientRequest);
    }
}
