import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class startFrame extends JFrame{
    public startFrame(){
        
        JFrame f1 = new JFrame("Who Wants to be a Millionaire?");
        Container contentPane = f1.getContentPane();
        contentPane.setBackground(new Color(0,0,51));
        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); // Replace with the actual path to your image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(165, 120, 300, 300);
        
        Font font = new Font("Arial",Font.BOLD,20);
        JLabel l1 = new JLabel("Enter player name: ");
        l1.setFont(font);
        l1.setForeground(Color.white);
        l1.setBounds(50,480,200,30);
        
        JTextField playername = new JTextField(" ");
        playername.setBounds(240,475,330,40);
        playername.setFont(font);
        
        JButton start = new JButton("START");
        start.setBounds(145,570,380,80);
        start.setFont(new Font("Arial",Font.BOLD,30));
        start.setForeground(Color.white);
        start.setBackground(new Color(0,153,0));
        start.setFocusable(false);
        
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String playerNameText = playername.getText().trim();
                if (!playerNameText.isEmpty()) {
                    // Player name is not empty, proceed to the next frame (frame2)
                    mechanics();
                    f1.dispose(); // Close the current frame
                    
                } else {
                    // Display a message or handle the case where the player name is empty
                    JOptionPane.showMessageDialog(f1, "Please enter a valid player name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        f1.setLayout(null);
        f1.setSize(650,750);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.add(imageLabel);
        f1.add(l1);
        f1.add(playername);
        f1.add(start);
    }
    public void mechanics(){
    JFrame f2 = new JFrame("Who Wants to be a Millionaire?");
    Container contentPane = f2.getContentPane();
    contentPane.setBackground(new Color(0,0,51));
    
    ImageIcon imageIconf2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); // Replace with the actual path to your image
    JLabel imageLabelf2 = new JLabel(imageIconf2);
    imageLabelf2.setBounds(165, 20, 300, 300);
    
    JLabel l2 = new JLabel("How to Play?");
    l2.setBounds(210, 290, 250, 50);
    l2.setFont(new Font("Impact",Font.PLAIN,40));
    l2.setForeground(Color.white);
    
    Font font1 = new Font("Arial", Font.PLAIN, 14);
    
    JLabel r1 = new JLabel("Build your fortune by answering  questions correctly and moving up the ladder toward Php. 1,000,000.00!");
    r1.setFont(new Font("Arial",Font.BOLD,12));
    r1.setBounds(20,360,590,20);
    r1.setForeground(Color.white);
    
    JLabel r2 = new JLabel("Along the way, you have three lifelines:");
    r2.setBounds(50,390,610,20);
    r2.setFont(font1);
    r2.setForeground(Color.white);
    
    JLabel lf1 = new JLabel("Skip");
    lf1.setBounds(155,420,50,20);
    lf1.setFont(font1);
    lf1.setForeground(Color.white);
    ImageIcon lifeline1 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\skip.png");
    JLabel skip = new JLabel(lifeline1);
    skip.setBounds(120,415,100,100);
    JLabel skipdef = new JLabel("Skip --- Allows you to skip a question.");
    skipdef.setBounds(50,510,400,20);
    skipdef.setFont(font1);
    skipdef.setForeground(Color.white);
    
    JLabel lf2 = new JLabel("Remove");
    lf2.setBounds(255,420,60,20);
    lf2.setFont(font1);
    lf2.setForeground(Color.white);
    ImageIcon lifeline2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\remove.png");
    JLabel remove = new JLabel(lifeline2);
    remove.setBounds(230,415,100,100);
    JLabel removedef = new JLabel("Remove --- Disables two wrong choices.");
    removedef.setBounds(50,530,400,20);
    removedef.setFont(font1);
    removedef.setForeground(Color.white);
    
    JLabel lf3 = new JLabel("Hint");
    lf3.setBounds(375,420,60,20);
    lf3.setFont(font1);
    lf3.setForeground(Color.white);
    ImageIcon lifeline3 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\hint.png");
    JLabel hint = new JLabel(lifeline3);
    hint.setBounds(340,415,100,100);
    JLabel hintdef = new JLabel("Hint --- Gives you a clue about the correct answer.");
    hintdef.setBounds(50,550,400,20);
    hintdef.setFont(font1);
    hintdef.setForeground(Color.white);
    
    JLabel r3 = new JLabel("You can only use each lifeline once. Use them wisely.");
    r3.setBounds(50,590,420,20);
    r3.setFont(new Font("Arial", Font.BOLD,16));
    r3.setForeground(Color.white);
    
    JButton play = new JButton("PLAY");
    play.setBounds(160,640,300,60);
    play.setFont(new Font("Arial",Font.BOLD,40));
    play.setBackground(new Color(0,153,76));
    play.setForeground(Color.white);
    play.setFocusable(false);
    
        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(false);
                new Questions();     
                }
            });
        
    
    f2.setLayout(null);
    f2.setSize(650,770);
    f2.setVisible(true);
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f2.add(imageLabelf2);
    f2.add(l2);
    f2.add(r1);
    f2.add(r2);
    f2.add(lf1);
    f2.add(skip);
    f2.add(lf2);
    f2.add(remove);
    f2.add(lf3);
    f2.add(hint);
    f2.add(skipdef);
    f2.add(removedef);
    f2.add(hintdef);
    f2.add(r3);
    f2.add(play);
    }
}
class Questions extends JFrame{
public static int prizeowned;
public Questions(){

//ammount frames and question frame init
JFrame a1 = new JFrame("Who Wants to be a Millionaire?");
Container contentPane = a1.getContentPane();
contentPane.setBackground(new Color(0,0,51));

 JFrame q1 = new JFrame("Who Wants to be a Millionaire?");
 Container contentPane1 = q1.getContentPane();
 contentPane1.setBackground(new Color(0,0,51));
 
 JFrame a2 = new JFrame("Who Wants to be a Millionaire?");
Container contentPane2 = a2.getContentPane();
contentPane2.setBackground(new Color(0,0,51));

 JFrame q2 = new JFrame("Who Wants to be a Millionaire?");
 Container contentPane3 = q2.getContentPane();
 contentPane3.setBackground(new Color(0,0,51));
 //end of amount frames and question frame init
 //Wrong answer
JFrame w = new JFrame("Who Wants to be a Millionaire?");
Container contentPanew = w.getContentPane();
contentPanew.setBackground(new Color(0,0,51));
 ImageIcon imageIconw = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); 
 JLabel imageLabelw = new JLabel(imageIconw);
 imageLabelw.setBounds(150, 50, 300, 300);
 
 JLabel won = new JLabel("You won: ");
 won.setBounds(120,380,200,30);
 won.setFont(new Font("Arial",Font.BOLD,30));
 won.setForeground(Color.white);
 
 JTextField prize = new JTextField();
 prize.setText(String.valueOf(prizeowned));
 prize.setEditable(false);
 prize.setEnabled(false);
 prize.setBounds(120,430,500,80);
 prize.setFont(new Font("Impact",Font.PLAIN,60));
 prize.setBackground(new Color(0,0,51));
 prize.setBorder(null);
 
w.setLayout(null);
w.setSize(650,770);
w.setVisible(false);
w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
w.add(imageLabelw);
w.add(won);
w.add(prize);
//end of wrong answer

//a1
 ImageIcon imageIcona1 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); 
 JLabel imageLabela1 = new JLabel(imageIcona1);
 imageLabela1.setBounds(165, 50, 300, 300);
 
 JLabel am1 = new JLabel("QUESTION 1");
 am1.setBounds(225,360,300,50);
 am1.setFont(new Font("Arial",Font.PLAIN,30));
 am1.setForeground(Color.white);
 
 JPanel p = new JPanel();
 p.setBounds(30,430,570,80);
 p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));
 p.setBackground(new Color(0,76,153));
 p.setBorder(BorderFactory.createLineBorder(Color.white,2));
 
 JLabel prize1 = new JLabel("Php. 100");
 prize1.setFont(new Font("Impact", Font.PLAIN, 40));
 prize1.setForeground(Color.white);
 
 p.add(prize1);
 
JButton pl = new JButton("PLAY");
pl.setBounds(120,550,400,70);
pl.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
    a1.setVisible(false);
    q1.setVisible(true);
}
});
pl.setFont(new Font("Arial",Font.BOLD,30));
pl.setBackground(Color.green);
pl.setForeground(Color.white);
pl.setFocusable(false);

a1.add(imageLabela1);
a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a1.setLayout(null);
a1.setSize(650,770);
a1.setVisible(true);
a1.add(am1);
a1.add(p);
a1.add(pl);



//q1
 Font font2 = new Font("Arial", Font.PLAIN,16);
 
 ImageIcon imageIconq1 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); 
 JLabel imageLabelq1 = new JLabel(imageIconq1);
 imageLabelq1.setBounds(165, 10, 300, 300);
 

 JLabel questionnum1 = new JLabel("QUESTION 1");
 questionnum1.setBounds(255,280,500,30);
 questionnum1.setFont(new Font("Arial",Font.PLAIN,20));
 questionnum1.setForeground(Color.white);
 
 JLabel amount = new JLabel("PHP. 100.00");
 amount.setBounds(220,310,400,50);
 amount.setFont(new Font("Impact",Font.PLAIN,40));
 amount.setForeground(new Color(204,204,0));

JLabel s = new JLabel("Skip");
s.setBounds(160,390,40,20);
s.setFont(font2);
s.setForeground(Color.white);

JLabel rem = new JLabel("Remove");
rem.setBounds(290,390,60,20);
rem.setFont(font2);
rem.setForeground(Color.white);

JLabel h = new JLabel("Hint");
h.setBounds(430,390,60,20);
h.setFont(font2);
h.setForeground(Color.white);

Icon skiplf = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\skip.png");
JButton skiplifeline = new JButton(skiplf);
skiplifeline.setBounds(150,420,50,50);
skiplifeline.setBackground(new Color(0,0,51));
skiplifeline.setBorder(null);
skiplifeline.setFocusable(false);

Icon remlf = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\remove.png");
JButton remlifeline = new JButton(remlf);
remlifeline.setBounds(295,420,50,50);
remlifeline.setBackground(new Color(0,0,51));
remlifeline.setBorder(null);
remlifeline.setFocusable(false);

Icon hlf = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\hint.png");
JButton hlifeline = new JButton(hlf);
hlifeline.setBounds(420,420,50,50);
hlifeline.setBackground(new Color(0,0,51));
hlifeline.setBorder(null);
hlifeline.setFocusable(false);
 
JPanel questionbg = new JPanel();
questionbg.setBounds(17, 490,600, 80);
questionbg.setBackground(new Color(0,76,153));
questionbg.setBorder(BorderFactory.createLineBorder(Color.darkGray,4));
JLabel question1 = new JLabel("What is the meaning of HTML?");
question1.setFont(font2);
question1.setForeground(Color.white);
questionbg.add(question1);
questionbg.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));

JPanel c = new JPanel();
c.setBounds(70,580,500,120);
c.setBackground(new Color(0,0,51));
c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 12));


JRadioButton choice1 = new JRadioButton("Hypertext Markup Language");
choice1.setFont(new Font("Arial",Font.PLAIN,16));
choice1.setBackground(new Color(0,0,51));
choice1.setForeground(Color.white);
JRadioButton choice2 = new JRadioButton("Hypertext Marking Language");
choice2.setFont(new Font("Arial",Font.PLAIN,16));
choice2.setBackground(new Color(0,0,51));
choice2.setForeground(Color.white);
JRadioButton choice3 = new JRadioButton("Hypertext Making Language");
choice3.setFont(new Font("Arial",Font.PLAIN,16));
JRadioButton choice4 = new JRadioButton("Hypertext Mutual Language");
choice3.setBackground(new Color(0,0,51));
choice3.setForeground(Color.white);
choice4.setFont(new Font("Arial",Font.PLAIN,16));
choice4.setBackground(new Color(0,0,51));
choice4.setForeground(Color.white);

ButtonGroup choices = new ButtonGroup();
choices.add(choice1);
choices.add(choice2);
choices.add(choice3);
choices.add(choice4);

 c.add(choice1);
 c.add(choice2);
 c.add(choice3);
 c.add(choice4);
 
choice1.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice1.isSelected()){
    JOptionPane.showMessageDialog(q1,"Your answer is correct","Congratulations",JOptionPane.INFORMATION_MESSAGE);
    prizeowned += 100;
    q1.setVisible(false);
    a2.setVisible(true);
}
}
});
choice2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice2.isSelected()){
    JOptionPane.showMessageDialog(q1,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 0000000;
    q1.setVisible(false);
    w.setVisible(true);
}
}
});
choice3.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice3.isSelected()){
    JOptionPane.showMessageDialog(q1,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 0000000;
    q1.setVisible(false);
    w.setVisible(true);
}
}
}); 
choice4.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice4.isSelected()){
    JOptionPane.showMessageDialog(q1,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 0;
    q1.setVisible(false);
    w.setVisible(true);
}
}
});

 q1.setLayout(null);
 q1.setSize(650,770);
 q1.setVisible(false);
 q1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 q1.add(imageLabelq1);
 q1.add(questionnum1);
 q1.add(questionbg);
 q1.add(skiplifeline);
 q1.add(s);
 q1.add(rem);
 q1.add(h);
 q1.add(remlifeline);
 q1.add(hlifeline);
 q1.add(c);
 q1.add(amount);
 
 //q1
 
 //a2
 JLabel am2 = new JLabel("QUESTION 2");
 am2.setBounds(225,360,300,50);
 am2.setFont(new Font("Arial",Font.PLAIN,30));
 am2.setForeground(Color.white);
 
 ImageIcon imageIcona2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); 
 JLabel imageLabela2 = new JLabel(imageIcona2);
 imageLabela2.setBounds(165, 50, 300, 300);
 
 JPanel ply = new JPanel();
 ply.setBounds(30,430,570,80);
 ply.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));
 ply.setBackground(new Color(0,76,153));
 ply.setBorder(BorderFactory.createLineBorder(Color.white,2));
 
 JLabel prize2 = new JLabel("Php. 200");
 prize2.setFont(new Font("Impact", Font.PLAIN, 40));
 prize2.setForeground(Color.white);
 
 ply.add(prize2);
 
JButton pl2 = new JButton("PLAY");
pl2.setBounds(120,550,400,70);
pl2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
    a2.setVisible(false);
    q2.setVisible(true);
}
});
pl2.setFont(new Font("Arial",Font.BOLD,30));
pl2.setBackground(Color.green);
pl2.setForeground(Color.white);
pl2.setFocusable(false);

a2.add(imageLabela2);
a2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a2.setLayout(null);
a2.setSize(650,770);
a2.setVisible(false);
a2.add(am2);
a2.add(ply);
a2.add(pl2);
 
//q2
 ImageIcon imageIconq2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\Logo.png"); 
 JLabel imageLabelq2 = new JLabel(imageIconq2);
 imageLabelq2.setBounds(165, 10, 300, 300);
 
 JLabel questionnum2 = new JLabel("QUESTION 2");
 questionnum2.setBounds(255,280,500,30);
 questionnum2.setFont(new Font("Arial",Font.PLAIN,20));
 questionnum2.setForeground(Color.white);
 
 JLabel amount2 = new JLabel("PHP. 200.00");
 amount.setBounds(220,310,400,50);
 amount.setFont(new Font("Impact",Font.PLAIN,40));
 amount.setForeground(new Color(204,204,0));

JLabel s2 = new JLabel("Skip");
s2.setBounds(160,390,40,20);
s2.setFont(font2);
s2.setForeground(Color.white);

JLabel rem2 = new JLabel("Remove");
rem2.setBounds(290,390,60,20);
rem2.setFont(font2);
rem2.setForeground(Color.white);

JLabel h2 = new JLabel("Hint");
h2.setBounds(430,390,60,20);
h2.setFont(font2);
h2.setForeground(Color.white);

Icon skiplf2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\skip.png");
JButton skiplifeline2 = new JButton(skiplf2);
skiplifeline2.setBounds(150,420,50,50);
skiplifeline2.setBackground(new Color(0,0,51));
skiplifeline2.setBorder(null);
skiplifeline2.setFocusable(false);

Icon remlf2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\remove.png");
JButton remlifeline2= new JButton(remlf2);
remlifeline2.setBounds(295,420,50,50);
remlifeline2.setBackground(new Color(0,0,51));
remlifeline2.setBorder(null);
remlifeline2.setFocusable(false);

Icon hlf2 = new ImageIcon("C:\\Users\\Khristine Lining\\Documents\\NetBeansProjects\\WhoWantsToBeAMillionaire2\\img\\hint.png");
JButton hlifeline2 = new JButton(hlf2);
hlifeline2.setBounds(420,420,50,50);
hlifeline2.setBackground(new Color(0,0,51));
hlifeline2.setBorder(null);
hlifeline2.setFocusable(false);
 
JPanel questionbg2 = new JPanel();
questionbg2.setBounds(17, 490,600, 80);
questionbg2.setBackground(new Color(0,76,153));
questionbg2.setBorder(BorderFactory.createLineBorder(Color.darkGray,4));
JLabel question2 = new JLabel("How do you declare a variable in Java?");
question2.setFont(font2);
question2.setForeground(Color.white);
questionbg2.add(question2);
questionbg2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));

JPanel c2 = new JPanel();
c2.setBounds(70,580,500,120);
c2.setBackground(new Color(0,0,51));
c2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 12));

JRadioButton choice1q2 = new JRadioButton("int x;");
choice1q2.setFont(new Font("Arial",Font.PLAIN,16));
choice1q2.setBackground(new Color(0,0,51));
choice1q2.setForeground(Color.white);
JRadioButton choice2q2 = new JRadioButton("variable x;");
choice2q2.setFont(new Font("Arial",Font.PLAIN,16));
choice2q2.setBackground(new Color(0,0,51));
choice2q2.setForeground(Color.white);
JRadioButton choice3q2 = new JRadioButton("x = int;");
choice3q2.setFont(new Font("Arial",Font.PLAIN,16));
choice3q2.setBackground(new Color(0,0,51));
choice3q2.setForeground(Color.white);
JRadioButton choice4q2 = new JRadioButton("declare x;");
choice4q2.setFont(new Font("Arial",Font.PLAIN,16));
choice4q2.setBackground(new Color(0,0,51));
choice4q2.setForeground(Color.white);

ButtonGroup choicesq2 = new ButtonGroup();
choicesq2.add(choice1q2);
choicesq2.add(choice2q2);
choicesq2.add(choice3q2);
choicesq2.add(choice4q2);

 c2.add(choice1q2);
 c2.add(choice2q2);
 c2.add(choice3q2);
 c2.add(choice4q2);
 
choice1q2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice1q2.isSelected()){
    JOptionPane.showMessageDialog(q2,"Your answer is correct","Congratulations",JOptionPane.INFORMATION_MESSAGE);
    q2.setVisible(false);
    a2.setVisible(true);
}
}
});
choice2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice2q2.isSelected()){
    JOptionPane.showMessageDialog(q2,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 0000000;
    q2.setVisible(false);
    w.setVisible(true);
}
}
});
choice3q2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice3q2.isSelected()){
    JOptionPane.showMessageDialog(q2,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 0000000;
    q2.setVisible(false);
    w.setVisible(true);
}
}
}); 
choice4q2.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
if(choice4q2.isSelected()){
    JOptionPane.showMessageDialog(q2,"Your answer is incorrect",null,JOptionPane.INFORMATION_MESSAGE);
    prizeowned = 00000;
    q2.setVisible(false);
    w.setVisible(true);
}
}
});

 q2.setLayout(null);
 q2.setSize(650,770);
 q2.setVisible(false);
 q2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 q2.add(imageLabelq2);
 q2.add(questionnum2);
 q2.add(questionbg2);
 q2.add(skiplifeline2);
 q2.add(s2);
 q2.add(rem2);
 q2.add(h2);
 q2.add(remlifeline2);
 q2.add(hlifeline2);
 q2.add(c2);
 q2.add(amount2);
}
}

public class WhoWantsToBeAMillionaire2 {
    public static void main(String[] args) {
       startFrame s = new startFrame();
    }
}
