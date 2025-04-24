import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
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
}