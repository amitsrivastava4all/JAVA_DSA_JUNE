import java.util.ArrayList;

public class SubSequence {

    static ArrayList<String> getAllSubSeq(String str){
        // Termination Case
        if(str.length() ==0){
            ArrayList<String> result= new ArrayList<>();
            result.add(" ");
            return result;
        }

        char singleChar = str.charAt(0);
        String sub = str.substring(1); // Small Problem
        ArrayList<String> resultList =getAllSubSeq(sub);
        ArrayList<String> finalResult = new ArrayList<>();
        for(int i = 0 ; i<resultList.size(); i++){
            String output = resultList.get(i);
            finalResult.add(output); // Old / Not Take it
            finalResult.add(singleChar + output ); // New // Take it
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> subSeq = getAllSubSeq("amit");
        System.out.println(subSeq);
    }
}
