import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.xml.stream.FactoryConfigurationError;
public class finalTicket extends JFrame{
    JLabel imageLabel;
    JTable table;
    JScrollPane scrollPane; 
    public finalTicket(){
        setLayout(new FlowLayout());
        String[] columnNames = {"First Name", "Last Name", 
        "Flight Name","Departure Name"};
        Object[][] data = {
        {passengerInfo.getFirstName(),passengerInfo.getLastName(),
        passengerInfo.getSelectedFlight(),passengerInfo.getDepartDate()}
       // {"asfg","erwr","dasfwer"}
        };
        table = new JTable(data, columnNames);

        table.setPreferredScrollableViewportSize(new Dimension(400, 50));
        table.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(table);
        add(scrollPane);
        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon("qrImage.jpg"));
        imageLabel.setBounds(50,200,200,200);
        setSize(400, 400);
       // setBackground(Color.LIGHT_GRAY);
        
        add(imageLabel);
        //setResizable(true);       
        //validate();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    } 
 /*     
    public static void main(String[] args){

        new finalTicket();
    }
*/  
}
