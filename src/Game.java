import javax.swing.*;

public class Game extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JustGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600,800);
        frame.add(new Board(frame));
        frame.setVisible(true);
    }
}
