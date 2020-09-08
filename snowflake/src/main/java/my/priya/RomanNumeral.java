package my.priya;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral implements Comparable<RomanNumeral> {

    //how to convert a roman numeral to a standard base 10 number
    //how to convert a standard base 10 number to a Roman Numeral
    //10 is x

    private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final static String[] LETTERS = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    private final static Integer[] sub_numbers = {1000, 500, 100, 50, 10, 5, 1};
    private final static Character[] sub_letters = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};


    private Integer number;
    private String roman;

    public RomanNumeral(Integer i) {
        this.number = i;
        this.roman = convertToRoman(i);
    }

    public RomanNumeral(String xxi) {
        this.roman = xxi;
        this.number = convertRomanToInt(xxi);
    }

    public static void main(String[] args) {

        //refer : https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

        System.out.println(NUMBERS.length);
        System.out.println(LETTERS.length);
        System.out.println("Yippee..I ate all the chocolates...");

        RomanNumeral r = new RomanNumeral(10);
        System.out.println(r.toString());
    }

    private int convertRomanToInt(String str) {
        StringBuilder sb = new StringBuilder();

        //Traverse a map
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int j = 0; j < sub_numbers.length; j++) {
            charMap.put(sub_letters[j], sub_numbers[j]);
        }

        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i + 1))) {
                result = result + charMap.get(str.charAt(i));
            } else {
                result = result - charMap.get(str.charAt(i));
            }
        }
        result = result + charMap.get(str.charAt(str.length() - 1));
        return result;
    }

    private String convertToRoman(int i) {
        StringBuilder sb = new StringBuilder();

        //Traverse a map
        Map<String, Integer> mp = new LinkedHashMap<>();
        for (int j = 0; j < NUMBERS.length; j++) {
            mp.put(LETTERS[j], NUMBERS[j]);
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {

            while (i >= entry.getValue()) {
                i = i - entry.getValue();
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "RomanNumerals{" +
                "number=" + number +
                ", roman='" + roman + '\'' +
                '}';
    }

    public void setRoman(String lxxvii) {
        this.roman = lxxvii;
        this.number = convertRomanToInt(lxxvii);
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer num) {
        this.number = num;
        this.roman = convertToRoman(num);
    }

    @Override
    public int compareTo(RomanNumeral romanNumeral) {
        return romanNumeral.roman.compareTo(this.roman);
    }
}
