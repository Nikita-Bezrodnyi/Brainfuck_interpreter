package com.teamdev.brainfuck;

import java.util.List;

public interface InstructionProcessor {

    List<RuntimeCommand> getInstruction(String program);
}


