package Arrays.Utils;
import java.util.Scanner;

public class UserInput {
    public static int[] Input1D() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element "+(i+1)+" of an array: ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
