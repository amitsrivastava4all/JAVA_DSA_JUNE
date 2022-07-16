import java.util.ArrayList;

public class MazePath {

    static ArrayList<String> maze(int startRow, int startCol, 
    int endRow, int endCol){
        // Termination Case
        if(startRow == endRow && startCol == endCol){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        // Not Contribute (Out of Maze)
        if(startRow>endRow || startCol>endCol){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        // Take Horzontinal Step
        ArrayList<String> horzResult = maze(startRow, startCol+1, endRow, endCol);
       for(String r : horzResult){
        finalResult.add(r+"H");
       }
        // Take Vertical Step
         ArrayList<String> vertResult = maze(startRow+1, startCol, endRow, endCol);
         for(String r : vertResult){
            finalResult.add(r+"V");
           }
            return finalResult;
        }
    public static void main(String[] args) {
        ArrayList<String> result = maze(0,0,2,2);
        System.out.println(result);
    }
}
