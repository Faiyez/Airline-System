import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;

public class searchFlight extends baseFrame implements ActionListener {
    JLabel headerLabel, selectionLabel,selectDestinationsLabel,
    departLabel, fromLabel, flight2Label,
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader,
    departingLabel, arrivalLabel, selectDates ;
    JPanel menuPanel, headerPanel;
    JComboBox fromBox, toBox;
    static baseFrame frame;
    JButton oneWayButton, twowayButton, multiCityButton, calendarButton2
    ,signInButton, thingsToDoButton,searchFlightButton;
    JTextField J_Text_Field2;
    final JTextField J_Text_Field;
    logInPage signInpage;

    /*
        searchFlight is an extension of class baseframe. 
        This class will provide the user an oppurtunity to select 
        the dates and location of departure and arrival.
        Constructor of searchFlight
        @param mainframe ->  mainframe is of type baseframe
     */
    public searchFlight(baseFrame mainframe){
        super();        
        this.frame = mainframe;

        flight2Label = new JLabel("2nd Flight Inforamtion");               

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        //System.out.println(size); 1280 x 720
        String destinations[] = {"  -- Select --","Toronto", "Montreal", "Paris", "New York"};
        fromBox = new JComboBox(destinations);
        toBox = new JComboBox(destinations);
        comboboxAuto.enable(fromBox);
        comboboxAuto.enable(toBox);
        
        this.setPreferredSize(size);
        //Select dates Label
        selectDates = new JLabel("Select Dates");
        selectDates.setFont(new Font(null, Font.BOLD,25));
        selectDates.setBounds(675,250,250,25);

        flightsHeader = new JLabel("Select Flights");

        
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
        toLabel.setBounds(240, 300, 65, 20);
        customJLabel(toLabel);
        fromLabel.setBounds(240, 340, 65, 20);
        customJLabel(fromLabel);
        fromBox.setBounds(320, 340, 100 , 20);

        // Calendar implementation
        departLabel = new JLabel("Departing:");
        
        //departLabel.setFont(new Font(null, Font.PLAIN,20));
        customJLabel(departLabel);
        departLabel.setBounds(615, 300, 100, 25);
        arrivalLabel = new JLabel("Arrival:");
        //arrivalLabel.setFont(new Font(null, Font.PLAIN,20));
        arrivalLabel.setBounds(615, 340, 100, 25);
        customJLabel(arrivalLabel);
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
        
        imageLabel = new JLabel();
        baseFrame.setImageLabel(imageLabel);
        
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
        addButtons();
        add(searchFlightButton);    
        add(selectDates); 
        add(selectDestinationsLabel);

        add(calendarButton2);
        add(calendarButton1);
        add(J_Text_Field);
        add(J_Text_Field2);
        add(departLabel);
        add(arrivalLabel);
        add(flightsHeader);
        add(toBox);
        add(toLabel);
        add(fromLabel);
        add(fromBox);     
        
        add(imageLabel);

        setResizable(true);
        setLayout(null);
        pack();
        validate();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void addButtons(){
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

        add(multiCityButton);   
        add(twowayButton);   
        add(oneWayButton);  
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
            new logInPage();
        }
        if(e.getSource()==searchFlightButton){
            String departAirport, arrivalAirport, departDate, arrivalDate;
            departAirport = (String)fromBox.getSelectedItem();
            arrivalAirport = (String)toBox.getSelectedItem();
            departDate = J_Text_Field.getText();
            arrivalDate = J_Text_Field2.getText();
            passengerInfo passengerDetails = new passengerInfo(departAirport,arrivalAirport,departDate,arrivalDate);
            this.dispose();
            frame = new baseFrame();
            new flightDetails(frame);
         
        }


        
    }  
/*        
    public static void main(String[] args){
        frame = new baseFrame();
        new searchFlight(frame);
    }

*/   
}
