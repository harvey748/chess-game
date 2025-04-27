import javax.swing.JButton;

public class Bishop extends ChessPiece{

    public Bishop(JButton boardSquare, JButton[][] Board, String pieceName, String colour){
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
