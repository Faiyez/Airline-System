import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.ImageIcon;

import com.google.zxing.qrcode.encoder.QRCode;

public class passengerDetails extends baseFrame implements ActionListener {
    private static baseFrame frame;
    private backGroundPanel backGroundPanel;        
    JLabel headerLabel, passengerHeader, selectionLabel, 
    departLabel, firstLabel, lastLabel, passportLabel, fromLabel, 
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader, passengerLabel,
    departingLabel, arrivalLabel, toCode, fromCode, seatNo , flightSelected,
    toAirportLabel,fromAirportLabel, departDateValue,departDateLabel ;
    JButton bookingButton,viewTicketButton;
    JTextField firstName, lastName, passportNo;
    JPanel menuPanel, headerPanel;
    Font bold30,bold25,plain20,plain25;
    //static String fromAirport,toAirport,departDate, arrivalDate;
    passengerDetails(baseFrame mainFrame){
        super();
        this.frame = mainFrame;
        bold30 = new Font(null, Font.BOLD,30);
        bold25 = new Font(null, Font.BOLD,25);
        plain20 = new Font(null,Font.PLAIN,20);
        plain25 = new Font(null,Font.PLAIN,25);
        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon("world.jpg"));
        imageLabel.setBounds(0, 0, 1400, 1400);
        //Menu Panel and its components
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();       
        this.setPreferredSize(size);
        addPassengerInfo();
        addSummary();
        add(imageLabel);        
        setResizable(true);
        setLayout(null);
        pack();
        validate();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void addPassengerInfo(){
        passengerLabel = new JLabel("Passenger Information");
        firstLabel = new JLabel("First Name: ");
        lastLabel = new JLabel("Last Name: ");
        firstName = new JTextField();
        lastName = new JTextField();
        passportNo = new JTextField();
        passportLabel = new JLabel("Passport NO: ");

        passengerLabel.setFont(bold25);
        passengerLabel.setBounds(240, 140, 280, 35);
        passportNo.setBounds(420, 260, 180, 25);
        passportLabel.setBounds(240, 260, 200, 25);
        passportLabel.setFont(plain20);
        lastLabel.setBounds(240, 230, 200, 25);
        lastLabel.setFont(plain20);
        lastName.setBounds(420, 230, 180, 25);
        lastName.setFont(plain20);
        firstName.setBounds(420, 200, 180, 25);
        firstLabel.setBounds(240, 200, 200, 25);
        firstLabel.setFont(plain20);
       
        add(passengerLabel);
        add(passportNo);
        add(passportLabel);
        add(lastName);
        add(lastLabel);
        add(firstName);
        add(firstLabel);
    }

    public void addSummary(){
        //allSeats = new JButton();
        departLabel = new JLabel("Summary");
        departLabel.setFont(bold25);
        departLabel.setBounds(835,150,250,25);
        fromLabel = new JLabel("FROM");
        fromLabel.setFont(new Font(null,Font.BOLD,15));
        fromLabel.setBounds(820,180,100,15);
        toLabel = new JLabel("TO");
        toLabel.setFont(new Font(null,Font.BOLD,15));
        toLabel.setBounds(900,180,100,15);

        String toAirport = passengerInfo.getArrivalAirport();
        //System.out.println("From passenger details");
        //System.out.println(toAirport);
        toCode = new JLabel(flightDetails.airportCodes.get(toAirport));
        toCode.setFont(new Font(null,Font.BOLD,20));
        toCode.setBounds(890,200,50,20);
        String fromAirport = passengerInfo.getDepartAirport();
        fromCode = new JLabel(flightDetails.airportCodes.get(fromAirport));
        fromCode.setFont(new Font(null,Font.BOLD,20));
        fromCode.setBounds(800,200,50,20);
        fromCode.setBackground(Color.RED);
        fromAirportLabel = new JLabel(fromAirport);
        fromAirportLabel.setFont(new Font(null,Font.BOLD,15));
        fromAirportLabel.setBounds(780,220,80,15);
        
        toAirportLabel = new JLabel(toAirport);
        toAirportLabel.setFont(new Font(null,Font.BOLD,15));
        toAirportLabel.setBounds(880,220,80,15);

        String departDate = passengerInfo.getDepartDate();
        departDateValue = new JLabel(departDate);
        departDateValue.setFont(plain20);
        departDateValue.setBounds(800,250,120,20);
        departDateLabel = new JLabel("Date");
        departLabel.setFont(plain25);
        departDateLabel.setBounds(800,235,50,20);
        String flightSeat = passengerInfo.getSeatNumber();
        seatNo = new JLabel("SeatNo:  " + flightSeat);
        seatNo.setFont(plain20);
        seatNo.setBounds(800,270,200,20);     
        flightSelected = new JLabel("Flight Selected: " + passengerInfo.getSelectedFlight());   
        flightSelected.setFont(plain20);
        flightSelected.setBounds(800,290,400,20);
        bookingButton = new JButton("Confirm");
        bookingButton.setFont(plain20);
        bookingButton.setBounds(800,320,150,20);
        bookingButton.addActionListener(this);
        viewTicketButton = new JButton("View Ticket");
        viewTicketButton.setFont(plain20);
        viewTicketButton.setBounds(800,345, 150, 20);
        viewTicketButton.addActionListener(this);

        add(bookingButton);
        add(viewTicketButton);
        add(flightSelected);
        add(seatNo);
        add(departDateValue);
        add(departDateLabel);
        add(toAirportLabel);
        add(fromAirportLabel);
        add(toCode);
        add(fromCode);
        add(toLabel);
        add(departLabel);
        add(fromLabel);
  
    }
    

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewTicketButton){
            try {
                new QRcode();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        if(e.getSource() == baseFrame.backButton){
            this.dispose();
            new flightDetails(frame);

        }
    
    }
/*  
    public static void main(String[] args){
        //mainUI ui = new mainUI();
        
        systemFrame newFrame = new systemFrame();
    }
*/

}