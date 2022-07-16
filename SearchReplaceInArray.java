public class SearchReplaceInArray {

   static boolean searchAndReplaceRec(int arr[], int index, int search , int replace){
        if(index == arr.length){
            return false;
        }
        if(arr[index]==search){
            arr[index] = replace;
            return true;
        }
        return searchAndReplaceRec(arr, index+1, search, replace);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int search = 40;
        int replace = 400;

        boolean result = searchAndReplaceRec(arr, 0, search, replace);
        if(result){
            for(int element : arr){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        else{
        System.out.println("Element Not Found...");
        }
        // boolean isFound = false;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] ==search){
        //         arr[i] = replace;
        //         System.out.println("Found and Replace");
        //         isFound = true;
        //         break ;
        //     }
        // }
        // if(isFound){
        //     for(int element : arr){
        //         System.out.print(element+" ");
        //     }
        //     System.out.println();
        // }
        // else{
        // System.out.println("Element Not Found...");
        // }
       
    }
}
