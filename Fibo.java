public class Fibo {

    static int fibo(int n){
        if(n == 0 || n==1){
            return n;
        }
        int firstTerm = fibo(n-1);
        int secondTerm = fibo(n-2);
        return firstTerm + secondTerm;
    }
    public static void main(String[] args) {
        int result = fibo(8);
        System.out.println(result);
    }
}
