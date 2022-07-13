import javax.swing.*;
import java.awt.*;
public class backGroundPanel extends JPanel {
    Image img;
    public backGroundPanel()
    {
        // Read the image and place it in the variable img so it can be used in paintComponent
        img = Toolkit.getDefaultToolkit().createImage("world.jpg");
    }

    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null); // draw the image
    }    
}
