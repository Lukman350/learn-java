package dev.lukmann.data;

// Static block
public class StaticBlock {
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
