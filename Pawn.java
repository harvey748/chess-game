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

        if(this.colour.equals("White")){
            System.out.printf(" From %d" ,From_yPos);
            System.out.printf(" To %d" ,To_yPos);
            if(To_yPos - From_yPos == -1 && To_xPos == From_xPos){   
                ChessPiece.moveChessPiece(toButton, fromButton);
                return(true);
            }
            else if(To_yPos - From_yPos == -1 && (To_xPos - From_xPos == -1 || To_xPos - From_xPos == 1)){
                ChessPiece.replaceChessPiece(toButton, fromButton);
                return(true);
            }
            else{
                System.out.print("White Pawn Move False");
                return(false);
            }


        }
        else if(this.colour.equals( "Black")){
            System.out.printf(" From %d" ,From_yPos);
            System.out.printf(" To %d" ,To_yPos);

            if(To_yPos - From_yPos == 1  && To_xPos == From_xPos){
                ChessPiece.moveChessPiece(toButton, fromButton);

                return(true);
            }
            else if(To_yPos - From_yPos == 1 && (To_xPos - From_xPos == -1 || To_xPos - From_xPos == 1)){
                ChessPiece.replaceChessPiece(toButton, fromButton);
                return(true);
            }
            else{
                System.out.print("Black Pawn Move False");

                return(false);
            }
        }
        else{
            return(false);
        }

    }


    




}