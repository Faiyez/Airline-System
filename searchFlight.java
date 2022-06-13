import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class searchFlight extends JFrame implements ActionListener {
    JLabel headerLabel, selectionLabel,selectDestinationsLabel,
    departLabel, fromLabel, flight2Label,
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader,
    departingLabel, arrivalLabel ;
    JPanel menuPanel, headerPanel;
    JComboBox fromBox, toBox;
    JButton oneWayButton, twowayButton, multiCityButton;

    searchFlight(){
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.WHITE);
        menuPanel.setBounds(0, 0, 160, 1400);
        menuPanel.setLayout(null);
        JButton signInButton = new JButton("Sign In");
        JButton thingsToDoButton = new JButton("Things To Do");
        JLabel menuLabel = new JLabel("Menu");

        menuLabel.setBounds(25, 120, 140, 40);
        menuLabel.setFont(new Font(null ,Font.BOLD,40 ));
        signInButton.setBounds(20, 190, 120, 40);
        thingsToDoButton.setBounds(20, 240, 120, 40);

        menuPanel.add(menuLabel);
        menuPanel.add(signInButton);
        menuPanel.add(thingsToDoButton);

        headerPanel = new JPanel();
        headerImage = new JLabel();
        headerImage.setIcon(new ImageIcon("sky.jpg"));
        
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
        twowayButton = new JButton("Two Way");
        twowayButton.setBounds(340, 180, 90, 25);  
        multiCityButton = new JButton("Multi City");
        multiCityButton.setBounds(440, 180, 90, 25); 
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
        String destinations[] = {"","Toronto", "Montreal", "Paris", "New York"};
        fromBox = new JComboBox(destinations);
        toBox = new JComboBox(destinations);
        comboboxAuto.enable(fromBox);
        comboboxAuto.enable(toBox);
        
        this.setPreferredSize(size);
        //this.setPreferredSize(new Dimension(1200, 600));
        imageLabel = new JLabel();
        flightsHeader = new JLabel("Select Flights");
        imageLabel.setIcon(new ImageIcon("world.jpg"));
        fromLabel = new JLabel("From: ");
        toLabel = new JLabel("To: ");
        headerLabel = new JLabel("Airlyne Booking System");
        departLabel = new JLabel("Depart");

        selectDestinationsLabel = new JLabel("Select Destinations");
        selectDestinationsLabel.setFont(new Font(null, Font.BOLD,25));
        selectDestinationsLabel.setBounds(260,250,250,25);

        flightsHeader.setFont(new Font(null, Font.BOLD, 40));
        flightsHeader.setBounds(555, 120, 450, 50);
        imageLabel.setBounds(0, 0, 1400, 1400);
        toBox.setBounds(340, 300, 100, 20);
        toLabel.setBounds(240, 300, 80, 20);
        toLabel.setFont(new Font(null, Font.PLAIN, 20));
        fromLabel.setBounds(240, 320, 80, 20);
        fromLabel.setFont(new Font(null, Font.PLAIN, 20));
        fromBox.setBounds(320, 320, 100 , 20);
        //departLabel.setBounds(15, 15, 50, 20);
        //departLabel.setFont(new Font(null, Font.BOLD, 20));

        //add(departLabel);
        // Calendar implementation
        departLabel = new JLabel("Departing");
        departLabel.setFont(new Font(null, Font.PLAIN,20));
        departLabel.setBounds(615, 220, 100, 25);
        arrivalLabel = new JLabel("Arrival");
        arrivalLabel.setBounds(800, 220, 100, 25);
        JLabel J_Label = new JLabel("Date Selected:");
        final JTextField J_Text_Field = new JTextField(25);
        final JTextField J_Text_Field2 = new JTextField(25);
        J_Text_Field.setBounds(700,220,100,25);
        J_Text_Field2.setBounds(900,220,100,25);
        
        JButton calendarButton1 = new JButton("Calendar");
        JButton calendarButton2 = new JButton("Calendar");
        calendarButton1.setBounds(840,260,100,25); 
        calendarButton2.setBounds(840,290,100,25); 
 
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



    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == twowayButton){
            flight2Label.setBounds(540,500,80,100);
            add(flight2Label);
            invalidate();
            validate();
            repaint();
        }
        
    }  
    
    public static void main(String[] args){
        searchFlight newFrame = new searchFlight();
    }
    
}
