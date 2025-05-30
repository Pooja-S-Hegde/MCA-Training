/*17. Design a class overloading and a function display() as follows:

(i) void display(String str, int p) with one String argument and one integer argument.
It displays all the uppercase characters if p is 1 (one); otherwise, it displays all the lowercase characters.

(ii) void display(String str, char chr) with one String argument and one character argument.
It displays all the vowels if chr is v; otherwise, it displays all the alphabets. */

import java.util.Scanner;

public class ConstOverload {
    public void display(String s, int p) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (p == 1 && Character.isUpperCase(ch)) {
                System.out.println(ch);
            } else if (p != 1 && Character.isLowerCase(ch)) {
                System.out.println(ch);
            }
        }
    }

    public void display(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (c == 'v') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch);
                }
            }

            else {
                System.out.println(ch);

            }
        }

    }

    public static void main(String[] args) {
        ConstOverload obj = new ConstOverload();
        
        // obj.display("ComPuTeR", 1);
        // obj.display("computer", 'v');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("Enter a number");
        int p=sc.nextInt();
         obj.display(s,p);
        System.out.println("Enter a Character:");
        char c=sc.next().charAt(0);
        obj.display(s, c);

    }
}
