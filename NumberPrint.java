public class NumberPrint {

    static void numberPrint(int n){
        // Step-3 Termination Case
        if(n==0){
            return ;
        }
        // Step-2 Processing Logic
        //System.out.println(n); // Stack Build
        //1st Step Small Problem + Put in Cycle(Recursion)
        System.out.println(n); 
        numberPrint(n-1);
         System.out.println(n); // Stack Fall

    }
    public static void main(String[] args) {
        int n = 5;
        numberPrint(n);
    }
}
