package Arrays.OneDArray.Search;
import java.util.Scanner;
import Arrays.Utils.UserInput;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = UserInput.Input1D();
        System.out.println("The position of target element: "+search(arr));
    }

    /* Searching position of target element in 1Dimensional Array using linear search*/
    public static int search(int[] arr) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the target element u need to find: ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i+1;
            }
        }
        return -1; // If target element not found in an array return -1
    }
}
