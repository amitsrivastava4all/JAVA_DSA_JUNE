public class Pow {

    static int power(int x, int pow){
        // Termination case
        if(pow ==0){
            return 1;
        }
        // Small Problem + Cycle
        int smallResult = power(x, pow-1);
        return x * smallResult; 
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
        
    }
}
