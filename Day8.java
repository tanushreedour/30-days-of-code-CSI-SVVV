// Reverse of an array
// Programmed on: 09-02-2024
// Programmed by: Tanushree Dour

import java.util.Arrays;

public class Day8
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 1, 6, 9};
        System.out.println(Arrays.toString(Rev(arr)));
    }
    static int[] Rev(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int temp;

        // Time complexity: O(n)
        while(i <= j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
