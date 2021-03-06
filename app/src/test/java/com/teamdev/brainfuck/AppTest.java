/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.teamdev.brainfuck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
       String result = new Interpreter().interpret("5+++[>++++[>++>{+}>+++>+<{<}-]>+>+>->>+[<]<-]>>.>---." +
                "++{+}++..+++.>>.<-.<.+++.------.--------.>>+.>++.");
        Assertions.assertEquals("Hello World!" + System.lineSeparator(), result);

    }
}
