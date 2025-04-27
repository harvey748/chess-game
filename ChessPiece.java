import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


//superclass
public class ChessPiece {

    //protected means that any subclass can access these attributes
    protected static List<ChessPiece> pieces = new ArrayList<>();
    protected JButton location;
    protected JButton[][] boardSquares;
    protected boolean alive = true;
    protected String pieceName;
    protected String colour;

    public ChessPiece(){
        
    }


    public ChessPiece(JButton location, JButton[][] Board, String pieceName, String colour){
        this.location = location;
        this.boardSquares = Board;
        this.pieceName = pieceName;
    }


    public boolean isValidMove(JButton selectedButton, JButton button ){
        return(true);
    }

    public ChessPiece getChessPiece(JButton button){

        for(int k=0; k<32; k++){
            if(pieces.get(k).location == button){
               return(pieces.get(k));
            }
            
        }
        return(null);

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

