package ru.mossla.practice;

import ru.mossla.practice.secondPractice.SecondPractice;
import ru.mossla.practice.thirdPractice.ThirdPractice;

public class Main {
    public static void main(String[] args) {
        SecondPractice secondPractice = new SecondPractice();
        secondPractice.base();
        //ThirdPractice thirdPractice = new ThirdPractice();
        //thirdPractice.base();
    }

    /**
     * Задание из первой практической - 5 задание
     * @param args - передаваемые аргументы
     */
    private static void fifth(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}