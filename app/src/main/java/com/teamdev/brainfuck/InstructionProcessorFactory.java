package com.teamdev.brainfuck;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InstructionProcessorFactory implements InstructionProcessor {


    @Override
    public List<RuntimeCommand> getInstruction(String program) {


        Deque<List<RuntimeCommand>> stack = new ArrayDeque<>();
        stack.push(new ArrayList<>());

        for (char instruction : program.toCharArray()) {

            if (instruction == '+') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getMemory().incrementCurrentCell());
            } else if (instruction == '-') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getMemory().decrementCurrentCell());
            } else if (instruction == '5') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getMemory().incrementCurrentCellByFive());
            } else if (instruction == '{') {
                stack.push(new ArrayList<>());


            } else if (instruction == '}') {

                List<RuntimeCommand> innerLoopCommands = stack.pop();

                stack.peek().add(runtimeEnvironment -> {
                    for (int i = 0; i < 3; i++) {
                        innerLoopCommands.forEach(runtimeCommand -> runtimeCommand.execute(runtimeEnvironment));
                    }
                });

            } else if (instruction == '>') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getMemory().nextCurrentCell());
            } else if (instruction == '<') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getMemory().previousCurrentCell());
            } else if (instruction == '.') {
                stack.peek().add(runtimeEnvironment -> runtimeEnvironment.getPrintStream().print(
                        (char) runtimeEnvironment.getMemory().getCurrentCellValue()));
            } else if (instruction == '[') {
                stack.push(new ArrayList<>());

            } else if (instruction == ']') {

                List<RuntimeCommand> innerLoopCommands = stack.pop();

                stack.peek().add(runtimeEnvironment -> {

                    while (runtimeEnvironment.getMemory().getCurrentCellValue() > 0) {
                        innerLoopCommands.forEach(runtimeCommand -> runtimeCommand.execute(runtimeEnvironment));
                    }
                });


            }

        }
        return stack.pop();

    }
}
