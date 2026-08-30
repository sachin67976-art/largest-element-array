import java.util.Scanner;

public class secondapproach {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortzeroesandones(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Left ko 1 dhundhne ke liye aage badhao
            if (arr[left] == 0) {
                left++;
            }

            // Right ko 0 dhundhne ke liye peeche lao
            else if (arr[right] == 1) {
                right--;
            }

            // Left par 1 aur right par 0 hai
            else {
                swap(arr, left, right);
                left++;
                right--;
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