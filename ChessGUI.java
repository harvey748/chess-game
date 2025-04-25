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
                    }
                }

            }
        frame.setVisible(true);


        }
    }
        



            
        
        





