package ru.mossla.practice.secondPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondPractice {
    Scanner sc = new Scanner(System.in);
    public void base() {
        first();
        System.out.println();
        second();
        System.out.println();
        third();
        System.out.println();
        fourth();
        System.out.println();
        fifth();
        System.out.println();
        sixth();
        System.out.println();
        seventh();
        System.out.println();
        eighth();
        System.out.println();
        ninth();
        System.out.println();
        tenth();
    }

    private void first() {
        System.out.println("First task");
        Author author = new Author("John", "JohnMc@gmail.com", 'M');
        System.out.println(author.getName());
        author.setEmail("newemail@gmail.com");
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.toString());
    }

    private void second() {
        System.out.println("Second task");
        Ball ball = new Ball();
        System.out.println(ball.toString());
        ball.move(5, 5);
        System.out.println(ball.toString());
    }
    private void third() {
        System.out.println("Third task");
        Circle[] array = new Circle[5];

        Circle first = new Circle();
        first.move(5, 5);
        array[0] = first;

        Circle second = new Circle(new Point(3, 4));
        second.move(-1, -1);
        array[1] = second;

        for (Circle circle : array) {
            System.out.println(circle);
        }
    }

    private void fourth() {
        System.out.println("Fourth task");
        Shop computerShop = new Shop();
        computerShop.addComputer(new Computer(Processor.INTEL_PENTIUM, Memory._256GB));
        computerShop.addComputer(new Computer(Processor.INTEL_CORE_I5, Memory._1TB));
        computerShop.addComputer(new Computer(Processor.INTEL_PENTIUM, Memory._128GB));

        System.out.println(computerShop);

        System.out.println(computerShop.findComputersByMemory(Memory._128GB));
        System.out.println(computerShop.findComputersByProcessor(Processor.INTEL_PENTIUM));
    }

    private void fifth() {
        System.out.println("Fifth task");
        DogKennel dogKennel = new DogKennel();
        Dog dog1 = new Dog("Bobik", 2);
        Dog dog2 = new Dog("Sharik", 3);
        Dog dog3 = new Dog("Persik", 4);
        System.out.println(dog1.humanAge());
        dogKennel.add(dog1);
        dogKennel.add(dog2);
        dogKennel.add(dog3);
        System.out.println(dogKennel);
    }

    private void sixth() {
        System.out.println("Sixth task");
        Circle circle = new Circle(new Point(0, 0), 1);
        System.out.println(circle.square());
        Circle circle1 = new Circle(new Point(1, 4), 1);
        System.out.println(circle.equals(circle1));
    }

    private void seventh() {
        System.out.println("Seventh task");
        BookShelf bookShelf = new BookShelf();
        Author author = new Author("Михаил Булгаков", "bulgakov@lol.com", 'm');
        bookShelf.add(new Book(author, "Мастер и Маргарита", 1940));
        bookShelf.add(new Book(author, "Собачье сердце", 1925));
        bookShelf.add(new Book(author, "Белая гвардия", 1925));
        bookShelf.add(new Book(author, "Роковые яйца", 1925));
        System.out.println(bookShelf.size());
        bookShelf.sortByYear();
        System.out.println(bookShelf);
    }

    private void eighth() {
        System.out.println("Eighth task");
        Reverse testArray = new Reverse(new String[]{"a", "b", "c", "d", "e"});
        System.out.println(Arrays.toString(testArray.reverse()));
    }

    private void ninth() {
        System.out.println("Ninth task");
        Poker poker = new Poker();
        int n = sc.nextInt();
        poker.dealingCards(n);
    }

    private void tenth() {
        System.out.println("Tenth task");
        HowMany howMany = new HowMany();
        howMany.base();
    }
}
