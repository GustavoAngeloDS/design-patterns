package application;

import application.model.TransientRequest;

public interface Command {
    void execute(TransientRequest transientRequest);
}
