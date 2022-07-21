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
    toLabel, headerImage, flightsHeader,
    departingLabel, arrivalLabel, selectDates;
    static JLabel imageLabel,nameLabel;
    JPanel menuPanel, headerPanel,bottomPanel;
    JComboBox fromBox, toBox;
    JButton oneWayButton, twowayButton, multiCityButton, calendarButton2
    ,signInButton, thingsToDoButton;
    static JButton backButton;
    JTextField J_Text_Field2;
    JFrame frame;
    logInPage signInpage;
    Font headerFont20;
    public baseFrame(){

        headerFont20 = new Font(null,Font.BOLD,20);

        menuPanel = new JPanel();
        menuPanel.setBackground(Color.decode("#45BD85"));
        menuPanel.setBounds(0, 0, 160, 720);
        menuPanel.setLayout(null);
        signInButton = new JButton("Sign In");
        thingsToDoButton = new JButton("Things To Do");
        JLabel menuLabel = new JLabel("Menu");
        menuLabel.setBounds(25, 120, 140, 40);
        menuLabel.setFont(new Font(null ,Font.BOLD,40 ));
        menuPanel.setBackground(Color.decode("#45BD85"));
        signInButton.setBounds(20, 190, 120, 40);
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                new logInPage();
            }
        });
        thingsToDoButton.setBounds(20, 240, 120, 40);
    
        menuPanel.add(menuLabel);
        menuPanel.add(signInButton);
        menuPanel.add(thingsToDoButton);
    
        headerPanel = new JPanel();
        headerImage = new JLabel();
        //headerImage.setIcon(new ImageIcon("sky.jpg"));
        headerPanel.setBackground(Color.decode("#B8F6FD"));
        headerPanel.setLayout(null);
        nameLabel = new JLabel("Airlyne Booking System");
        nameLabel.setBounds(500,20, 500, 50);
        nameLabel.setFont(new Font(null, Font.ITALIC, 30));
        headerPanel.setBounds(0,0,1280,100);
        headerPanel.add(nameLabel);
        headerPanel.add(headerImage);

        //imageLabel = new JLabel();
       // imageLabel.setIcon(new ImageIcon("world2Cropped.jpg"));
       // imageLabel.setBounds(140, 100, 1140, 660);
              

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setPreferredSize(size);
        
        /* Adding elements to frame */
       
        addBackButton();
        addBottomPanel();
        add(headerPanel);
        add(menuPanel);   
        
        //addImageLabel();    
        //pack();
        //setVisible(true);      
    }
     
    public static void setImageLabel(JLabel label){
        //label = new JLabel();
        label.setIcon(new ImageIcon("world2Cropped.jpg"));
        label.setBounds(140, 100, 1140, 660);      
    }


    private void addBackButton(){
        backButton = new JButton("Back");
        backButton.setFont(headerFont20);
        backButton.setBounds(180,500, 100, 25);
        backButton.addActionListener(this);
        add(backButton);
                
    }    
    public void addBottomPanel(){
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0,620,1280,200);
        bottomPanel.setBackground(Color.decode("#FF7700"));

        add(bottomPanel);
    }
	public void changePanel(JPanel panel) {
		getContentPane().removeAll();
		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().doLayout();
		revalidate();
		repaint();
	} 

    public static void customJLabel(JLabel label){
        label.setFont(new Font(null, Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.RED);
        label.setOpaque(true);               
    }    
 
    public void actionPerformed(ActionEvent e) {


    }
        
    
/*   
    public static void main(String[] args){
        baseFrame frame = new baseFrame();
    }
    */  
}
