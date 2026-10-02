class Solution {
    static boolean findEmptyCell(char[][]board,int[]emptycell){
        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                if(board[i][j] == '.'){
                    emptycell[0] = i;
                    emptycell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSafeToPlace(char[][] board,char charValue,int rowIndex,int colIndex){
        for(int col = 0;col<9;col++){
            if(board[rowIndex][col] == charValue){
                return false;
            }
        }
            for(int row = 0; row < 9; row++){
        if(board[row][colIndex] == charValue){
            return false;
        }
    }
            int startRow = rowIndex-rowIndex%3;
            int startCol = colIndex - colIndex%3;
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    int actualRow = startRow + i;
                    int actualCol = startCol + j;
                    if(board[actualRow][actualCol] == charValue){
                        return false;

                    }
                }
            }
           
        
         return true;
    }
    static boolean SolveSudokuSolver(char[][]board){
        int[] emptycell = new int[2];
        if(!findEmptyCell(board,emptycell)){
            return true;
        }
        int rowIndex = emptycell[0];
        int colIndex  = emptycell[1];
        for(int value = 1;value <= 9;value++){
            char charValue = (char)(value+'0');
            if(isSafeToPlace(board,charValue,rowIndex,colIndex)){
                board[rowIndex][colIndex] = charValue;
                if(SolveSudokuSolver(board) == true){
                    return true;
                }
                board[rowIndex][colIndex] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
            SolveSudokuSolver(board);
        
    }
}