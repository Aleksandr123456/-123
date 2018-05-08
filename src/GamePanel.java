import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GamePanel extends JPanel implements Runnable {
    public static int WIDTH = 600;
    public static int HEIGHT = 400;

    private Thread thread;
    public boolean running;

    private BufferedImage image;
    private Graphics2D g;

    public static Hero player;

    public void addNotify() {
        super.addNotify();
        if(thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
    }

    public void run() {
        running = true;

        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) image.getGraphics();

        player = new Hero();

        while(running){
            gameUpdate();
            try {
                gameRender();
            } catch (IOException e) {
                e.printStackTrace();
            }
            gameDraw();
        }
    }

    private  void gameUpdate(){

    }

    private void gameRender() throws IOException {

        player.draw(g);
    }

    private void gameDraw() {
        Graphics g2 = this.getGraphics();
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
    }

}
