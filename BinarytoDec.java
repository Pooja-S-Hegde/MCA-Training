import java.util.Scanner;

public class BinarytoDec{
   
    public static void btod(int binN){
        int myN=binN;
    int power=0,dec=0;
    while(binN>0){
        int lastDigit=binN%10;
        dec=dec+lastDigit*(int)Math.pow(2,power);
        power++;
        binN=binN/10;
    }
    System.out.println("Decimal of Binary number "+myN+"="+dec);

}
public static void decToBin(int dec){
    int binN = 0;
    int pow=0;
    int myN=dec;
    while(dec>0){
        int rem=dec%2;
        binN=binN+(rem*(int)Math.pow(10, pow));
pow++;
dec=dec/2;

    }
    System.out.println("Binary form of Decimal number"+myN+"="+binN);
}
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("\nEnter a binary number to convert it into decimal:");
         int num=sc.nextInt();
        btod(num);
        System.out.println("\nEnter a decimal number to convert it into binary:");
         int num1=sc.nextInt();
         decToBin(num1);
    }
}