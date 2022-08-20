class SudokuDemo{
    static int board[][] =
        {{5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};

        static final int SIZE = 9;
        static void print(){
            for(int cells [] : board){
                // Row Print with cells
                for(int cell : cells){
                    System.out.print(cell+" ");
                }
                // Move to the next line
                System.out.println();
            }
        }
        static boolean isPresentInSubGrid(int row, int col, int val){
            int startRow = row - row % 3;
            int startCol = col - col%3;
            for(int i = startRow; i<startRow+3; i++){
                for(int j = startCol; j<startCol+3; j++){
                    if(board[i][j]== val){
                        return true;
                    }
                }
            }
            return false;
        }
        static boolean isPresentInRow(int row, int val){
            for(int col = 0 ; col<SIZE; col++){
                if(board[row][col]==val){
                    return true;
                }
            }
            return false;
        } 
        static boolean isPresentInCol(int col, int val){
            for(int row = 0 ; row<SIZE; row++){
                if(board[row][col]==val){
                    return true;
                }
            }
            return false;
        }      

        static boolean isOkToPlaceTheValue(int row , int col, int val){
            return !isPresentInRow(row, val) && !isPresentInCol(col, val) && !isPresentInSubGrid(row, col, val);
        }    
        static  boolean solveIt(int row, int col){
            // Edge Case
            if(col == SIZE){
                col = 0;
                row = row + 1;
            }
            // Termination Case 
            if(row == SIZE){
                print();
                return true; // Sudoku Solve 
            }

            // Is Value in cell is Empty or Not
            if(board[row][col]!=0){
                // Move to Next cell
                return solveIt(row, col+1);
            }
            // Here Cell is Empty 
            for(int i = 1; i<=9 ; i++){
                if(isOkToPlaceTheValue(row, col  , i)){
                    // We Place the Value
                    board[row][col] = i;
                    boolean result =  solveIt(row, col+1);
                    if(result){
                        // Sudoku Solve 
                        return true;
                    }
                    // result value is false
                    board[row][col] = 0; // Undo the changes
                }
            }
            return false; // Sudoku is not solve
        }

    public static void main(String[] args) {
        String result = solveIt(0, 0)?"Solved ":"Not Solved";
        System.out.println(result);
    }
}