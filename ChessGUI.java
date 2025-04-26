import java.awt.*;
import javax.swing.*;
import java.awt.image.ImageObserver;


public class ChessGUI {
    
    private static JButton[][] boardSquares = new JButton[8][8];
    //create both of the needed Icons to give to the buttons later, make it static so that it can be used in the main code.
    private static ImageIcon whiteIcon = new ImageIcon("White.png");
    private static ImageIcon blueIcon = new ImageIcon("Blue.png");



    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(8,8);
        //Create Both Blue and White buttons


        frame.add(panel);
        panel.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        
        //putting the colour in the board
        for(int i=0; i<=7; i++){
            
                if(i%2==0){
            
                    for(int n=0; n<8; n++){
                        if(n%2==0){
                            //create White Button and set its icon to the white square
                            JButton whiteButton = new JButton();
                            whiteButton.setIcon(whiteIcon);
                            boardSquares[i][n] = whiteButton;
                            //add the button to the grid
                            panel.add(whiteButton);
                        }
                        else{
                            //create Blue Button and set its icon to the blue square
                            JButton blueButton = new JButton();
                            blueButton.setIcon(blueIcon);
                            boardSquares[i][n] = blueButton;

                            //add the button to the grid
                            panel.add(blueButton);
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
                            boardSquares[i][n].add(new JLabel(scaledRookIcon));
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
                            boardSquares[i][n].add(new JLabel(scaledKnightIcon));
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
                            boardSquares[i][n].add(new JLabel(scaledBishopIcon));
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
                        boardSquares[i][n].add(new JLabel(scaledQueenIcon));
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
                        boardSquares[i][n].add(new JLabel(scaledKingIcon));
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
                            boardSquares[i][n].add(new JLabel(scaledPawnIcon));
                        }
                       
                    }

                }
                else{
                    for(int m=0; m<8; m++){
                        if(m%2==0){
                            JButton blueButton = new JButton();
                            blueButton.setIcon(blueIcon);
                            boardSquares[i][m] = blueButton;


                            panel.add(blueButton);

                        }
                        else{
                            JButton whiteButton = new JButton();
                            whiteButton.setIcon(whiteIcon);
                            boardSquares[i][m] = whiteButton;

                            panel.add(whiteButton);

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
                            boardSquares[i][m].add(new JLabel(scaledRookIcon));
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
                            boardSquares[i][m].add(new JLabel(scaledKnightIcon));
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
                            boardSquares[i][m].add(new JLabel(scaledBishopIcon));
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
                            boardSquares[i][m].add(new JLabel(scaledQueenIcon));
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
                            boardSquares[i][m].add(new JLabel(scaledKingIcon));
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
                            boardSquares[i][m].add(new JLabel(scaledPawnIcon));
                        }
                    }
                }

            }
        frame.setVisible(true);


        }
    }
        



            
        
        





