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

    public int getYloc(){
        return(this.Yloc);
    }

    public int getXloc(){
        return(this.Xloc);
    }


    public String checkPiece(JButton button){

        for(int k=0; k<32; k++){
            if(pieces.get(k).location == button){
                String pieceName = new String();
                pieceName = pieces.get(k).pieceName;
                return(pieceName);
            }
            
        }
        return("Nothing");

    }
    
}

