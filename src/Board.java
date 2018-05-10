import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private Image hero, enemy, background;


    Timer timer = new Timer(20, this);

    JFrame frame;

    public Board(JFrame frame) {
        this.frame = frame;
        loadImages();
    }

    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, frame.getWidth(), frame.getHeight(), null);
        g.drawImage(hero, 0, 0, null);

    }


    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private void loadImages() {
        hero = new ImageIcon("batjaLehi.png").getImage();
        background = new ImageIcon("34.jpg").getImage();
    }
}

