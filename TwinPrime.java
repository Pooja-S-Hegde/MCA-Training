import java.util.Scanner;

public class TwinPrime {
    int n1, n2;

    public TwinPrime(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

   
    public boolean twinPrime() {
        if (isPrime(n1) && isPrime(n2) && Math.abs(n1 - n2) == 2)
            return true;
        else
            return false;
    }

    //  method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        TwinPrime obj = new TwinPrime(n1, n2);
        boolean res = obj.twinPrime();
        System.out.println(res);
    }
}
