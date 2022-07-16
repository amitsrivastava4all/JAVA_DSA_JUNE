import java.util.ArrayList;

public class DiceGame {

    static ArrayList<String> rollTheDice(int start, int end){
        // Termination Case
        if(start == end){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        if(start>end){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice = 1; dice<=6; dice++){
            int newValue = start + dice;
            ArrayList<String> result = rollTheDice(newValue, end); // Small Problem
            
            for(int i = 0; i<result.size(); i++){
                String oldResult = result.get(i);
                finalResult.add(oldResult+dice);
            }
        }
        return finalResult;
        
    }
    public static void main(String[] args) {
          ArrayList<String> result = rollTheDice(0, 10);  
          System.out.println(result);
    }
}
