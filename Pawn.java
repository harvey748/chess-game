import javax.swing.*;

public class Pawn extends ChessPiece {



    public Pawn(JButton boardSquare, JButton[][] Board, String pieceName, String colour){
        super(boardSquare, Board, pieceName, colour);

        pieces.add(this);
    }



    public Pawn(){

    }
    @Override
    public boolean isValidMove(JButton selectedButton, JButton button){

        int Sel_xPos = 0;
        int Sel_yPos = 0;
        int But_xPos = 0;
        int But_yPos = 0;
        for(int i =0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(boardSquares[i][j] == selectedButton){
                    Sel_yPos = i;
                    Sel_xPos = j;
                }
            }
        }

        for(int i =0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(boardSquares[i][j] == button){
                    But_yPos = i;
                    But_xPos = j;
                }
            }
        }

        if(this.colour == "White"){
            if(Sel_yPos - But_yPos == 1){
                return(true);
            }
            else{
                return(false);
            }
        }
        else if(this.colour == "Black"){
            if(Sel_yPos - But_yPos == -1){
                return(true);
            }
            else{
                return(false);
            }
        }
        else{
            return(false);
        }

    }




}