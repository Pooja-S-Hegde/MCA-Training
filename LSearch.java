import java.util.Scanner;

public class LSearch {

    public void LinearSearch(int arr[], int tar) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                flag = 1;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("Search success");
        } else {
            System.out.println("Search unsuccess");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter  array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a target element:");
        int tar = sc.nextInt();
        LSearch obj = new LSearch();
        obj.LinearSearch(arr, tar);

    }
}
