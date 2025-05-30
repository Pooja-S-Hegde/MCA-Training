/*Write a program to input a number and check whether it is a perfect number or not.
(A perfect number is a positive integer that equals the sum of its proper divisors (divisors excluding the number itself). 
For example, 6 is a perfect number because 1 + 2 + 3 = 6.) */
import java.util.Scanner;

public class perfecN {
    int num;

    public perfecN(int n) {
        num = n;
    }

    public Boolean CheckPerfect() {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return num == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a number:");
            int num = sc.nextInt();
            perfecN obj = new perfecN(num);
            Boolean res = obj.CheckPerfect();
            if (res) {
                System.out.println(num + " is a perfect prime number");
            } else {
                System.out.println(num + " is not a perfect prime number");

            }
        }
    }

}
