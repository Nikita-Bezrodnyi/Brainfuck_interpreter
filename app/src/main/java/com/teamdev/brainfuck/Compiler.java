package com.teamdev.brainfuck;

import java.util.List;


public class Compiler {
    List<RuntimeCommand> compile(String program) {
        InstructionProcessorFactory instructionProcessorFactory = new InstructionProcessorFactory();
        return instructionProcessorFactory.getInstruction(program);
    }
}

