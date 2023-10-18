package com.mvger;

/**
 * D O N E
 *
 * Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок.
 * Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки есть соответствующая
 * ей закрывающая скобка.
 * Строка в которой закрывающая скобка идёт впереди открывающей является некорректной.
 * Например
 * (()) - корректная строка,
 * ()) - некорректная строка
 *
 * 1. Длина строки должна быть четной
 * 2. Строка должна оканчиваться char bracketCloseSymbol
 */

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        String[] parts = input.split("");

        if (parts.length % 2 != 0) {
           return false;
        }
        if (parts[0].charAt(0) == bracketCloseSymbol) {
            return false;
        } else if (parts[parts.length - 1].charAt(0) == bracketOpenSymbol) {
            return false;
        } else {
            return true;
        }
    }


    private BracketUtil() {
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного количества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного количества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{}}}}", '{', '}'));
        System.out.println("Ввод c закрывающей скобки - "
                + BracketUtil.isCorrectBrackets("}{}{}}", '{', '}'));
        System.out.println("Ввод c открывающей скобкой на конце - "
                + BracketUtil.isCorrectBrackets("{}{}{}", '{', '}'));
    }
}
