import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;
public class QRcode {
    
    /**
     * @throws IOException
     * 
     */
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
        
    }
}
