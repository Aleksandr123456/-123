import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel{

    private Image backGround;
    private Image hero;


    public Board() {
        loadImages();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;;
        g2d.drawImage(backGround, 0, 0, this);
        g2d.drawImage(hero, 20,20, this);
        Toolkit.getDefaultToolkit().sync();
        g2d.dispose();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void loadImages() {
        backGround = new ImageIcon("34.jpg").getImage();
        hero = new ImageIcon("batjaLehi.png").getImage();
    }
}
