import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class ImagePanel extends JPanel{

    Image image;

    public ImagePanel(String imagepath){
        try{
            image = ImageIO.read(new File(imagepath));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Draw the image scaled to fit the panel
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
    
}