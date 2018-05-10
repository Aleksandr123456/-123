import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    public Game() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("MEGA IGRA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 375);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Game ex = new Game();
            ex.setVisible(true);
        });
    }
}