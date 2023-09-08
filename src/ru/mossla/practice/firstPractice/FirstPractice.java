package ru.mossla.practice.firstPractice;
import java.util.Scanner;

public class FirstPractice {
    Scanner sc = new Scanner(System.in);
    public void first() {
        third();
        fourth();
        sixth();
        Factorial factorial = new Factorial();
        System.out.println("Input factorial");
        int fact = sc.nextInt();
        if (fact < 20 && fact >= 0) {
            factorial.factorial(fact);
            System.out.println(factorial.getStorage());
        } else {
            System.out.println("Error!");
        }
    }

    private void third() {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.print("sum is: ");
        System.out.println(sum);
        System.out.print("avg of array is: ");
        System.out.println(sum/array.length);
    }

    private void fourth() {
        int[] array = new int[10];
        int i = 0;
        while (i < array.length) {
            array[i] = sc.nextInt();
            i++;
        }
        i = 0;
        int sum = 0, mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        do {
            sum += array[i];
            mx = Math.max(mx, array[i]);
            mn = Math.min(mn, array[i]);
            i++;
        } while (i < array.length - 1);
        System.out.print("sum is: ");
        System.out.println(sum);
        System.out.print("max num is: ");
        System.out.println(mx);
        System.out.print("min num is: ");
        System.out.println(mn);
    }

    private void sixth() {
        int i = 1;
        System.out.println("Гармонический ряд: ");
        while (i < 11) {
            double tmp = (double) 1 / i;
            System.out.printf("%.3f", tmp);
            System.out.println();
            i++;
        }
    }
}

class Factorial {
    private int storage;
    public Factorial() {
        this.storage = 1;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void factorial(int cnt) {
        for (int i = 1; i <= cnt; i++) {
            storage *= i;
        }
    }
}