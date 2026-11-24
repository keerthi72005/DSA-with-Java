package Arrays.OneDArray.Search;
import Arrays.Utils.UserInput;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = UserInput.Input1D();
        int[] sortArr = sort(arr);
        System.out.println("The position of a target value: "+search(sortArr));
    }

    static int search(int[] arr) {
        Scanner sc= new Scanner(System.in);

        System.out.print("\n Enter the target element u need to find: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(target==arr[mid]){
                return mid+1;
            }

            else if(target>arr[mid]){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }

        return -1;
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int j=0;
            while(j<arr.length-1){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.print(Arrays.toString(arr));
        return arr;
    }
}
