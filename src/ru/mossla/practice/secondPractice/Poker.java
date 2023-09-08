package ru.mossla.practice.secondPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    private ArrayList<Card> deck;

    public Poker() {
        ArrayList<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(Suit.getByIndex(i), Rank.getByIndex(j)));
            }
        }
        Collections.shuffle(deck);
        this.deck = deck;
    }

    public void dealingCards(int n) {
        if (n > 2 && n < 9) {
            for (int i = 0; i < n; i++) {
                System.out.println("Player " + (i + 1) + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.println(deck.get(i * 5 + j));
                }
            }
        } else {
            System.out.println("Incorrect count of players!");
        }
    }
}

class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + ", " + rank;
    }
}

enum Suit {
    DIAMONDS, HEARTS, SPADES, CLUBS;
    public static Suit getByIndex(int index) {
        return Suit.values()[index];
    }
}

enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    public static Rank getByIndex(int index) {
        return Rank.values()[index];
    }
}