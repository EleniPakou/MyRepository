package w2d3;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(fibonacci(7));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static long fibonacci(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
