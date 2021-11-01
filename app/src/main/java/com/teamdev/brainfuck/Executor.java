package com.teamdev.brainfuck;

import java.util.List;
import java.util.function.Consumer;

public class Executor {
    String execute(List<RuntimeCommand> runtimeCommandList) {
        RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment();
        runtimeCommandList.forEach(runtimeCommand -> runtimeCommand.execute(runtimeEnvironment));
        return runtimeEnvironment.getProgramOutput();
    }
}
