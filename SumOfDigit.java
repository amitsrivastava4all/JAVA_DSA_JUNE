public class SumOfDigit {

    static int sd(int n, int sum){
            // Termination Case
            if(n==0){
                return sum;
            }
            // Pre Processing Logic
            int digit= n % 10;
            sum = sum + digit;    
            // Small Problem + Cycle
            return sd(n/10, sum);
    }
    public static void main(String[] args) {
        System.out.println( sd(123, 0));    
       
    }
}
