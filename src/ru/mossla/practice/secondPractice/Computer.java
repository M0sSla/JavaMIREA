package ru.mossla.practice.secondPractice;

public class Computer {
    private Processor processor;
    private Memory memory;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public Computer() {}

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                '}';
    }
}
