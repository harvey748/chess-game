import javax.swing.JButton;

public class Bishop extends ChessPiece{

    public Bishop(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
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
        if((Math.abs(To_yPos - From_yPos) == Math.abs(To_xPos - From_xPos))){

        
            
            int startY = Math.min(From_yPos, To_yPos) + 1;
            int endY = Math.max(From_yPos, To_yPos);
            int startX = Math.min(From_xPos, To_xPos) + 1;
            int endX = Math.max(From_xPos, To_xPos);
            for(int y = startY, x = startX; y < endY && x < endX; y++, x++){
                
                if(boardSquares[y][x].getIcon() != null){
                    return false; 
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
    
    

