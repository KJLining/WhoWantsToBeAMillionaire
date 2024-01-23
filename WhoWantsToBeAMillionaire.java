package whowantstobeamillionaire;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frame1 extends JFrame{
    public void page1(){
        JFrame f1 = new JFrame("Who Wants to be a Millionaire");
        JTextField playername = new JTextField(" ");
        JLabel pname = new JLabel(" Enter Player Name:");
        pname.setForeground(Color.WHITE);
        JButton start = new JButton("START");
        
        Container contentPane = f1.getContentPane();
        contentPane.setBackground(new Color(0,0,139));
        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire\\Images\\Logo4.png"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(90, 30, 540, 550);

        // I added a starting bg tell me if it ain't fine
        ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\ERLYN\\Desktop\\marcus\\Marcus files\\DCIT50A ACTIVITIES\\wwtbm\\WhoWantsToBeAMillionaire\\bg start.png");
        JLabel backgroundstart = new JLabel(backgroundImageIcon);
        backgroundstart.setBounds(0, 0, 750, 800);
        
        playername.setBounds(240,580,300,25);
        pname.setBounds(120, 585, 120, 15);
        start.setBounds(265,650,220,50);
        start.setBackground(Color.decode("#7f03a7"));
        start.setForeground(Color.white);
        start.setFocusable(false);
        
        //added a mouse listener on start button
        start.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent m){
                start.setBackground(Color.decode("#bb03f8"));
            }
            public void mouseExited(MouseEvent e) {
                start.setBackground(Color.decode("#7f03a7"));
            }
            public void mouseClicked(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
        });


        
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String playerNameText = playername.getText().trim();
                if (!playerNameText.isEmpty()) {
                    // Player name is not empty, proceed to the next frame (frame2)
                    Frame2.page2(playerNameText);
                    f1.dispose(); // Close the current frame
                } else {
                    // Display a message or handle the case where the player name is empty
                    JOptionPane.showMessageDialog(f1, "Please enter a valid player name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        f1.add(playername);
        f1.add(pname);
        f1.add(start);
        f1.add(imageLabel);
        f1.getContentPane().add(backgroundstart);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setBounds(0,0,750,800);
        f1.setLayout(null);
        f1.setVisible(true);
        
    }
    
}
class Frame2 extends JFrame {
    public static void page2(String playerName) {
        JFrame f2 = new JFrame("Who Wants to be a Millionaire");
        
        // I put a background image on the frame 2 
        ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\ERLYN\\Desktop\\marcus\\Marcus files\\DCIT50A ACTIVITIES\\wwtbm\\WhoWantsToBeAMillionaire\\bg how to play2.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImageIcon);
        backgroundLabel.setBounds(0, 0, 750, 800);

        JLabel htp = new JLabel("How to Play: ");
        JLabel rules1 = new JLabel("Rules:");
        JLabel rules2 = new JLabel("Build your fortune by answering  questions correctly and moving up the ladder toward Php. 1,000,000.00!");
        JLabel rules3 = new JLabel("Along the way, you have three lifelines:");
        
        JLabel rules4 = new JLabel("1. Hint: Gives you a hint about the possible answer to the question.");
        JLabel rules5 = new JLabel("2. Remove: Removes two wrong choices in the question.");
        JLabel rules6  = new JLabel("3. Skip: Lets you skip a question.");
        
        JButton play = new JButton("PLAY");
        
        JLabel rules7 = new JLabel("All lifelines are only to be used once, use them wisely.");
        f2.setBounds(0, 0, 750, 800);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        htp.setBounds(335, 220, 150, 20);
        // lowered the rules and adjusted it to the middle 
        rules1.setBounds(70, 250, 600, 20);
        rules2.setBounds(70, 280, 600, 20);
        rules3.setBounds(70, 310, 600, 20);
        rules4.setBounds(70, 340, 600, 20);
        rules5.setBounds(70, 370, 600, 20);
        rules6.setBounds(70, 400, 600, 20);
        rules7.setBounds(70, 430, 600, 20);

        // adjusted the play position from 150,440,400,50 to: so it looks more in the middle of the frame
        play.setBounds(160,460,400,50);
        f2.add(htp);
        f2.add(rules1);
        f2.add(rules2);
        f2.add(rules3);
        f2.add(rules4);
        f2.add(rules5);
        f2.add(rules6);
        f2.add(rules7);
        f2.add(play);
        f2.getContentPane().add(backgroundLabel);

        // turned the htp and rules white so it can be more visible cuz of the bg
        htp.setForeground(Color.WHITE);
        rules1.setForeground(Color.WHITE);
        rules2.setForeground(Color.WHITE);
        rules3.setForeground(Color.WHITE);
        rules4.setForeground(Color.WHITE);
        rules5.setForeground(Color.WHITE);
        rules6.setForeground(Color.WHITE);
        rules7.setForeground(Color.WHITE);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(false);
                new Frame3(playerName); // Instantiate Frame3 with playerName
            }
        });
    }
}
class Frame3 extends JFrame {
    public Frame3(String playerName) {
        JFrame f3 = new JFrame("Game Screen");
        f3.setBounds(0, 0, 750, 800);
        f3.setLayout(null);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components or perform actions for Frame3
        JLabel welcomeLabel = new JLabel("Welcome, " + playerName + "!");
        welcomeLabel.setBounds(290, 50, 500, 20);
        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire\\Images\\Logo3.png"); // Replace with the actual path to your image
        JLabel imageLabel1 = new JLabel(imageIcon);
        imageLabel1.setBounds(180, 50, 300, 300);
        
        JLabel question1 = new JLabel("QUESTION 1");
        question1.setBounds(290,320,200,20);
        
        JLabel amount200 = new JLabel("Php. 500.00");
        amount200.setBounds(290,350,200,20);
        
        JLabel q1 = new JLabel("What does HTML mean?");
        q1.setBounds(270,390,300,20);
        
        JButton choiceA = new JButton("A. Hypertext Marked Up Language");
        choiceA.setBounds(40,450,300,30);
        JButton choiceB = new JButton("B. HyperText Markup Language");
        choiceB.setBounds(40,490,300,30);
        JButton choiceC = new JButton("C. HyperText Marking up Language");
        choiceC.setBounds(370,450,300,30);
        JButton choiceD = new JButton("D. Hyperlink Markup Language");
        choiceD.setBounds(370,490,300,30);
        
        JButton lifeline1 = new JButton("Hint");
        lifeline1.setBounds(80,630,150,30);
        JButton lifeline2 = new JButton("Remove");
        lifeline2.setBounds(275,630,150,30);
        JButton lifeline3 = new JButton("Skip");
        lifeline3.setBounds(460,630,150,30);
        

        
        f3.add(welcomeLabel);
        f3.add(imageLabel1);
        f3.add(question1);
        f3.add(q1);
        f3.add(amount200);
        f3.setVisible(true);
        f3.add(choiceA);
        f3.add(choiceB);
        f3.add(choiceC);
        f3.add(choiceD);
        f3.add(lifeline1);
        f3.add(lifeline2);
        f3.add(lifeline3);
        
}
    }



public class WhoWantsToBeAMillionaire {

    public static void main(String[] args) {
        frame1 fr1 = new frame1();
        fr1.page1();
    }
}
