/* Title Case Converter
Question: Write a class TitleCase to convert each word in a sentence to Title Case (i.e., the first letter of each word is capitalized).
Class Name: TitleCase
Data Members:
String line;
Member Methods:
Constructor to assign the string
void convert() – displays the sentence in title case
Sample Input/Output:
Input:  java is powerful  
Output: Java Is Powerful */


import java.util.Scanner;

public class TitleCase {
    String line;

    // Constructor to assign the string
    public TitleCase(String input) {
        line = input;
    }

    // Method to convert and display the string in Title Case
    public void convert() {
        String[] words = line.split(" ");
        StringBuilder titleCaseLine = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCaseLine.append(Character.toUpperCase(word.charAt(0)));
                titleCaseLine.append(word.substring(1).toLowerCase());
                titleCaseLine.append(" ");
            }
        }

        // Trim the final result to remove any extra space at the end
        System.out.println("Output: " + titleCaseLine.toString().trim());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String sentence = sc.nextLine();

        TitleCase obj = new TitleCase(sentence);
        obj.convert();
sc.close();
    }
}
