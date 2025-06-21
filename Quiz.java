import java.awt.event.ActionEvent;
import javax.swing.*;

public class Quiz {
   public static void main(String[] args) {
    JFrame frame = new JFrame("Quiz App");
    frame.setSize(900, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(null);

   JTabbedPane tabbedPane = new JTabbedPane();
   tabbedPane.setBounds(100, 100, 600, 270);

    // ---------------- Panel 1 ----------------
    JPanel panel1 = new JPanel();
    panel1.setLayout(null);
        
    JLabel questionLabel = new JLabel("Which of these is not a keyword in Java?");
    questionLabel.setBounds(20, 20, 380, 20);

    JRadioButton option1 = new JRadioButton("Class");
    option1.setBounds(30, 50, 200, 20);
    JRadioButton option2 = new JRadioButton("int");
    option2.setBounds(30, 75, 200, 20);
    JRadioButton option3 = new JRadioButton("get");
    option3.setBounds(30, 100, 200, 20);
    JRadioButton option4 = new JRadioButton("if");
    option4.setBounds(30, 125, 200, 20);

    ButtonGroup optionsGroup1 = new ButtonGroup();
    optionsGroup1.add(option1);
    optionsGroup1.add(option2);
    optionsGroup1.add(option3);
    optionsGroup1.add(option4);

    JButton nextButton1 = new JButton("Next");
    nextButton1.setBounds(150, 170, 80, 30);
    nextButton1.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(1));

    panel1.add(questionLabel);
    panel1.add(option1);
    panel1.add(option2);
    panel1.add(option3);
    panel1.add(option4);
    panel1.add(nextButton1);

    // ---------------- Panel 2 ----------------
    JPanel panel2 = new JPanel();
    panel2.setLayout(null);

    JLabel questionLabel2 = new JLabel("What is the size of int in Java?");
    questionLabel2.setBounds(20, 20, 380, 20);

    JRadioButton o1 = new JRadioButton("2 bytes");
    o1.setBounds(30, 50, 200, 20);
    JRadioButton o2 = new JRadioButton("4 bytes");
    o2.setBounds(30, 70, 200, 20);
    JRadioButton o3 = new JRadioButton("8 bytes");
    o3.setBounds(30, 90, 200, 20);
    JRadioButton o4 = new JRadioButton("9 bytes");
    o4.setBounds(30, 110, 200, 20);

    ButtonGroup optionsGroup2 = new ButtonGroup();
    optionsGroup2.add(o1);
    optionsGroup2.add(o2);
    optionsGroup2.add(o3);
    optionsGroup2.add(o4);

    JButton prevButton2 = new JButton("Previous");
    prevButton2.setBounds(50, 170, 100, 30);
    prevButton2.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(0));

   JButton nextButton2 = new JButton("Next");
    nextButton2.setBounds(200, 170, 100, 30);
    nextButton2.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(2));

    panel2.add(questionLabel2);
    panel2.add(o1);
    panel2.add(o2);
    panel2.add(o3);
    panel2.add(o4);
    panel2.add(prevButton2);
    panel2.add(nextButton2);

    // ---------------- Panel 3 ----------------
    JPanel panel3 = new JPanel();
    panel3.setLayout(null);

    JLabel questionLabel3 = new JLabel("What does JVM stand for?");
    questionLabel3.setBounds(20, 20, 380, 20);

    JRadioButton q3o1 = new JRadioButton("Java Variable Machine");
    q3o1.setBounds(30, 50, 200, 20);
    JRadioButton q3o2 = new JRadioButton("Java Virtual Machine");
    q3o2.setBounds(30, 70, 200, 20);
    JRadioButton q3o3 = new JRadioButton("Just Virtual Machine");
    q3o3.setBounds(30, 90, 200, 20);
    JRadioButton q3o4 = new JRadioButton("Java Verified Machine");
    q3o4.setBounds(30, 110, 200, 20);

    ButtonGroup group3 = new ButtonGroup();
    group3.add(q3o1);
    group3.add(q3o2);
    group3.add(q3o3);
    group3.add(q3o4);

    JButton prevButton3 = new JButton("Previous");
    prevButton3.setBounds(50, 170, 100, 30);
    prevButton3.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(1));

    JButton nextButton3 = new JButton("Next");
    nextButton3.setBounds(200, 170, 100, 30);
    nextButton3.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(3));

    panel3.add(questionLabel3);
    panel3.add(q3o1);
    panel3.add(q3o2);
    panel3.add(q3o3);
    panel3.add(q3o4);
    panel3.add(prevButton3);
    panel3.add(nextButton3);

    // ---------------- Panel 4 ----------------
    JPanel panel4 = new JPanel();
    panel4.setLayout(null);

    JLabel questionLabel4 = new JLabel("Which company developed Java?");
    questionLabel4.setBounds(20, 20, 380, 20);

    JRadioButton q4o1 = new JRadioButton("Microsoft");
    q4o1.setBounds(30, 50, 200, 20);
    JRadioButton q4o2 = new JRadioButton("Sun Microsystems");
    q4o2.setBounds(30, 70, 200, 20);
    JRadioButton q4o3 = new JRadioButton("Apple");
    q4o3.setBounds(30, 90, 200, 20);
    JRadioButton q4o4 = new JRadioButton("Google");
    q4o4.setBounds(30, 110, 200, 20);

    ButtonGroup group4 = new ButtonGroup();
    group4.add(q4o1);
    group4.add(q4o2);
    group4.add(q4o3);
    group4.add(q4o4);

    JButton prevButton4 = new JButton("Previous");
    prevButton4.setBounds(50, 170, 100, 30);
    prevButton4.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(2));

    JButton nextButton4 = new JButton("Next");
    nextButton4.setBounds(200, 170, 100, 30);
    nextButton4.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(4));

    panel4.add(questionLabel4);
    panel4.add(q4o1);
    panel4.add(q4o2);
    panel4.add(q4o3);
    panel4.add(q4o4);
    panel4.add(prevButton4);
    panel4.add(nextButton4);

    // ---------------- Panel 5 ----------------
    JPanel panel5 = new JPanel();
    panel5.setLayout(null);

    JLabel questionLabel5 = new JLabel("Which of these is a valid Java data type?");
    questionLabel5.setBounds(20, 20, 380, 20);

    JRadioButton q5o1 = new JRadioButton("real");
    q5o1.setBounds(30, 50, 200, 20);
    JRadioButton q5o2 = new JRadioButton("float");
    q5o2.setBounds(30, 70, 200, 20);
    JRadioButton q5o3 = new JRadioButton("num");
    q5o3.setBounds(30, 90, 200, 20);
    JRadioButton q5o4 = new JRadioButton("decimal");
    q5o4.setBounds(30, 110, 200, 20);

    ButtonGroup group5 = new ButtonGroup();
    group5.add(q5o1);
    group5.add(q5o2);
    group5.add(q5o3);
    group5.add(q5o4);

    JButton prevButton5 = new JButton("Previous");
    prevButton5.setBounds(50, 170, 100, 30);
    prevButton5.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(3));

    JButton nextButton5 = new JButton("Next");
    nextButton5.setBounds(200, 170, 100, 30);
    nextButton5.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(5));

    panel5.add(questionLabel5);
    panel5.add(q5o1);
    panel5.add(q5o2);
    panel5.add(q5o3);
    panel5.add(q5o4);
    panel5.add(prevButton5);
    panel5.add(nextButton5);

    // Add all panels to the tabbedPane
    tabbedPane.addTab("Que 1", panel1);
    tabbedPane.addTab("Que 2", panel2);
    tabbedPane.addTab("Que 3", panel3);
    tabbedPane.addTab("Que 4", panel4);
    tabbedPane.addTab("Que 5", panel5);

    // Questions and options for Que 6 to Que 10
    String[] questions = {
    "Which keyword is used to inherit a class in Java?",
    "What is the default value of a boolean in Java?",
    "Which package contains the Random class?",
    "Which method is used to start a thread in Java?",
    "Which of these is not an OOP concept in Java?"
  };

      
  String[][] options = {
    {"this", "super", "extends", "implements"},
    {"true", "false", "null", "0"},
    {"java.util", "java.io", "java.lang", "java.net"},
    {"run()", "start()", "execute()", "init()"},
    {"Encapsulation", "Polymorphism", "Compilation", "Inheritance"}
  };

  ButtonGroup[] buttonGroups = new ButtonGroup[5];  // To store groups if needed

  for (int i = 0; i < 5; i++) {
    JPanel panel = new JPanel();
    panel.setLayout(null);

    JLabel qLabel = new JLabel("Que " + (i + 6) + ": " + questions[i]);
    qLabel.setBounds(20, 20, 360, 20);
    panel.add(qLabel);

    ButtonGroup group = new ButtonGroup();
    buttonGroups[i] = group;

    for (int j = 0; j < 4; j++) {
    JRadioButton option = new JRadioButton(options[i][j]);
    option.setBounds(30, 50 + j * 25, 200, 20);
    group.add(option);
    panel.add(option);
    }

    // Previous Button
   JButton prev = new JButton("Previous");
   prev.setBounds(50, 170, 100, 30);
   int currentIndex = i + 5; // Because Que6 is index 5
   int prevIndex = currentIndex - 1;
   prev.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(prevIndex));
   panel.add(prev);

    // Next Button (for Que 6–9 only)
   if (i < 4) {
   JButton next = new JButton("Next");
   next.setBounds(200, 170, 100, 30);
   int nextIndex = currentIndex + 1;
   next.addActionListener((ActionEvent e) -> tabbedPane.setSelectedIndex(nextIndex));
   panel.add(next);
  } else {
   // Final Panel (Que 10) — Optional Submit button
   JButton submit = new JButton("Submit");
   submit.setBounds(200, 170, 100, 30);
   submit.addActionListener((ActionEvent e) -> {
    int score = 0;
    StringBuilder userAnswers = new StringBuilder();

    // Question 1
    if (option3.isSelected()) score++;
    userAnswers.append("Q1: ").append(getSelectedButtonText(optionsGroup1)).append("\n");

    // Question 2
    if (o2.isSelected()) score++;
    userAnswers.append("Q2: ").append(getSelectedButtonText(optionsGroup2)).append("\n");

    // Question 3
    if (q3o2.isSelected()) score++;
    userAnswers.append("Q3: ").append(getSelectedButtonText(group3)).append("\n");

    // Question 4
    if (q4o2.isSelected()) score++;
    userAnswers.append("Q4: ").append(getSelectedButtonText(group4)).append("\n");

    // Question 5
    if (q5o2.isSelected()) score++;
    userAnswers.append("Q5: ").append(getSelectedButtonText(group5)).append("\n");

    // Question 6–10
    String[] correctAnswers = {
    "extends", "false", "java.util", "start()", "Compilation"
    };

    for (int k = 0; k < 5; k++) {
      ButtonGroup currentgroup = buttonGroups[k];
      String selected = getSelectedButtonText(currentgroup);
      userAnswers.append("Q").append(k + 6).append(": ").append(selected).append("\n");
      if (selected != null && selected.equals(correctAnswers[k])) {
        score++;
      }
    }

    System.out.println("------ User Answers ------");
    System.out.println(userAnswers);
    System.out.println("Total Score: " + score + "/10");

    JOptionPane.showMessageDialog(frame, "Your Score: " + score + "/10", "Result", JOptionPane.INFORMATION_MESSAGE);
  });
  
  panel.add(submit);
  }

       // Add to tabbedPane
       tabbedPane.addTab("Que " + (i + 6), panel);
     }


        frame.add(tabbedPane);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    private static String getSelectedButtonText(ButtonGroup group) {
    for (java.util.Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText();
        }
    }
    return null;
   }
  }