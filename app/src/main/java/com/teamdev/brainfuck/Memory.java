package com.teamdev.brainfuck;

public class Memory {

    private final byte[] cells = new byte[64];
    private int dataPointer;


    public void incrementCurrentCell() {
        cells[dataPointer]++;
    }

    public void decrementCurrentCell() {
        cells[dataPointer]--;
    }

    public void nextCurrentCell() {
        dataPointer++;
    }

    public void previousCurrentCell() {
        dataPointer--;
    }

    public byte getCurrentCellValue() {
        return cells[dataPointer];
    }

    public void incrementCurrentCellByFive() {

        cells[dataPointer] = (byte) (cells[dataPointer] + 5);
    }

}
