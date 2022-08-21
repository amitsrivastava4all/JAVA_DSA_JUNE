public class BackTrack {

    static void fillArray(int arr[], int index, int value){
        if(index == arr.length){
            return;
        }
        arr[index] = value ;
        fillArray(arr, index+1, value*2);
        arr[index] = value * -1;

    }
    public static void main(String[] args) {
        int arr[] = new int[10]; // fill with zero
        fillArray(arr, 0, 1);
        for(int e: arr){
            System.out.println(e);
        }
    }
}
