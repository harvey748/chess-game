import javax.swing.JButton;

public class King extends ChessPiece {

    public King(int Yloc, int Xloc, JButton location, JButton[][] Board, String pieceName, String colour){
        super(Yloc, Xloc, location, Board, pieceName, colour);

        pieces.add(this);
    }
    @Override
    public boolean isValidMove(JButton fromButton, JButton toButton){

        //KING LOGIC

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



        ChessPiece.replaceChessPiece(toButton, fromButton);

        JButton temp = new JButton();
        temp = this.location;
        this.location = toButton;
        fromButton = temp;
        return true;
        
        
    }
}
