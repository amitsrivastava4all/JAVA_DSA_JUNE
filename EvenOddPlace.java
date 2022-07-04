import java.util.ArrayList;

public class EvenOddPlace {
    static int evenOdd(int n, ArrayList<Integer> list){
        if(n==0){
            return 0;
        }
        int count = 1 + evenOdd(n/10, list);
        int rem = n % 10;
        if(count%2==0){
            if(list.size()==1){
                list.add(rem);
            }
            else{
                list.set(1,rem + list.get(1));
            }
           }
        else{
            if(list.size()==0){
                list.add(rem);
            }
            else{
                list.set(0,rem + list.get(0));
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7193;
        
        ArrayList<Integer> list = new ArrayList<>();
        evenOdd(n, list);
        System.out.println(list);
    }
}
