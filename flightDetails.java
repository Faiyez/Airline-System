/* This class displays the details of a specific flight and lets the user select
 * a convenient flight
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class flightDetails extends baseFrame implements ActionListener{
    //private static baseFrame frame;
    private static baseFrame frame;
    HashMap<String,String> airportCodes;
    JLabel departLabel, fromLabel, toLabel, fromCode,toCode,fromAirportLabel,toAirportLabel,
    selectSeatsLabel,departDateLabel,departDateValue,bookingLabel;
    static String fromDestination;
    JPanel departInfo,seatsCollectionA,seatsCollectionB;
    JButton bookingButton;
    //JScrollPane scrollPane;
    JButton[] allSeats;
    Font headerFont1,headerFont15,headerFont20;
    String fromAirport,toAirport,departDate, arrivalDate;
    public flightDetails (baseFrame mainFrame){
        super();
        this.frame = mainFrame;
        headerFont1 = new Font(null,Font.BOLD,20);
        headerFont15 = new Font(null,Font.BOLD,15);
        allSeats = new JButton[36];
        seatsCollectionA = new JPanel();   
        seatsCollectionA.setBounds(450,200,200,400);  
        seatsCollectionA.setLayout(new GridLayout(6,6,2,2));   
        seatsCollectionA.setBackground(Color.YELLOW);
        seatsCollectionB = new JPanel();
        seatsCollectionB.setBounds(700,200,200,400);  
        seatsCollectionB.setLayout(new GridLayout(6,6,2,2));   
        seatsCollectionB.setBackground(Color.YELLOW);        
        addSeats();
        add(seatsCollectionA);
        add(seatsCollectionB);
        airportCodes = new HashMap<String, String>();
        airportCodes.put("Toronto","TOR");
        airportCodes.put("Montreal","MON");
        airportCodes.put("Paris","PAR");
        airportCodes.put("New York","NYC");
        addDepartDetails();
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
        toCode.setFont(new Font(null,Font.BOLD,20));
        toCode.setBounds(290,200,50,20);
        fromAirport = passengerInfo.getDepartAirport();
        fromCode = new JLabel(airportCodes.get(fromAirport));
        fromCode.setFont(new Font(null,Font.BOLD,20));
        fromCode.setBounds(200,200,50,20);
        fromCode.setBackground(Color.RED);
        fromAirportLabel = new JLabel(fromAirport);
        fromAirportLabel.setFont(new Font(null,Font.BOLD,15));
        fromAirportLabel.setBounds(180,220,80,15);
        
        toAirportLabel = new JLabel(toAirport);
        toAirportLabel.setFont(new Font(null,Font.BOLD,15));
        toAirportLabel.setBounds(280,220,80,15);

        departDate = passengerInfo.getDepartDate();
        departDateValue = new JLabel(departDate);
        departDateValue.setFont(headerFont15);
        departDateValue.setBounds(200,250,100,20);
        departDateLabel = new JLabel("Date");
        departLabel.setFont(headerFont15);
        departDateLabel.setBounds(200,235,50,20);

        bookingLabel = new JLabel("Booking");
        bookingLabel.setBounds(1000,150,250,25);
        bookingLabel.setFont(headerFont1);

        add(bookingLabel);
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
        selectSeatsLabel = new JLabel("Select Seats");
        selectSeatsLabel.setBounds(630,150,250,25);
        selectSeatsLabel.setFont(headerFont1);
        for(int i=0;i<18;i++){
            String value = "A" + String.valueOf(i);
            allSeats[i] = new JButton(value);
            allSeats[i].setFont(new Font(null,Font.BOLD,15));
            allSeats[i].setSize(5, 5);
            allSeats[i].setFocusable(false);
            allSeats[i].addActionListener(this);
            seatsCollectionA.add(allSeats[i]);
        }
        for(int i=0;i<18;i++){
            String value = "B" + String.valueOf(i);
            allSeats[i] = new JButton(value);
            allSeats[i].setFont(new Font(null,Font.BOLD,15));
            allSeats[i].setSize(5, 5);
            allSeats[i].setFocusable(false);
            allSeats[i].addActionListener(this);
            seatsCollectionB.add(allSeats[i]);
        }

        
        add(selectSeatsLabel);

    }    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
/*       
    public static void main(String[] args){
       flightDetails testFrame = new flightDetails(frame);
    }
*/


}