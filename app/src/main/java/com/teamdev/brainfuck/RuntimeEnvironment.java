package com.teamdev.brainfuck;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class RuntimeEnvironment {
    private final Memory memory = new Memory();

    private final OutputStream actualOutput = new ByteArrayOutputStream();

    private final PrintStream printStream = new PrintStream(actualOutput);

    public String getProgramOutput() {
        return actualOutput.toString();
    }

    public PrintStream getPrintStream(){
        return printStream;
    }

    public Memory getMemory() {

        return memory;
    }
}
