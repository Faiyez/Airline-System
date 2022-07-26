/* This class displays the details of a specific flight and lets the user select
 * a convenient flight
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Random;

public class flightDetails extends baseFrame implements ActionListener{
    //private static baseFrame frame;
    private static baseFrame frame;
    static HashMap<String,String> airportCodes;
    JLabel departLabel, fromLabel, toLabel, fromCode,toCode,fromAirportLabel,toAirportLabel,
    selectSeatsLabel,departDateLabel,departDateValue,
    bookingLabel,selectAirlyne,imageLabel;
    static String fromDestination;
    JPanel departInfo,seatsCollectionA,seatsCollectionB;
    JButton bookingButton,nextPageButton,backButton, refresh;
    //JScrollPane scrollPane;
    JButton[] allSeats;
    Font headerFont1,headerFont15,headerFont20;
    String fromAirport,toAirport,departDate, arrivalDate;
    JComboBox airlyneCollection;
    Random random;
    public flightDetails (baseFrame mainFrame){
        super();
        this.frame = mainFrame;
        random = new Random();
        headerFont1 = new Font(null,Font.BOLD,20);
        headerFont15 = new Font(null,Font.BOLD,15);
        allSeats = new JButton[36];
        seatsCollectionA = new JPanel();   
        seatsCollectionA.setBounds(450,180,200,400);  
        seatsCollectionA.setLayout(new GridLayout(6,6,2,2));   
        seatsCollectionA.setBackground(Color.YELLOW);
        seatsCollectionB = new JPanel();
        seatsCollectionB.setBounds(700,180,200,400);  
        seatsCollectionB.setLayout(new GridLayout(6,6,2,2));   
        seatsCollectionB.setBackground(Color.YELLOW);        
        addSeats();
        add(seatsCollectionA);
        add(seatsCollectionB);
        addAirlyne();
        confirmBooking();

        airportCodes = new HashMap<String, String>();
        airportCodes.put("Toronto","TOR");
        airportCodes.put("Montreal","MON");
        airportCodes.put("Paris","PAR");
        airportCodes.put("New York","NYC");
        addDepartDetails();
        addImageLabel();
        setLayout(null);
        setResizable(true);       
        pack();
        validate();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void populateAirportCodes(){
        airportCodes.put("Toronto","TOR");
        airportCodes.put("Montreal","MON");
        airportCodes.put("Paris","PAR");
        airportCodes.put("New York","NYC");
    }

    private void addDepartDetails(){
        //allSeats = new JButton();
        departLabel = new JLabel("Depart");
        departLabel.setFont(new Font(null, Font.BOLD,20));
        departLabel.setBounds(235,150,250,25);
        fromLabel = new JLabel("FROM");
        fromLabel.setFont(new Font(null,Font.BOLD,15));
        fromLabel.setBounds(220,180,100,15);
        toLabel = new JLabel("TO");
        toLabel.setFont(new Font(null,Font.BOLD,15));
        toLabel.setBounds(300,180,100,15);

        toAirport = passengerInfo.getArrivalAirport();
        toCode = new JLabel(airportCodes.get(toAirport));
       // toCode.setFont(new Font(null,Font.BOLD,20));
        toCode.setBounds(290,200,50,20);
        customJLabel(toCode);
        fromAirport = passengerInfo.getDepartAirport();
        fromCode = new JLabel(airportCodes.get(fromAirport));
        fromCode.setFont(new Font(null,Font.BOLD,20));
        fromCode.setBounds(200,200,50,20);
        customJLabel(fromCode);
        //fromCode.setForeground(Color.WHITE);
       // fromCode.setBackground(Color.ORANGE);
        fromCode.setOpaque(true);
        fromAirportLabel = new JLabel(fromAirport);
        fromAirportLabel.setFont(new Font(null,Font.BOLD,15));
        fromAirportLabel.setBounds(180,220,80,15);
        
        toAirportLabel = new JLabel(toAirport);
        toAirportLabel.setFont(new Font(null,Font.BOLD,15));
        toAirportLabel.setBounds(280,220,80,15);

        departDate = passengerInfo.getDepartDate();
        departDateValue = new JLabel(departDate);
        customJLabel(departDateValue);
        //departDateValue.setFont(headerFont15);
        departDateValue.setBounds(200,250,120,20);
        departDateLabel = new JLabel("Date");
        //departLabel.setFont(headerFont15);
        departDateLabel.setBounds(200,235,50,20);

        
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
    private void addSeats(){
        double r = Math.random();
        int rand = (int)(r * (3 - 2)) + 2;

        selectSeatsLabel = new JLabel("Select Seats");
        selectSeatsLabel.setBounds(630,130,250,25);
        selectSeatsLabel.setFont(headerFont1);
        //arrangeSeats();
         
        for(int i=0;i<18;i++){            
            String value = "A" + String.valueOf(i);
            allSeats[i] = new JButton(value);
            allSeats[i].setFont(new Font(null,Font.BOLD,15));
            allSeats[i].setSize(5, 5);
            allSeats[i].setFocusable(false);
            allSeats[i].setBackground(Color.WHITE);
            if(i % rand == 0){
                allSeats[i].setText("O");
                allSeats[i].setEnabled(false);
                
            }
            allSeats[i].addActionListener(this);
            seatsCollectionA.add(allSeats[i]);
        }
        for(int i=18;i<36;i++){
            String value = "B" + String.valueOf(i-18);
            allSeats[i] = new JButton(value);
            allSeats[i].setFont(new Font(null,Font.BOLD,15));
            allSeats[i].setSize(5, 5);
            allSeats[i].setFocusable(false);
            allSeats[i].setBackground(Color.WHITE);
            if(i % rand == 0){
                allSeats[i].setText("O");
                allSeats[i].setEnabled(false);
                
            }            
            allSeats[i].addActionListener(this);
            seatsCollectionB.add(allSeats[i]);
        }

        refresh = new JButton("Refresh");
        refresh.setFont(headerFont20);
        refresh.setBounds(180,400, 100, 25);
        refresh.addActionListener(this);
        add(refresh);

        
        add(selectSeatsLabel);

    }    
    private void arrangeSeats(){
        double r = Math.random();
        int rand = (int)(r * (9 - 2)) + 0;

        for(int i=0;i<18;i++){            
            String value = "A" + String.valueOf(i);
            allSeats[i].setText(value);
            allSeats[i].setFocusable(true);
            allSeats[i].setEnabled(true);
            allSeats[i].setBackground(Color.WHITE);
            if(i % rand == 0){
                allSeats[i].setText("O");
                allSeats[i].setEnabled(false);
                
            }
        }
        for(int i=18;i<36;i++){
            String value = "B" + String.valueOf(i-18);
            allSeats[i].setText(value);
            allSeats[i].setEnabled(true);
            allSeats[i].setBackground(Color.WHITE);
            if(i % rand == 0){
                allSeats[i].setText("O");
                allSeats[i].setEnabled(false);
                
            }            
        }        
    }
    private void addAirlyne(){
        selectAirlyne = new JLabel("Select Airlyne");
        selectAirlyne.setFont(headerFont1);
        selectAirlyne.setBounds(180,280,200,20);
        String flights[] = {"    -- Please Select --","Canadian Airlyne", "French Airlyne","American Airlyne"};
        airlyneCollection = new JComboBox<>(flights);
        airlyneCollection.setBounds(180,320,150,20);
        add(selectAirlyne);
        add(airlyneCollection);

    }
    private void confirmBooking(){
        bookingLabel = new JLabel("Booking");
        bookingLabel.setBounds(1000,150,250,25);
        bookingLabel.setFont(headerFont1);        
        bookingButton = new JButton("Confirm");
        bookingButton.setFont(headerFont20);
        bookingButton.setBounds(1000,190,100,25);
        bookingButton.addActionListener(this);
        nextPageButton = new JButton("Next");
        nextPageButton.setFont(headerFont20);
        nextPageButton.setBounds(1000,220, 100, 25);
        nextPageButton.addActionListener(this);

        add(bookingLabel);
        add(bookingButton);
        add(nextPageButton);        

    }
    
    private void addImageLabel(){
        imageLabel = new JLabel();
        baseFrame.setImageLabel(imageLabel);
        add(imageLabel);        
    }


    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i < 36; i++){
            if(e.getSource() == allSeats[i]){
                String seatName = allSeats[i].getText();
                allSeats[i].setBackground(Color.GREEN);
                passengerInfo.setSeatNumber(seatName);
                passengerInfo.getSeatNumber();
            }
            else{
                allSeats[i].setEnabled(false);
            }

        }
        if(e.getSource() == nextPageButton){
            String flightSelected = (String)airlyneCollection.getSelectedItem();
            passengerInfo.setSelectedFlight(flightSelected);
            this.dispose();
            new passengerDetails(frame);

        }
        if(e.getSource() == baseFrame.backButton){
            this.dispose();
            new searchFlight(frame);
        }
        if(e.getSource() == refresh){
            arrangeSeats();
        }
        
    }
/*       
    public static void main(String[] args){
       flightDetails testFrame = new flightDetails(frame);
    }
*/


}