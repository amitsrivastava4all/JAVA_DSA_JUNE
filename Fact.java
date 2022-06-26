public class Fact {

        static int fact(int n){
            // Termination Case
            if(n==1){
                return n;
            }
            // Small Problem + Cycle
            int smallResult = fact(n-1);
            return n * smallResult;

        }
       public static void main(String[] args) {
        System.out.println(fact(5));
       } 
}
