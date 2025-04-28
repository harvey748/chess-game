import javax.swing.JButton;

public class Bishop extends ChessPiece{

    public Bishop(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){
        ChessPiece.replaceChessPiece(toButton, fromButton);

        
        JButton temp = new JButton();
        temp = this.location;
        this.location = toButton;
        fromButton = temp;
        return true;
        
        
    }
    
}
