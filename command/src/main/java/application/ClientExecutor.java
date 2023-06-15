package application;

import application.command.FirstCommand;
import application.command.SecondCommand;
import application.command.ThirdCommand;
import application.model.TransientRequest;

import java.util.List;

public class ClientExecutor {
    public static void main(String[] args) {
        List<Command> commandList = List.of(new FirstCommand(), new SecondCommand(), new ThirdCommand());
        TransientRequest transientRequest = new TransientRequest();

        commandList.forEach(command -> command.execute(transientRequest));
    }
}
