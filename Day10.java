// Bubble sort

// Programmed on : 10-02-2024
// Programmed by : Tanushree Dour

import java.util.Arrays;

public class Day10
{
    public static void main(String[] args) {
        int[] arr = {2, 3 , 4, 43, 21, 65};
        System.out.println("Sorted array : " + Arrays.toString(BubbleSort(arr)));
    }
    static int[] BubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
}
