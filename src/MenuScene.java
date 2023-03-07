import java.awt.Graphics;
import java.awt.Color;

public class MenuScene extends Scene {

    public KeyListener keyListener;

    public MenuScene(KeyListener keyListener) {
        this.keyListener = keyListener;
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
    }
}
