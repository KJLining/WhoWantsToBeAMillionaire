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
        
        playername.setBounds(240,580,300,25);
        pname.setBounds(120, 585, 120, 15);
        start.setBounds(260,650,220,50);
        start.setBackground(Color.green);
        start.setForeground(Color.white);
        start.setFocusable(false);
        
        
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
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f1.setBounds(0,0,750,800);
        f1.setLayout(null);
        f1.setVisible(true);
        
    }
    
}
class Frame2 extends JFrame {
    public static void page2(String playerName) {
        JFrame f2 = new JFrame("Who Wants to be a Millionaire");
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
        
        htp.setBounds(320, 50, 150, 20);
        
        rules1.setBounds(70, 100, 50, 20);
        rules2.setBounds(70, 130, 600, 20);
        rules3.setBounds(70, 160, 600, 20);
        rules4.setBounds(70, 190, 600, 20);
        rules5.setBounds(70, 220, 600, 20);
        rules6.setBounds(70, 250, 600, 20);
        rules7.setBounds(70, 290, 600, 20);
        
        play.setBounds(150,440,400,50);
        f2.add(htp);
        f2.add(rules1);
        f2.add(rules2);
        f2.add(rules3);
        f2.add(rules4);
        f2.add(rules5);
        f2.add(rules6);
        f2.add(rules7);
        f2.add(play);
       
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
