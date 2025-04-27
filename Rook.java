import javax.swing.JButton;

public class Rook extends ChessPiece{

    public Rook(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){
        if(toButton.getIcon() == null){
            return true;
        }
        return false;
    }

}