package chapter5;

import java.util.Scanner;

public class pratic___loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Prompt the user for input
                System.out.println("Please enter a string: ");
                String input = scanner.nextLine();

                int vowelCount = 0;
                int consonantCount = 0;

                String vowels = "aeiouAEIOU";

                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (Character.isLetter(ch)) {
                        if (vowels.indexOf(ch) <= -1) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }

                // Display the results
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);

                scanner.close();
            }
        }

