//TEST TEST



import java.awt.*;
import javax.swing.*;
import java.awt.image.ImageObserver;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class ChessGUI {

    private static List<ChessPiece> pieces;
    private ChessPiece current_Piece;
    private ChessPiece chessPiece;
    private static JButton toButton = null;
    private static JButton[][] boardSquares;
    private GridLayout layout;
    private JPanel panel;
    private JFrame frame;
    private static JButton fromButton;



    

    public ChessGUI(){
        boardSquares = new JButton[8][8];
        frame = new JFrame();
        panel = new JPanel();
        layout = new GridLayout(8,8);

        frame.add(panel);
        panel.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }

    //for movement of pieces 

    public boolean checkSquare(JButton button){
        for (ChessPiece piece : pieces) {
            if (piece.location == button) {
                return true;
            }      
        }
        return false;
    }

    public void handleButtonClick(JButton toButton){
        //makes sure that the button clicked had a piece on it and highlights the selected button


        pieces = ChessPiece.getChessList();
        
        if (fromButton == null || !this.checkSquare(fromButton)){
            fromButton = toButton;
            toButton.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        }
        //sets the next button you click on icon to the last icon selected then deletes the icon from the original button 
        else if(fromButton != null && this.checkSquare(fromButton) && fromButton != toButton){
            
            
            current_Piece =ChessPiece.getChessPiece(fromButton);
            System.out.printf(" \n Chess Piece Selected : %s", current_Piece.pieceName);
            
           
            if(current_Piece != null &&current_Piece.isValidMove(fromButton, toButton)){
                
                toButton.setIcon(fromButton.getIcon());
                fromButton.setIcon(null);
                fromButton.setBorder(null);
                fromButton = null;
            }
            else{
                System.out.println("Not Valid Move");
                fromButton =null;
                
            }
        }
    }



    //Create a method to set the board outside of the mainloop
    public void setBoard(JPanel panel){
        for(int i=0; i<=7; i++){
            
            if(i%2==0){
        
                for(int n=0; n<8; n++){
                    if(n%2==0){
                        //create White Button and set its icon to the white square
                        ChessSquareButton whiteButton = new ChessSquareButton();
                        whiteButton.setBackground(Color.WHITE);
                        boardSquares[i][n] = whiteButton;
                        //add the button to the grid
                        panel.add(whiteButton);
                        // added action listener to detected when the white buttons are clicked
                        whiteButton.addActionListener(e -> {
                            handleButtonClick(whiteButton);
                        });
                    }
                    else{
                        //setting new colour for buttons 
                        Color Blue = new Color(64, 224, 208);
                        //create Blue Button and set its icon to the blue square
                        ChessSquareButton blueButton = new ChessSquareButton();
                        blueButton.setBackground(Blue);
                        boardSquares[i][n] = blueButton;
                        //add the button to the grid
                        panel.add(blueButton);
                        //add action listener for the blue buttons
                        blueButton.addActionListener(e -> {
                            handleButtonClick(blueButton);
                        });
                    }

                    if((i==0&&n==0) || (i==0&&n==7)){
                        // Load the image using ImageIcon
                        ImageIcon rookIcon = new ImageIcon("Black_Rook.png");

                        // Get the Image from the ImageIcon
                        Image rook = rookIcon.getImage();

                        // Scale the image
                        Image scaledRook = rook.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledRookIcon = new ImageIcon(scaledRook);
                        boardSquares[i][n].setIcon(scaledRookIcon);
                        ChessPiece black_Rook = new Rook(i, n, boardSquares[i][n], boardSquares, "Rook", "Black");

                    }
                    if (i==0 && n==1 || i==0 && n==6){
                        // Load the image using ImageIcon
                        ImageIcon knightIcon = new ImageIcon("Black_Knight.png");

                        // Get the Image from the ImageIcon
                        Image knight = knightIcon.getImage();

                        // Scale the image
                        Image scaledKnight = knight.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledKnightIcon = new ImageIcon(scaledKnight);
                        boardSquares[i][n].setIcon(scaledKnightIcon);
                        ChessPiece black_Knight = new Knight(i, n, boardSquares[i][n], boardSquares, "Knight", "Black");

                    }
                    if (i==0 && n==2 || i==0 && n==5){
                        // Load the image using ImageIcon
                        ImageIcon bishopIcon = new ImageIcon("Black_Bishop.png");

                        // Get the Image from the ImageIcon
                        Image bishop = bishopIcon.getImage();

                        // Scale the image
                        Image scaledBishop = bishop.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledBishopIcon = new ImageIcon(scaledBishop);
                        boardSquares[i][n].setIcon(scaledBishopIcon);
                        ChessPiece black_Bishop = new Bishop(i, n, boardSquares[i][n], boardSquares, "Bishop", "Black");

                   }
                   if (i==0 && n==3){
                    // Load the image using ImageIcon
                    ImageIcon queenIcon = new ImageIcon("Black_Queen.png");

                    // Get the Image from the ImageIcon
                    Image queen = queenIcon.getImage();

                    // Scale the image
                    Image scaledQueen = queen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                    // Create a new ImageIcon with the scaled image
                    ImageIcon scaledQueenIcon = new ImageIcon(scaledQueen);
                    boardSquares[i][n].setIcon(scaledQueenIcon);
                    ChessPiece black_Queen = new Queen(i, n, boardSquares[i][n], boardSquares, "Queen", "Black");

               }
               if (i==0 && n==4){
                    // Load the image using ImageIcon
                    ImageIcon kingIcon = new ImageIcon("Black_King.png");

                    // Get the Image from the ImageIcon
                    Image king = kingIcon.getImage();

                    // Scale the image
                    Image scaledKing = king.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                    // Create a new ImageIcon with the scaled image
                    ImageIcon scaledKingIcon = new ImageIcon(scaledKing);
                    boardSquares[i][n].setIcon(scaledKingIcon);
                    ChessPiece black_King = new King(i,n, boardSquares[i][n], boardSquares, "King", "Black");

                }
                    if(i==6){
                        // Load the image using ImageIcon
                        ImageIcon pawnIcon = new ImageIcon("White_Pawn.png");

                        // Get the Image from the ImageIcon
                        Image pawn = pawnIcon.getImage();

                        // Scale the image
                        Image scaledPawn = pawn.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledPawnIcon = new ImageIcon(scaledPawn);
                        boardSquares[i][n].setIcon(scaledPawnIcon);

                        ChessPiece white_Pawn = new Pawn(i, n, boardSquares[i][n], boardSquares, "Pawn", "White");

                    }
                   
                }

            }
            else{
                for(int m=0; m<8; m++){
                    if(m%2==0){
                        //setting new colour for buttons 
                        Color Blue = new Color(64, 224, 208);
                        ChessSquareButton blueButton = new ChessSquareButton();
                        blueButton.setBackground(Blue);
                        boardSquares[i][m] = blueButton;
                        panel.add(blueButton);
                        //add action listener for the blue buttons
                        blueButton.addActionListener(e -> {
                            handleButtonClick(blueButton);
                        });

                    }
                    else{
                        ChessSquareButton whiteButton = new ChessSquareButton();
                        whiteButton.setBackground(Color.WHITE);
                        boardSquares[i][m] = whiteButton;
                        panel.add(whiteButton);
                        // added action listener to detected when the white buttons are clicked
                        whiteButton.addActionListener(e -> {
                            handleButtonClick(whiteButton);
                        });

                    }
                    if (i==7 && m==0 || i==7 && m==7){
                        // Load the image using ImageIcon
                        ImageIcon rookIcon = new ImageIcon("White_Rook.png");

                        // Get the Image from the ImageIcon
                        Image rook = rookIcon.getImage();

                        // Scale the image
                        Image scaledRook = rook.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledRookIcon = new ImageIcon(scaledRook);
                        boardSquares[i][m].setIcon(scaledRookIcon);
                        ChessPiece white_Rook = new Rook(i, m, boardSquares[i][m], boardSquares, "Rook", "White");

                   }
                   if (i==7 && m==1 || i==7 && m==6){
                        // Load the image using ImageIcon
                        ImageIcon knightIcon = new ImageIcon("White_Knight.png");

                        // Get the Image from the ImageIcon
                        Image knight = knightIcon.getImage();

                        // Scale the image
                        Image scaledKnight = knight.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledKnightIcon = new ImageIcon(scaledKnight);
                        boardSquares[i][m].setIcon(scaledKnightIcon);
                        ChessPiece whiteKnight = new Knight(i, m, boardSquares[i][m], boardSquares, "Knight", "White");

                    }
                    if (i==7 && m==2 || i==7 && m==5){
                        // Load the image using ImageIcon
                        ImageIcon bishopIcon = new ImageIcon("White_Bishop.png");

                        // Get the Image from the ImageIcon
                        Image bishop = bishopIcon.getImage();

                        // Scale the image
                        Image scaledBishop = bishop.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledBishopIcon = new ImageIcon(scaledBishop);
                        boardSquares[i][m].setIcon(scaledBishopIcon);
                        ChessPiece white_Bishop = new Bishop(i, m, boardSquares[i][m], boardSquares, "Bishop", "White");

                        
                   }
                    if (i==7 && m==3){
                        // Load the image using ImageIcon
                        ImageIcon queenIcon = new ImageIcon("White_Queen.png");

                        // Get the Image from the ImageIcon
                        Image queen = queenIcon.getImage();

                        // Scale the image
                        Image scaledQueen = queen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledQueenIcon = new ImageIcon(scaledQueen);
                        boardSquares[i][m].setIcon(scaledQueenIcon);
                        ChessPiece white_Queen = new Queen(i, m,boardSquares[i][m], boardSquares, "Queen", "White");

                   }
                   if (i==7 && m==4){
                        // Load the image using ImageIcon
                        ImageIcon kingIcon = new ImageIcon("White_King.png");

                        // Get the Image from the ImageIcon
                        Image king = kingIcon.getImage();

                        // Scale the image
                        Image scaledKing = king.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledKingIcon = new ImageIcon(scaledKing);
                        boardSquares[i][m].setIcon(scaledKingIcon);

                        ChessPiece white_King = new King(i, m, boardSquares[i][m], boardSquares, "King", "White");

                    }
                    if(i==1){
                        // Load the image using ImageIcon
                        ImageIcon pawnIcon = new ImageIcon("Black_Pawn.png");

                        // Get the Image from the ImageIcon
                        Image pawn = pawnIcon.getImage();

                        // Scale the image
                        Image scaledPawn = pawn.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                        // Create a new ImageIcon with the scaled image
                        ImageIcon scaledPawnIcon = new ImageIcon(scaledPawn);
                        boardSquares[i][m].setIcon(scaledPawnIcon);

                        ChessPiece black_Pawn = new Pawn(i, m, boardSquares[i][m], boardSquares, "Pawn", "Black");

                    }
                }
            }

        }
    }


    public static void main(String[] args){

        ChessGUI GUI = new ChessGUI();
        GUI.setBoard(GUI.panel);

        



        }
    }
        



            
        
        





