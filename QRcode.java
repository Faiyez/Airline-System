import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;
public class QRcode {
    
    /**
     * @throws IOException
     * 
     */
    JLabel imageLabel;
    QRcode() throws Exception{
        String details = passengerInfo.getFirstName() + " " + passengerInfo.getLastName() + System.lineSeparator()
        + passengerInfo.getDepartAirport() + " to " + passengerInfo.getArrivalAirport() + System.lineSeparator() +
        passengerInfo.getDepartDate();
        ByteArrayOutputStream out = QRCode.from(details).
        to(ImageType.PNG).stream();
        File f = new File("C:\\Users\\noorf\\Airline-System\\qrImage.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
/* 
        JFrame qrFrame = new JFrame();
        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon("qrImage.jpg"));
        imageLabel.setBounds(20,0,200,200);
        qrFrame.setSize(200, 250);
        qrFrame.setBackground(Color.LIGHT_GRAY);
        qrFrame.add(imageLabel);
        qrFrame.setLayout(null);
        qrFrame.setResizable(true);       
        //qrFrame.pack();
        qrFrame.validate();
        qrFrame.setVisible(true);
        qrFrame.setDefaultCloseOperation(qrFrame.DISPOSE_ON_CLOSE);
*/
    }
}
