class NQueen{

    static boolean isPlaceAQueen(boolean [][] board, int row, int column){
       

        // Place in Same Column
        for(int i = row; i>=0; i--){
            if(board[i][column]){
                return false; // Not able to place a Queen
            }
        }
        // Place in Diagonal
        // a) Left Upper Diagonal Check
        for(int i = row, j = column; i>=0 && j>=0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }

        // b) Right Upper Diagonal Check
        for(int i = row, j = column; i>=0 && j<board[row].length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true; // We can place a Queen
    }

    static int countQueenPlacement(boolean board[][], int currentRow){

        int count = 0; 
        
        // Termination Case
        if(currentRow == board.length){
            return 1;
        }
        
        // Traverse the column for the current row
        for(int column = 0 ; column<board[currentRow].length; column++){

            // Before Placing a Queen Just check the Conditions first.
            // Place a Queen
            if(isPlaceAQueen(board, currentRow, column)){
            board[currentRow][column] = true;
            // Do a Recursive Call for the next row (Stack Build)
            int value = countQueenPlacement(board, currentRow+1); // Move to the Next Row
            count = count + value;
            // Undo the Already Try Option (True ), Undo it (False)
            board[currentRow][column] = false; // During Stack Fall
        }    
        }
        return count; 
    }
    public static void main(String[] args) {
        boolean board[][] = new boolean [4][4]; 
        // All the matrix element by default is false (because boolean)
        int count = countQueenPlacement(board, 0);
        System.out.println(count);
    }
}