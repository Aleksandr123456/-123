import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero {
    private int x;
    private int y;
    private int r;

    public Hero() {
        x = GamePanel.WIDTH / 2;
        y = GamePanel.HEIGHT / 2;
        r = 5;
    }

    public int getx() { return x; }
    public int gety() { return y; }
    public int getr() { return r; }

    public void update(){

    }
    public void draw(Graphics2D g) throws IOException {
        Image img = new ImageIcon("C:\\Users\\Aleksandr\\Desktop\\SUPERIGRA\\2.png").getImage();
        g.drawImage(img,0,0,Color.RED,null);
    }
}