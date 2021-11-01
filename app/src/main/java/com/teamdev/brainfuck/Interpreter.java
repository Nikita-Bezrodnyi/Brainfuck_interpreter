package com.teamdev.brainfuck;

import java.util.List;

/*
*Program which execute brainfuck into java
* */
public class Interpreter {

    public String interpret(String program){

        List<RuntimeCommand> commandList = new Compiler().compile(program);
        return new Executor().execute(commandList);

    }

}
