import javax.swing.JButton;

public class Knight extends ChessPiece {


    public Knight(JButton boardSquare, JButton[][] Board, String pieceName, String colour){
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
