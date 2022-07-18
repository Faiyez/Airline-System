import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;

public class searchFlight extends JFrame implements ActionListener {
    JLabel headerLabel, selectionLabel,selectDestinationsLabel,
    departLabel, fromLabel, flight2Label,
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader,
    departingLabel, arrivalLabel, selectDates ;
    JPanel menuPanel, headerPanel;
    JComboBox fromBox, toBox;
    baseFrame frame;
    JButton oneWayButton, twowayButton, multiCityButton, calendarButton2
    ,signInButton, thingsToDoButton,searchFlightButton;
    JTextField J_Text_Field2;
    final JTextField J_Text_Field;
    logInPage signInpage;

    searchFlight(){
        menuPanel = new JPanel();
        //Color menuColor = Color.decode("#45BD85");
        menuPanel.setBackground(Color.decode("#45BD85"));
        menuPanel.setBounds(0, 0, 160, 1400);
        menuPanel.setLayout(null);
        signInButton = new JButton("Sign In");
        thingsToDoButton = new JButton("Things To Do");
        JLabel menuLabel = new JLabel("Menu");

        menuLabel.setBounds(25, 120, 140, 40);
        menuLabel.setFont(new Font(null ,Font.BOLD,40 ));
        signInButton.setBounds(20, 190, 120, 40);
        signInButton.addActionListener(this);
        thingsToDoButton.setBounds(20, 240, 120, 40);

        menuPanel.add(menuLabel);
        menuPanel.add(signInButton);
        menuPanel.add(thingsToDoButton);
        
        headerPanel = new JPanel();
        headerImage = new JLabel();
        //headerImage.setIcon(new ImageIcon("euroTile.jpg"));
        headerPanel.setBackground(Color.decode("#B8F6FD"));
        headerPanel.setLayout(null);
        nameLabel = new JLabel("Airlyne Booking System");
        nameLabel.setBounds(500,20, 500, 50);
        nameLabel.setFont(new Font(null, Font.ITALIC, 30));
        headerPanel.setBounds(0,0,1400,100);
        headerPanel.add(nameLabel);
        headerPanel.add(headerImage);
        
        //One way, multiway and multicity button implementation.
        oneWayButton = new JButton("One Way");
        oneWayButton.setBounds(240, 180, 90, 25);
        oneWayButton.addActionListener(this);
        twowayButton = new JButton("Two Way");
        twowayButton.setBounds(340, 180, 90, 25);
        twowayButton.addActionListener(this);  
        multiCityButton = new JButton("Multi City");
        multiCityButton.setBounds(440, 180, 90, 25); 
        multiCityButton.addActionListener(this);
        flight2Label = new JLabel("2nd Flight Inforamtion");               
//      Button functionalities
/* 
        oneWayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                invalidate();
                validate();
                repaint();
            }

        });
        */
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        String destinations[] = {"  -- Select --","Toronto", "Montreal", "Paris", "New York"};
        fromBox = new JComboBox(destinations);
        toBox = new JComboBox(destinations);
        comboboxAuto.enable(fromBox);
        comboboxAuto.enable(toBox);
        
        this.setPreferredSize(size);
        //this.setPreferredSize(new Dimension(1200, 600));
        //Select dates Label
        selectDates = new JLabel("Select Dates");
        selectDates.setFont(new Font(null, Font.BOLD,25));
        selectDates.setBounds(675,250,250,25);

        imageLabel = new JLabel();
        imageLabel.setBackground(Color.decode("#8DE5D9"));
        imageLabel.setBounds(0, 0, 1400, 840);        
        flightsHeader = new JLabel("Select Flights");

        //imageLabel.setIcon(new ImageIcon("euroTile.jpg"));
        fromLabel = new JLabel("From: ");
        toLabel = new JLabel("To: ");
        headerLabel = new JLabel("Airlyne Booking System");
        departLabel = new JLabel("Depart");

        selectDestinationsLabel = new JLabel("Select Destinations");
        selectDestinationsLabel.setFont(new Font(null, Font.BOLD,25));
        selectDestinationsLabel.setBounds(260,250,250,25);

        flightsHeader.setFont(new Font(null, Font.BOLD, 40));
        flightsHeader.setBounds(555, 120, 450, 50);

        toBox.setBounds(320, 300, 100, 20);
        toLabel.setBounds(240, 300, 80, 20);
        toLabel.setFont(new Font(null, Font.PLAIN, 20));
        fromLabel.setBounds(240, 340, 80, 20);
        fromLabel.setFont(new Font(null, Font.PLAIN, 20));
        fromBox.setBounds(320, 340, 100 , 20);
        //departLabel.setBounds(15, 15, 50, 20);
        //departLabel.setFont(new Font(null, Font.BOLD, 20));

        //add(departLabel);
        // Calendar implementation
        departLabel = new JLabel("Departing");
        departLabel.setFont(new Font(null, Font.PLAIN,20));
        departLabel.setBounds(615, 300, 100, 25);
        arrivalLabel = new JLabel("Arrival");
        arrivalLabel.setFont(new Font(null, Font.PLAIN,20));
        arrivalLabel.setBounds(615, 340, 100, 25);
        JLabel J_Label = new JLabel("Date Selected:");
        J_Text_Field = new JTextField(25);
        J_Text_Field2 = new JTextField(25);
        J_Text_Field.setBounds(720,300,100,25);
        J_Text_Field2.setBounds(720,340,100,25);
        J_Text_Field2.addActionListener(this);

        searchFlightButton = new JButton("Search");
        searchFlightButton.setFont(new Font(null,Font.PLAIN,20));
        searchFlightButton.setBounds(800,180,100,30);
        searchFlightButton.addActionListener(this);        
        
        JButton calendarButton1 = new JButton("Calendar");
        calendarButton2 = new JButton("Calendar");
        calendarButton1.setBounds(840,300,100,25); 
        calendarButton2.addActionListener(this);
        calendarButton2.setBounds(840,340,100,25); 
 
        final JFrame calendarFrame = new JFrame();


        calendarButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                J_Text_Field.setText(new DatePick(calendarFrame).Set_Picked_Date());
                
            }
        
        });  
          
        calendarButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                J_Text_Field2.setText(new DatePick(calendarFrame).Set_Picked_Date());
            }
        
        });

        add(searchFlightButton);    
        add(selectDates); 
        add(selectDestinationsLabel);
        add(multiCityButton);   
        add(twowayButton);   
        add(oneWayButton);  
        add(calendarButton2);
        add(calendarButton1);
        add(J_Text_Field);
        add(J_Text_Field2);
        add(departLabel);
        add(arrivalLabel);
        add(flightsHeader);
        add(headerPanel);
        add(menuPanel);
        add(toBox);
        add(toLabel);
        add(fromLabel);
        add(fromBox);
        add(headerLabel);
        add(imageLabel);        
        
        setResizable(true);
        setLayout(null);
        pack();
        validate();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    private int RGBColor(int i, int j, int k) {
        return 0;
    }



    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == twowayButton){
            flight2Label.setBounds(540,500,80,100);
            add(flight2Label);
            invalidate();
            validate();
            repaint();
        }
        if(e.getSource() == oneWayButton){
            arrivalLabel.setEnabled(false);
            J_Text_Field2.setEnabled(false);
            calendarButton2.setEnabled(false);
            validate();
            repaint();

        }
        if(e.getSource() == signInButton){
            //this.dispose();
            new logInPage();

        }
        if(e.getSource()==searchFlightButton){
            String departAirport, arrivalAirport, departDate, arrivalDate;
            departAirport = (String)fromBox.getSelectedItem();
            //System.out.println("From search flight:");
            //.out.println(departAirport);
            //passengerInfo.setDepartAirport(departAirport);
            //flightDetails.setDepartAirport(departAirport);
            arrivalAirport = (String)toBox.getSelectedItem();
            //passengerInfo.setArrivalAirport(arrivalAirport);
            departDate = J_Text_Field.getText();
            //passengerInfo.setDepartDate(departDate);
            arrivalDate = J_Text_Field2.getText();
            //passengerInfo.setArrivalDate(arrivalDate);
            passengerInfo passengerDetails = new passengerInfo(departAirport,arrivalAirport,departDate,arrivalDate);
            this.dispose();
            frame = new baseFrame();
            new flightDetails(frame);
         
        }


        
    }  
///*        
    public static void main(String[] args){
        searchFlight newFrame = new searchFlight();
    }
//*/
   
}
