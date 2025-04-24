import java.awt.*;
import javax.swing.*;

public class ChessGUI {
    
    private ImagePanel bluePanel = new ImagePanel("Blue.png");
    private ImagePanel whitePanel = new ImagePanel("White.png");



    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        GridLayout layout = new GridLayout(8,8);
        frame.add(panel);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        

        frame.setVisible(true);


            
        
        

    }


}
