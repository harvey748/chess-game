import javax.swing.JButton;

public class King extends ChessPiece {

    public King(JButton boardSquare, JButton[][] Board, String pieceName, String colour){
        super(boardSquare, Board, pieceName, colour);

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
