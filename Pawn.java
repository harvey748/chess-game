public class Pawn extends ChessPiece {
    public boolean canMovePawn(int fromRow, int toRow, int fromCol, boolean isFirstMove, ChessPiece[][] board){
        if(isFirstMove){
            if(toRow - fromRow == 1 || toRow - fromRow == 2){
            //checks if there is a piece blocking the move
                if (toRow - fromRow == 2){
                    if(board[toRow][fromCol] != null){
                        return false;
                    }
                }
                //if they only move one space validation
                if (board[toRow][fromCol] != null){
                    return false;
                }
                //valid first move
                return true;
            }
        }
        //if its not the pawns first move
        else if(toRow - fromRow == 1){
            if(board[toRow][fromCol] != null){
                return false;
            }
        }
        return true;
    }
}