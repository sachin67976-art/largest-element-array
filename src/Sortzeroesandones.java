import java.util.Scanner;

public class Sortzeroesandones {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortzeroesandones(int[] arr) {
        int n = arr.length;
        int zeroes = 0;

        // Count number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // Put zeroes first and ones after them
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printarray(arr);

        sortzeroesandones(arr);

        System.out.println("Sorted array:");
        printarray(arr);

        sc.close();
    }
}