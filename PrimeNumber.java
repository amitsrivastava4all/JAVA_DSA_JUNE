public class PrimeNumber {

     

    static boolean isPrime(int n, int mod){
        if(mod ==1){
            return true;
        }
        if(n%mod==0){
            return false; // Not a Prime
        }
        return isPrime(n, mod-1);
    }

    public static void main(String[] args) {
        int n = 27;
        boolean result = isPrime(n, n-1);
        System.out.println(result?"Prime Number "+n:"Not a Prime Number "+n);
        // if(result){
        //     System.out.println("Prime Number "+n);
        // }
        // else{
        //     System.out.println("Not a Prime Number "+n);
        // }
    }
}
