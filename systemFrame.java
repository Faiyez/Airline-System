import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
//import java.awt.Image;

import java.io.File;
import javax.imageio.ImageIO;

public class systemFrame extends JFrame implements ActionListener {
    JLabel headerLabel, passengerHeader, selectionLabel, 
    departLabel, firstLabel, lastLabel, passportLabel, fromLabel, 
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader, passengerLabel;
    JTextField firstName, lastName, passportNo;
    JPanel menuPanel, headerPanel;
    JComboBox fromBox, toBox;

    systemFrame(){
        //super();
        //Menu Panel and its components
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
        

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        String destinations[] = {"From","Toronto", "Montreal", "Paris", "New York"};
        fromBox = new JComboBox(destinations);
        toBox = new JComboBox(destinations);
        comboboxAuto.enable(fromBox);
        comboboxAuto.enable(toBox);
        
        this.setPreferredSize(size);
        //this.setPreferredSize(new Dimension(1200, 600));
        passengerLabel = new JLabel("Passenger Information");
        imageLabel = new JLabel();
        flightsHeader = new JLabel("Select Flights");
        imageLabel.setIcon(new ImageIcon("world.jpg"));
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

        passengerLabel.setFont(new Font(null, Font.BOLD, 20));
        passengerLabel.setBounds(240, 140, 250, 25);
        flightsHeader.setFont(new Font(null, Font.BOLD, 20));
        flightsHeader.setBounds(655, 140, 250, 25);
        imageLabel.setBounds(0, 0, 1400, 1400);
        toBox.setBounds(700, 230, 100, 20);
        toLabel.setBounds(640, 230, 100, 20);
        toLabel.setFont(new Font(null, Font.PLAIN, 15));
        fromLabel.setBounds(640, 200, 100, 20);
        fromLabel.setFont(new Font(null, Font.PLAIN, 15));
        fromBox.setBounds(700, 200, 100 , 20);
        passportNo.setBounds(340, 260, 100, 20);
        passportLabel.setBounds(240, 260, 100, 20);
        passportLabel.setFont(new Font(null, Font.PLAIN, 15));
        lastLabel.setBounds(240, 230, 100, 20);
        lastLabel.setFont(new Font(null, Font.PLAIN, 15));
        lastName.setBounds(340, 230, 100, 20);
        lastName.setFont(new Font(null, Font.PLAIN, 15));
        firstName.setBounds(340, 200, 100, 20);
        firstLabel.setBounds(240, 200, 100, 20);
        firstLabel.setFont(new Font(null, Font.PLAIN, 15));
        //headerLabel.setBounds(470, 10, 500, 50);
        //headerLabel.setFont(new Font(null, Font.ITALIC, 30));
        passengerHeader.setBounds(40, 40, 250, 50);
        passengerHeader.setFont(new Font(null, Font.BOLD, 20));
        //departLabel.setBounds(15, 15, 50, 20);
        //departLabel.setFont(new Font(null, Font.BOLD, 20));

        //add(departLabel);

        add(passengerLabel);
        add(flightsHeader);
        add(headerPanel);
        add(menuPanel);
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
        add(imageLabel);
        setResizable(true);
        setLayout(null);
        pack();
        validate();
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