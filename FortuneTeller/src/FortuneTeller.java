// Fortune Teller

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class FortuneTeller extends JFrame
    implements ActionListener
{
    private static final EasySound ding = new EasySound("C:\\Users\\rohan\\IdeaProjects\\FortuneTeller\\src\\ding.wav");

  String[] fortunes = {"You will experience absolute happiness.", "What is you happiness right now, will be your downfall.",
          "How many times are you going to believe the fortune teller?", "Riches will be bestowed upon you."};

  private JTextField display;
  
  public FortuneTeller()
  {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);


    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }
  
  public void actionPerformed(ActionEvent e)
  {
      ding.play();

      Random rand = new Random();
      int randNum;
      randNum = rand.nextInt(fortunes.length);
      display.setText("  " + fortunes[randNum] );

  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(500, 400, 500, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(true);
    window.setVisible(true);

  }
}
