import javax.swing.*;

public class Pawn extends ChessPiece {



    public Pawn(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }



    public Pawn(){

    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){

        int To_xPos = 0;
        int To_yPos = 0;
        int From_xPos = 0;
        int From_yPos = 0;
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

        if(this.colour.equals("White")){
            System.out.print(To_yPos);
            if(To_yPos - From_yPos == 1 && To_xPos == From_xPos){
                boardSquares[To_yPos][To_xPos] = boardSquares[From_yPos][From_xPos];
                return(true);
            }
            else{
                return(false);
            }
        }
        else if(this.colour.equals( "Black")){
            System.out.print(To_yPos);

            if(To_yPos - From_yPos == -1  && To_xPos == From_xPos){
                boardSquares[To_yPos][To_xPos] = boardSquares[From_yPos][From_xPos];
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