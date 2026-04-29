package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String text){
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static String convertDecimalToBinary(int rakam){
        if(rakam == 0){
            return "0";
        }
        String binary = "";
        while (rakam > 0){
            int kalan = rakam % 2;
            binary = kalan + binary;
            rakam = rakam / 2;
        }
        return binary;
    }

}