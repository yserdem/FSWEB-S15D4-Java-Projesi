package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

        System.out.println("***********************");
        System.out.println(isPalindromeQueue("abccba"));
        System.out.println(isPalindromeQueue("Was it a car or a cat I saw ?"));
        System.out.println(isPalindromeQueue("I did, did I?"));
        System.out.println(isPalindromeQueue("hello"));
        System.out.println(isPalindromeQueue("Don't node"));

        System.out.println("***********************");
        System.out.println(decimalToBinary(32));
        System.out.println(decimalToBinary(142));
        System.out.println(decimalToBinary(57));
        System.out.println(decimalToBinary(13));

    }

    public static boolean checkForPalindrome(String text) {
        String lowerCaseText = text.toLowerCase(new Locale("English"));
        String[] splitText = lowerCaseText.split("");
        Stack<String> panlindromeStack = new Stack<>();
        LinkedList<String> palindromeList = new LinkedList<>();

        for (String letter:splitText) {
            if (letter.matches("[a-z]")){
                panlindromeStack.push(letter);
                palindromeList.push(letter);
            }
        }
        return (palindromeList.equals(panlindromeStack));
    }

    public static boolean isPalindromeQueue(String text) {
        Stack<String> textStack = new Stack<>();
        Queue<String> textQueue = new LinkedList<>();
        String lowerCaseText = text.toLowerCase(new Locale("English"));
        String[] splitText = lowerCaseText.split("");

        for (String letter:splitText) {
            if (letter.matches("[a-z]")) {
                textQueue.add(letter);
                textStack.push(letter);
            }
        }

        while (!textQueue.isEmpty()) {
            if (!textQueue.remove().equals(textStack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static String decimalToBinary(int number) {
        Stack<Integer> integerStack = new Stack<>();
        StringBuilder binaryString = new StringBuilder();
        while (number >= 2) {
            integerStack.push(number % 2);
            number = number / 2;
        }
        while (!integerStack.isEmpty()) {
            binaryString.append(integerStack.pop());
        }
        return binaryString.toString();
    }
}