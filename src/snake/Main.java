
package snake;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Gameplay gameplay = new Gameplay();
        
        frame.setBounds(10 , 10 , 500 , 500);
        frame.setBackground(Color.blue);
        frame.setTitle("Snake Game");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
    
}
