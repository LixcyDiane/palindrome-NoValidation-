package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        returnPalindrome(); //evokes the method
    }

    public static void  returnPalindrome() {
        Scanner word = new Scanner(System.in); //Enables the keyboard
        System.out.println("Please enter a word"); //Instruction for user
        String newWord = word.nextLine(); // variable that saves input from keyboard


            String palindrome = " "; //Variable that will save the word with it's corresponding characters backwards
            System.out.println("The word you entered was " + newWord); //Message output for user


            for (int i = newWord.length() - 1; i >= 0; i--) //This for goes through each character on the string starting at the last character
            {
                palindrome = palindrome + newWord.charAt(i); // this is where the program looks for the corresponding character and continues to add it to the variable until it is finished with the iterations
            }

            System.out.println("It's palindrome is: " + palindrome); //Prints on screen the new word
        }

    }




