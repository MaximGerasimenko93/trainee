package converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9
 * X can be placed before L (50) and C (100) to make 40 and 90
 * C can be placed before D (500) and M (1000) to make 400 and 900
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * <p>
 * 1. Сделать хранение символов
 * 2. Преобразовать строку в массив
 * 3. Подумать как проверить, что значение предыдущего ключа больше или меньше следующего
 * 4. Вывести итоговое значение
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] symbols = s.split("");
        int result = 0;
        int previousSymbol = 0;

        for (String symbol : symbols) {
            int currentSymbol = map.get(symbol);

            if (currentSymbol > previousSymbol) {
                result = result + (currentSymbol - 2 * previousSymbol);
            } else {
                result = result + currentSymbol;
            }
            previousSymbol = currentSymbol;
        }
        return result;
    }
}


