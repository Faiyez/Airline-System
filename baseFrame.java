import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class baseFrame extends JFrame implements ActionListener {
    JLabel headerLabel, selectionLabel,selectDestinationsLabel,
    departLabel, fromLabel, flight2Label,
    toLabel,imageLabel, headerImage, nameLabel, flightsHeader,
    departingLabel, arrivalLabel, selectDates ;
    JPanel menuPanel, headerPanel;
    JComboBox fromBox, toBox;
    JButton oneWayButton, twowayButton, multiCityButton, calendarButton2
    ,signInButton, thingsToDoButton;
    JTextField J_Text_Field2;
    JFrame frame;
    logInPage signInpage;
    baseFrame(){
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.WHITE);
        menuPanel.setBounds(0, 0, 160, 1400);
        menuPanel.setLayout(null);
        signInButton = new JButton("Sign In");
        thingsToDoButton = new JButton("Things To Do");
        JLabel menuLabel = new JLabel("Menu");
        menuLabel.setBounds(25, 120, 140, 40);
        menuLabel.setFont(new Font(null ,Font.BOLD,40 ));
        menuPanel.setBackground(Color.BLUE);
        signInButton.setBounds(20, 190, 120, 40);
        signInButton.addActionListener(this);
        thingsToDoButton.setBounds(20, 240, 120, 40);
    
        menuPanel.add(menuLabel);
        menuPanel.add(signInButton);
        menuPanel.add(thingsToDoButton);
    
        headerPanel = new JPanel();
        headerImage = new JLabel();
        headerImage.setIcon(new ImageIcon("sky.jpg"));
        headerPanel.setBackground(Color.CYAN);
        headerPanel.setLayout(null);
        nameLabel = new JLabel("Airlyne Booking System");
        nameLabel.setBounds(500,20, 500, 50);
        nameLabel.setFont(new Font(null, Font.ITALIC, 30));
        headerPanel.setBounds(0,0,1400,100);
        headerPanel.add(nameLabel);
        headerPanel.add(headerImage);

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setPreferredSize(size);
        
        /* Adding elements to frame */
        add(menuPanel);
        add(headerPanel);
        //pack();
        //setVisible(true);
    }
	public void changePanel(JPanel panel) {
		getContentPane().removeAll();
		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().doLayout();
		revalidate();
		repaint();
	}    

    public void actionPerformed(ActionEvent e) {

        
    }
/*   
    public static void main(String[] args){
        baseFrame frame = new baseFrame();
    }
    */  
}
