import java.util.ArrayList;

public class Perm {
    public static void main(String[] args) {
        System.out.println(getPermutation("abc"));
    }
    static ArrayList<String> getPermutation(String str){
        if(str.length() ==0){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        char singleChar= str.charAt(0);
        String smallString = str.substring(1); // Small Part
        ArrayList<String> result = getPermutation(smallString);
        ArrayList<String> finalResult = new ArrayList<>();
        for(int i = 0; i<result.size(); i++){
            String temp  = result.get(i);
           
            for(int j = 0 ; j<=temp.length(); j++){
                StringBuilder sb = new StringBuilder(temp);
                sb.insert(j, singleChar);
                finalResult.add(sb.toString());
            }
        }
        return finalResult;
    }
}
