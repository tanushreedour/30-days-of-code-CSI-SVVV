public class Day7
{
    public static void main(String[] args) {
        double[] arr = {2.12, 3, 1.45, 4.23, 5.65};
        System.out.printf("Sum of array elements is: %.3f", ArraySum(arr));
    }
    static double ArraySum(double[] arr){
        double sum = 0.0;
        for(double n : arr){
            sum += n;
        }
        return sum;
    }
}
