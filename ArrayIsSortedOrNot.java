public class ArrayIsSortedOrNot {

    static boolean isSorted(int []prices, int index){
        if(index == prices.length-1){
            return true;
        }
        if(prices[index]>prices[index+1]){
            return false;
        }
        return isSorted(prices, index+1);
    }


    public static void main(String[] args) {
        //int price = 900;
        int prices [] = {1000,2000,5000,7000, 9000};
        int index = 0;
        boolean result = isSorted(prices, index);
        System.out.println(result?"Sorted ":"Not Sorted");

    }
}
