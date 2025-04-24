import java.awt.*;
import javax.swing.*;

public class ChessGUI {
    
    private static ImagePanel bluePanel = new ImagePanel("Blue.png");
    private static ImagePanel whitePanel = new ImagePanel("White.png");



    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(8,8);

        frame.add(panel);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        
        //putting the colour in the board
        for(int i=0; i<=7; i++){
            for(int j=0; j<=7; j++){

                if(i%2==0){
                    
                    for(int n=0; n<8; n++){
                        if(n%2==0){
                            panel.add(new JLabel(bluePanel));
                        }
                        else{
                            panel.add(new JLabel(whitePanel));
                        }
                    }

                }
                else{
                    for(int m=0; m<8; m++){
                        if(m%2==0){
                            panel.add(new JLabel(whitePanel));
                        }
                        else{
                            panel.add(new JLabel(bluePanel));
                        }
                    }
                }

            }

        }
        

        frame.setVisible(true);


            
        
        

    }


}
