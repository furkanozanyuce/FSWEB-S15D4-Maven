package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("Racecar")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true

        lines();

        WorkintechList<String> stringList = new WorkintechList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");
        stringList.add("apple");
        System.out.println(stringList);

        lines();

        stringList.remove("cherry");
        System.out.println(stringList);

        WorkintechList<Integer> numberList = new WorkintechList<>();
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(2);
        System.out.println(numberList);

        lines();

        numberList.remove(Integer.valueOf(8));
        System.out.println(numberList);

        lines();

        System.out.println(convertDecimalToBinary(5)); // 101
        System.out.println(convertDecimalToBinary(10)); // 1010
        System.out.println(convertDecimalToBinary(13)); // 1101
        System.out.println(convertDecimalToBinary(8)); // 1000

    }


    public static boolean checkForPalindrome(String word) {
        word = word.trim().toLowerCase(Locale.ENGLISH);
        word = word.replaceAll("[^a-z0-9]", "");
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }

    public static String convertDecimalToBinary(int number) {
        String s = "";
        while (number != 0) {
            int rem = number % 2;
            number /= 2;
            s = rem + s;
        }
        return s;
    }

    public static void lines() {
        System.out.println("--------------------------");
    }

}