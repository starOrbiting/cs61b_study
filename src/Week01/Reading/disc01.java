package Week01.Reading;

public class disc01 {
    public static int fib(int n){
        int f0 = 0;
        int f1 = 1;
        int fibn = 0;
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            for (int i = 2; i < n; i++){
                fibn = f0 + f1;
                f0 = f1;
                f1 = fibn;
            }
            return fibn;

        }


    }
    /** 递归 */
    public static int fib2(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fib2(n-1) + fib2(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib2(6));
        System.out.println(LargerDemo.larger(3,10));
    }
}
