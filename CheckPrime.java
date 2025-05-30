import java.util.Scanner;

public class CheckPrime {
    int n;

    public CheckPrime(int n) {
        this.n = n;
    }

    public boolean primeCheck() {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                return true;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        CheckPrime obj = new CheckPrime(n);
        boolean res = obj.primeCheck();
        System.out.println(res);

    }
}
