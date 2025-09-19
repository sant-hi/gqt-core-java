package com.gqt.project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Question {
    String text;
    String[] opt;
    char crtAns;

    public Question(String text, String[] opt, char crtAns) {
        this.text = text;
        this.opt = opt;
        this.crtAns = crtAns;
    }
}


class Demo1 {
    private Question[] que;
    private int[] amtGot;
    private int crntQ = 0;
    private int crntAmt = 0;
    private boolean fifty = false;
    private boolean audPoll = false;

    public Demo1(Question[] que, int[] amtGot) {
        this.que = que;
        this.amtGot = amtGot;
    }

    public Question getCurrentQuestion() {
        return que[crntQ];
    }

    public boolean checkCrtOrNot(char selAns) {
        if (selAns == que[crntQ].crtAns) {
        	crntAmt = amtGot[crntQ];
            return true;
        }else {
        return false;
    }
    }

    public int currentAmt() {
        return crntAmt;
    }

    public int amtForQuit() {
        if (crntQ <= 4) return 0;
        else if (crntQ <= 6) return amtGot[4];
        else return amtGot[6];
    }

    public void changeQuestion() {
    	crntQ++;
    }

    public boolean hasMoreQuestions() {
        return crntQ < que.length;
    }

    public boolean checkFifFif() {
        return fifty;
    }

    public boolean isPollUsed() {
        return audPoll;
    }

    public void useFifty() {
    	fifty = true;
    }

    public void usePoll() {
    	audPoll = true;
    }

    public int IndexofCrntQues() {
        return crntQ;
    }
}


class QuizScreen extends JFrame implements ActionListener {
    private Demo1 game;
    private JLabel quesL, amntL, lifelineL, playerL;
    private JButton[] optBut;
    private JButton lifelineBtn, quitBtn, nextQBtn;
    private JTextArea audPollResult;
    private boolean answered = false;
    private String playerName;

    public QuizScreen(Demo1 game, String playerName) {
        this.game = game;
        this.playerName = playerName;

        setTitle("Millionaire Show");
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        playerL = new JLabel("Player: " + playerName);
        playerL.setBounds(600, 20, 200, 30);
        add(playerL);

        amntL = new JLabel("Amount got: Rs.0");
        amntL.setBounds(30, 20, 400, 30);
        amntL.setForeground(Color.BLUE);
        add(amntL);

        quesL = new JLabel();
        quesL.setBounds(30, 70, 700, 40);
        add(quesL);

        optBut = new JButton[4];
        for (int i = 0; i < 4; i++) {
        	optBut[i] = new JButton();
        	optBut[i].setBounds(50, 140 + i * 60, 350, 45);
        	optBut[i].setBackground(Color.blue);
        	optBut[i].setFocusPainted(false);
        	optBut[i].addActionListener(this);
            add(optBut[i]);
        }

        lifelineBtn = new JButton("Use Lifeline");
        lifelineBtn.setBounds(450, 140, 200, 45);
        lifelineBtn.setBackground(Color.yellow);
        lifelineBtn.addActionListener(this);
        add(lifelineBtn);

        quitBtn = new JButton("Quit Game");
        quitBtn.setBounds(450, 200, 200, 45);
        quitBtn.setBackground(Color.red);
        quitBtn.addActionListener(this);
        add(quitBtn);

        nextQBtn = new JButton("Next Question");
        nextQBtn.setBounds(450, 260, 200, 45);
        nextQBtn.setBackground(Color.pink);
        nextQBtn.setEnabled(false);
        nextQBtn.addActionListener(this);
        add(nextQBtn);

        lifelineL = new JLabel("Lifelines Available: 50-50, Audience Poll");
        lifelineL.setBounds(30, 480, 600, 30);
        lifelineL.setForeground(Color.MAGENTA);
        add(lifelineL);

        audPollResult = new JTextArea();
        audPollResult.setBounds(450, 330, 300, 150);
        audPollResult.setEditable(false);
        audPollResult.setBackground(Color.orange);
        add(audPollResult);

        displayQues();
        setVisible(true);
    }

    private void displayQues() {
        answered = false;
        audPollResult.setText("");
        getContentPane().setBackground(Color.white); 

        Question q = game.getCurrentQuestion();
        quesL.setText(q.text);

        char optChar = 'A';
        for (int i = 0; i < 4; i++) {
        	optBut[i].setText(optChar + ") " + q.opt[i]);
        	optBut[i].setEnabled(true);
        	optBut[i].setBackground(Color.cyan);
            optChar++;
        }
        nextQBtn.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quitBtn) {
            getContentPane().setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "You quit The Game! \n Final amount: Rs." + game.currentAmt());
            System.exit(0);
        } else if (e.getSource() == lifelineBtn) {
        	showLifeline();
        } else if (e.getSource() == nextQBtn) {
            game.changeQuestion();
            if (game.hasMoreQuestions()) {
                displayQues();
            } else {
                getContentPane().setBackground(new Color(186, 85, 211));
                JOptionPane.showMessageDialog(this, "Congratulations " + playerName + 
                        "! You are a Millionaire of Rs." + game.currentAmt());
                System.exit(0);
            }
        } else {
            JButton clicked = (JButton) e.getSource();
            checkAnswer(clicked, clicked.getText().charAt(0));
        }
    }

    private void checkAnswer(JButton clicked, char selAns) {
        if (answered) return;
        answered = true;

        if (game.checkCrtOrNot(selAns)) {
            clicked.setBackground(Color.GREEN);
            getContentPane().setBackground(Color.green);
            amntL.setText("Amount secured: Rs." + game.currentAmt());

            if (!game.hasMoreQuestions()) {
            	clicked.setBackground(Color.magenta);
                getContentPane().setBackground(Color.magenta); 
                JOptionPane.showMessageDialog(this, " Congratulations " + playerName +
                        "! You are a Millionaire of Rs." + game.currentAmt());
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Correct! You won Rs." + game.currentAmt());
                nextQBtn.setEnabled(true);
            }

        } else {
            clicked.setBackground(Color.RED);
            getContentPane().setBackground(Color.RED);
            int reduAmnt = game.amtForQuit();
            JOptionPane.showMessageDialog(this, " Wrong! Correct Answer was: " +
                    game.getCurrentQuestion().crtAns +
                    "\nYou take home Rs." + reduAmnt);
            System.exit(0);
        }

        for (int i = 0; i < optBut.length; i++) {
            optBut[i].setEnabled(false);
        }
    }


    private void showLifeline() {
        String[] options = new String[2];
        int idx = 0;
        if (!game.checkFifFif()) options[idx++] = "50-50";
        if (!game.isPollUsed()) options[idx++] = "Audience Poll";

        if (idx == 0) {
            JOptionPane.showMessageDialog(this, "No lifelines left!");
            return;
        }
        String choice = (String) JOptionPane.showInputDialog(this, "Choose Lifeline:", "Lifelines",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == null) return;
        if (choice.equals("50-50") && !game.checkFifFif()) {
            useFifty();
            game.useFifty();
        } else if (choice.equals("Audience Poll") && !game.isPollUsed()) {
            usePoll();
            game.usePoll();
        }
        updateLifelineLabel();
    }

    private void useFifty() {
        int correctIdx = game.getCurrentQuestion().crtAns - 'A';
        int removed = 0;
        for (int i = 0; i < 4 && removed < 2; i++) {
            if (i != correctIdx) {
            	optBut[i].setText("");
            	optBut[i].setEnabled(false);
            	optBut[i].setBackground(Color.gray);
                removed++;
            }
        }
    }

    private void usePoll() {
    	audPollResult.setText(" Audience Poll Results:\n");
        for (int i = 0; i < 4; i++) {
            char optChar = (char) ('A' + i);
            if (optChar == game.getCurrentQuestion().crtAns) {
            	audPollResult.append(optChar + ": 73%\n");
            } else {
            	audPollResult.append(optChar + ": 17%\n");
            }
        }
    }

    private void updateLifelineLabel() {
        String text = "Lifelines Available: ";
        if (!game.checkFifFif())
        	{
        	text += "50-50 ";
        	}
        if (!game.isPollUsed())
        	{
        	text += "Audience Poll";
        	}
        if (game.checkFifFif() && game.isPollUsed())
        	{
        	text = "No Lifelines Left";
        	}
        lifelineL.setText(text);
    }
}


class LoginPage extends JFrame implements ActionListener {
    private JTextField name, email, phone;
    private JButton submitBtn;

    public LoginPage() {
        setTitle("Login Page");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);

        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(50, 50, 100, 30);
        add(nameL);

        name = new JTextField();
        name.setBounds(150, 50, 180, 30);
        add(name);

        JLabel emailL = new JLabel("Email:");
        emailL.setBounds(50, 100, 100, 30);
        add(emailL);

        email = new JTextField();
        email.setBounds(150, 100, 180, 30);
        add(email);

        JLabel phoneL = new JLabel("Phone:");
        phoneL.setBounds(50, 150, 100, 30);
        add(phoneL);

        phone = new JTextField();
        phone.setBounds(150, 150, 180, 30);
        add(phone);

        submitBtn = new JButton("Start Quiz");
        submitBtn.setBounds(150, 200, 120, 40);
        submitBtn.setBackground(Color.DARK_GRAY);
        submitBtn.setForeground(Color.WHITE);
        submitBtn.addActionListener(this);
        add(submitBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String aname = name.getText().trim();
        String aemail = email.getText().trim();
        String aphone = phone.getText().trim();

        if (aname.isEmpty() || aemail.isEmpty() || aphone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        dispose();

      
        Question[] questions = {
            new Question("1: What is the capital of India?", new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"}, 'B'),
            new Question("2: Who wrote the national anthem of India?", new String[]{"Rabindranath Tagore", "Bankim Chandra Chatterjee", "Allama Iqbal", "Subramania Bharati"}, 'A'),
            new Question("3: Which planet is known as the Red Planet?", new String[]{"Venus", "Mars", "Jupiter", "Saturn"}, 'B'),
            new Question("4: What is H2O commonly called?", new String[]{"Salt", "Water", "Oxygen", "Hydrogen"}, 'B'),
            new Question("5: Which is the largest continent by area?", new String[]{"Africa", "Asia", "Europe", "Antarctica"}, 'B'),
            new Question("6: Which language is primarily used for Android development?", new String[]{"Kotlin", "Swift", "Ruby", "PHP"}, 'A'),
            new Question("7: What is the boiling point of water at sea level (in Celsius)?", new String[]{"90", "80", "100", "212"}, 'C'),
            new Question("8: Who is known as the father of computers?", new String[]{"Albert Einstein", "Charles Babbage", "Isaac Newton", "Nikola Tesla"}, 'B'),
            new Question("9: What is the value of pi (approx)?", new String[]{"2.14", "3.14", "4.14", "1.14"}, 'B'),
            new Question("10: Which gas do plants absorb from the atmosphere?", new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Helium"}, 'C')
        };

        int[] amtGot = {1000,2000,3000,5000,10000,20000,40000,80000,160000,10000000};

        Demo1 d = new Demo1(questions, amtGot);
        QuizScreen g= new QuizScreen(d, aname);
    }
}


public class SwingCrorepathi {
    public static void main(String[] args) {
        LoginPage l =new LoginPage();  
    }
}
