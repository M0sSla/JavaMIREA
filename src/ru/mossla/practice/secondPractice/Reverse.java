package ru.mossla.practice.secondPractice;

public class Reverse {
    private String[] array = new String[10];

    public Reverse(String[] array) {
        this.array = array;
    }

    public String[] reverse() {
        String tmp;
        int length = array.length;
        for (int i = 0; i < length/2; i++) {
            tmp = array[length-i-1];
            array[length-i-1] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
