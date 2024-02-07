public class Day5
{
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Factorial(n));
    }
    static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * Factorial(n-1);
        }

    }
}
