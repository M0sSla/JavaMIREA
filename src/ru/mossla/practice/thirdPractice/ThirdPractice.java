package ru.mossla.practice.thirdPractice;

import ru.mossla.practice.secondPractice.Circle;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdPractice {
    Scanner sc = new Scanner(System.in);
    public void base() {
        //System.out.println("First part of practice");
        //firstM();
        //System.out.println("\n");
        //secondM();
        //System.out.println(thirdM());
        //fourthM();

        System.out.println("Second part of practice");
        firstShell();
    }

    private void outputArray(double[] a) {
        for (Double v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    private void outputArray(int[] a) {
        for (Integer v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    private void firstM() {
        System.out.println("1 task on Math and Rand.");
        System.out.println("Via Math");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Math.random();
        }
        outputArray(array);
        Arrays.sort(array);
        outputArray(array);
        System.out.println("Via Rand");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextDouble();
        }
        outputArray(array);
        Arrays.sort(array);
        outputArray(array);
    }

    /**
     * Ещё не сделано
     */
    private void secondM() {
        Circle circle = new Circle();
    }

    private String thirdM() {
        System.out.println("3 task on Math and Rand.");
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(10, 100);
        }
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 1; i < 4; i++) {
            if (arr[i - 1] >= arr[i]) {
                return "False";
            }
        }
        return "True";
    }

    private void fourthM() {
        int n = sc.nextInt(), cnt = 0;
        Random rand = new Random();
        while (n < 2) {
            System.out.println(n + " is incorrect!");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(0, n);
            if (arr[i] % 2 == 0)
                cnt++;
        }
        System.out.println("all numbers:");
        outputArray(arr);
        System.out.println("even numbers:");
        if (cnt != 0) {
            int[] evenArr = new int[cnt];
            outputArray(evenArr);
        }
    }

    private void firstShell() {
        System.out.println("first task:");
        Double d = Double.valueOf(122);
        d = Double.parseDouble("12");
        int i = (int) (double) d;
        byte b = (byte) (double) d;
        short s = (short) (double) d;
        long l = (long) (double) d;
        float f = (float) (double) d;
        boolean bool = (d != 0) ? true : false;
        char ch = (char) (double) d;

        System.out.println(d);
        String str = Double.toString(3.14);
    }
    private void secondShell() {
        ;
    }
}
