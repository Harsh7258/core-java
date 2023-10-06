import java.awt.*;
import javax.swing.*;

public class border {
    JFrame f;
    TextField t;
    border()
    {
         f = new JFrame();
         JButton j1 = new JButton("north");
         JButton j2 = new JButton("south");
         JButton j3 = new JButton("east");
         JButton j4 = new JButton("west");
         t = new TextField("Yhelp!!");

         f.add(j1, BorderLayout.NORTH);
         f.add(j2, BorderLayout.SOUTH);
         f.add(j3, BorderLayout.EAST);
         f.add(j4, BorderLayout.WEST);
         f.add(t, BorderLayout.CENTER);

         f.setSize(300, 300);
         f.setVisible(true);
    }
    public static void main(String[] args) {
        new border();
    }
}
