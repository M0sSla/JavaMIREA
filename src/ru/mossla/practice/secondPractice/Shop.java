package ru.mossla.practice.secondPractice;

import java.util.ArrayList;
import java.util.Objects;

public class Shop {
    private final ArrayList<Computer> computerList = new ArrayList<>();

    public void addComputer(Computer computer) {
        computerList.add(computer);
    }

    public ArrayList<Computer> findComputersByProcessor(Processor processor) {
        ArrayList<Computer> result = new ArrayList<Computer>();
        for (Computer computer : computerList) {
            if (Objects.equals(computer.getProcessor(), processor)) {
                result.add(computer);
            }
        }
        return result;
    }

    public ArrayList<Computer> findComputersByMemory(Memory memory) {
        ArrayList<Computer> result = new ArrayList<Computer>();
        for (Computer computer : computerList) {
            if (Objects.equals(computer.getMemory(), memory)) {
                result.add(computer);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computerList=" + computerList +
                '}';
    }
}
