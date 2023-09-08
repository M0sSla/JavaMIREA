package ru.mossla.practice.secondPractice;

import java.util.Scanner;

public class HowMany {

    public HowMany() {
    }

    public void base() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int count = words.length;
        System.out.println("Количество слов: " + count);
    }
}
