import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


//superclass
public abstract class ChessPiece {

    //protected means that any subclass can access these attributes

    protected int Yloc;
    protected int Xloc;
    protected static List<ChessPiece> pieces = new ArrayList<>();
    protected JButton location;
    protected JButton[][] boardSquares;
    protected boolean alive = true;
    protected String pieceName;
    protected String colour;

    public ChessPiece(){

    }


    public ChessPiece(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        this.Yloc = Yloc;
        this.Xloc = Xloc;
        this.location = location;
        this.boardSquares = Board;
        this.pieceName = pieceName;
        this.colour = colour;
    }


    public abstract boolean isValidMove(JButton selectedButton, JButton button );
     

    public static ChessPiece getChessPiece(JButton button){

        for (ChessPiece piece : pieces) {
            if (piece.location == button) {
                return piece;
            }
        }
        return(null);
    }



    //Making a class for movement only. Not taking pieces
    public static void moveChessPiece(JButton toButton, JButton fromButton){

        ChessPiece From_Piece = getChessPiece(fromButton);
        if (getChessPiece(toButton) == null){
            toButton.setIcon(fromButton.getIcon());
            fromButton.setIcon(null);
            fromButton.setBorder(null);
            From_Piece.location = toButton;

        }
    }

    
    //Making class for taking pieces and movement.
    public static void replaceChessPiece(JButton toButton, JButton fromButton){

        
        if(ChessPiece.getChessPiece(toButton).colour == ChessPiece.getChessPiece(fromButton).colour){

        }
        else{

            toButton.setIcon(fromButton.getIcon());
            fromButton.setIcon(null);
            fromButton.setBorder(null);
    
            ChessPiece To_Piece = getChessPiece(toButton);
            ChessPiece From_Piece = getChessPiece(fromButton);
    
            if(To_Piece ==null){
                From_Piece.location = toButton;
            }
            else{
                
                From_Piece.pieceName = To_Piece.pieceName;
                From_Piece.location = toButton;
                pieces.remove(To_Piece);
    
            }


        }
            
         
        


    }

    public int getYloc(){
        return(this.Yloc);
    }

    public int getXloc(){
        return(this.Xloc);
    }


    public String checkPiece(JButton button){

        for (ChessPiece piece : pieces){
            if(piece.location == button){
                return piece.pieceName;
            }
        }

        /*for(int k=0; k<32; k++){
            if(pieces.get(k).location == button){
                String pieceName = new String();
                pieceName = pieces.get(k).pieceName;
                return(pieceName);
            }
            
        }*/
        return("Nothing");

    }



    public static List<ChessPiece> getChessList(){
        return(pieces);
    }

    public boolean checkSquare(JButton button){
        pieces = ChessPiece.getChessList();

        for (ChessPiece piece : pieces) {
            if (piece.location == button) {
                return true;
            }      
        }
        return false;
    }
    
}



