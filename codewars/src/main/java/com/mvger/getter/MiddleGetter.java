package com.mvger.getter;

/**
 * D O N E
 *
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 *
 * Если длина строки четная, то выводим два символа
 * Если длина строки нечетная, то один
 *
 */

public class MiddleGetter {

    public static void main(String[] args) {
        String word = "testing";
        System.out.println(getMiddle(word));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            int middleChar1 = word.length() / 2 - 1;
            int middleChar2 = word.length() / 2 + 1;
            return word.substring(middleChar1, middleChar2);
        } else {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
    }
}
