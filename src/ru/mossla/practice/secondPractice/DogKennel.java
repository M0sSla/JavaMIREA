package ru.mossla.practice.secondPractice;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void add(Dog dog) {
        dogs.add(dog);
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
