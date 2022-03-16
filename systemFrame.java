import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class systemFrame extends JFrame implements ActionListener {
    JLabel headerLabel, passengerHeader, selectionLabel, departLabel, firstLabel, lastLabel, passportLabel, fromLabel, toLabel;
    JTextField firstName, lastName, passportNo;
    JComboBox fromBox, toBox;
    systemFrame(){
        //super();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        String destinations[] = {"Toronto", "Montreal", "Paris", "New York"};
        fromBox = new JComboBox(destinations);
        toBox = new JComboBox(destinations);
        this.setPreferredSize(size);
        //this.setPreferredSize(new Dimension(1200, 600));
        fromLabel = new JLabel("From: ");
        toLabel = new JLabel("To: ");
        headerLabel = new JLabel("Airlyne Booking System");
        departLabel = new JLabel("Depart");
        passengerHeader = new JLabel("Passenger Information");
        firstLabel = new JLabel("First Name: ");
        lastLabel = new JLabel("Last Name: ");
        firstName = new JTextField();
        lastName = new JTextField();
        passportNo = new JTextField();
        passportLabel = new JLabel("Passport NO: ");

        toBox.setBounds(480, 130, 100, 20);
        toLabel.setBounds(420, 130, 100, 20);
        toLabel.setFont(new Font(null, Font.PLAIN, 15));
        fromLabel.setBounds(420, 100, 100, 20);
        fromLabel.setFont(new Font(null, Font.PLAIN, 15));
        fromBox.setBounds(480, 100, 100 , 20);
        passportNo.setBounds(120, 160, 100, 20);
        passportLabel.setBounds(20, 160, 100, 20);
        passportLabel.setFont(new Font(null, Font.PLAIN, 15));
        lastLabel.setBounds(20, 130, 100, 20);
        lastLabel.setFont(new Font(null, Font.PLAIN, 15));
        lastName.setBounds(120, 130, 100, 20);
        lastName.setFont(new Font(null, Font.PLAIN, 15));
        firstName.setBounds(120, 100, 100, 20);
        firstLabel.setBounds(20, 100, 100, 20);
        firstLabel.setFont(new Font(null, Font.PLAIN, 15));
        headerLabel.setBounds(450, 10, 500, 50);
        headerLabel.setFont(new Font(null, Font.ITALIC, 30));
        passengerHeader.setBounds(20, 40, 250, 50);
        passengerHeader.setFont(new Font(null, Font.BOLD, 20));
        //departLabel.setBounds(15, 15, 50, 20);
        //departLabel.setFont(new Font(null, Font.BOLD, 20));

        //add(departLabel);
        add(toBox);
        add(toLabel);
        add(fromLabel);
        add(fromBox);
        add(passportNo);
        add(passportLabel);
        add(lastName);
        add(lastLabel);
        add(firstName);
        add(firstLabel);
        add(passengerHeader);
        add(headerLabel);
        setResizable(true);
        setLayout(null);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public void actionPerformed(ActionEvent e) {
    
    
    }
    public static void main(String[] args){
        //mainUI ui = new mainUI();
        
        systemFrame newFrame = new systemFrame();
    }
}