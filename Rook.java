import javax.swing.JButton;

public class Rook extends ChessPiece{

    public Rook(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){
        int To_xPos = -1;
        int To_yPos = -1;
        int From_xPos = -1;
        int From_yPos = -1;
        for(int i =0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(boardSquares[i][j] == toButton){
                    To_yPos = i;
                    To_xPos = j;
                }
            }
        }

        for(int i =0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(boardSquares[i][j] == fromButton){
                    From_yPos = i;
                    From_xPos = j;
                }
            }
        }

        
        

        
        if((To_yPos - From_yPos <= 8 || To_yPos - From_yPos >= -8) && (To_xPos == From_xPos) || (To_xPos - From_xPos <= 8 || To_xPos - From_xPos >= -8) && (From_yPos == To_yPos)){

        
            if(From_xPos == To_xPos){
                int start = Math.min(From_yPos, To_yPos) + 1;
                int end = Math.max(From_yPos, To_yPos);
                for(int y = start; y < end; y++){
                    if(boardSquares[y][From_xPos].getIcon() != null){
                        return false; 
                    }
                    else{
                        
                    }
                }
            }
            if(From_yPos == To_yPos){
                int start = Math.min(From_xPos, To_xPos) + 1;
                int end = Math.max(From_xPos, To_xPos);
                for(int x = start; x < end; x++){
                    if(boardSquares[From_yPos][x].getIcon() != null){
                        return false; 
                    }
                }

            } 
        
        if(boardSquares[To_yPos][To_xPos].getIcon() == null){
    
            ChessPiece.moveChessPiece(toButton, fromButton);
        }
        else{
            ChessPiece.replaceChessPiece(toButton, fromButton);
        }
        return true;
        } 
            
    return false;

    }
}