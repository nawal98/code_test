package codeTest;

import java.util.*;

/*
 * @author Nawal
 */
public class Q2StringLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert any input text here:"); //user input
        String str = input.nextLine();
        str = str.toLowerCase();

        System.out.println("----------");
        System.out.println("vowel");  //Vowel
        System.out.println("----------");
        char[] vowel = "aeiou".toCharArray(); //convert String of vowels into sequence of characters.
        int[] vCount = new int[vowel.length]; //define array to hold the length of vowel in integer
        for (char strChar : str.toCharArray()) { // for-each every char in a String
            for (int i = 0; i < vowel.length; i++) { //get vowel character in vowel positon
                char vowelChar = vowel[i];

                if (vowelChar == strChar) { //count number of vowels in String
                    vCount[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < vCount.length; i++) {
            if (vCount[i] >= 1) {//output vowel
                System.out.print(vowel[i] + " : " + vCount[i] + "\n");
            }
        }

        System.out.println("----------");
        System.out.println("Consonant"); //Consonant
        System.out.println("----------");
        char[] consonant = "bcdfghjklmnpqrstvwxyz".toCharArray(); //convert String of consonants into sequence of characters.
        int[] cCount = new int[consonant.length]; //define array to hold the length of consonant in integer
        for (char strChar : str.toCharArray()) { // for-each every char in a String
            for (int i = 0; i < consonant.length; i++) { //get consonant character in consonant positon
                char consonantChar = consonant[i];

                if (consonantChar == strChar) {
                    cCount[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < cCount.length; i++) {
            if (cCount[i] >= 1) {
                System.out.print(consonant[i] + ":" + cCount[i] + "\n");
            }
        }

        System.out.println("----------");
        System.out.println("Digit"); //Digit
        System.out.println("----------");
        char[] digit = "0123456789".toCharArray(); //convert String of digits into sequence of characters.
        int[] dCount = new int[digit.length]; //define array to hold the length of digit in integer
        for (char strChar : str.toCharArray()) { // for-each every char in a String
            for (int i = 0; i < digit.length; i++) { //get digit character in digit positon
                char digitChar = digit[i];

                if (digitChar == strChar) {
                    dCount[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < dCount.length; i++) {
            if (dCount[i] >= 1) {
                System.out.print(digit[i] + ":" + dCount[i] + "\n");
            }
        }

        System.out.println("--------------------");
        System.out.println("Other Character"); //Special or other Character
        System.out.println("--------------------");
        char[] specialCh = " .,;#$*()-+!@?[]|{}%^&".toCharArray();  //convert String of special characters into sequence of characters.
        int[] sCount = new int[specialCh.length];  //define array to hold the length of special characters in integer
        for (char strChar : str.toCharArray()) { // for-each every char in a String
            for (int i = 0; i < specialCh.length; i++) { //get special character in its positon
                char specialChar = specialCh[i];

                if (specialChar == strChar) {
                    sCount[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < sCount.length; i++) {
            if (sCount[i] >= 1) {
                System.out.print(specialCh[i] + ":" + sCount[i] + "\n");
            }
        }

        System.out.println("--------------------");
        System.out.println("Longest Words");//character with longest words
        System.out.println("--------------------");
        System.out.println(Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));

    }
}
