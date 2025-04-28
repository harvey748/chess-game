import javax.swing.JButton;

public class Queen extends ChessPiece {
    

    public Queen(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){
        JButton temp = new JButton();
        temp = this.location;
        this.location = toButton;
        fromButton = temp;
        return true;
        
    }
}
