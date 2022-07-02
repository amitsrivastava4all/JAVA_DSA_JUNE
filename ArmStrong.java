public class ArmStrong {

    static int armStrongNumber(int n, int sum){
        if(n == 0){
            return sum;
        }
        int singleDigit = n%10;
        int cube = singleDigit * singleDigit * singleDigit;
        sum = sum + cube;
        return armStrongNumber(n/10, sum);
    }  
    public static void main(String[] args) {
        int n = 100;
        int result = armStrongNumber(n,0);
        System.out.println(n == result ?" Armstrong ":"Not ");
    }
}
