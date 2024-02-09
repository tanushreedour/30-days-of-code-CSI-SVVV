// Linear search

import java.util.Arrays;

public class Day9
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8, 10};
        int target = 6;
        System.out.println("Position of " + target + " in the array " + Arrays.toString(arr) + " is : " + Search(arr, target));
    }
    static int Search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1;  // Element not present in the array
    }
}
