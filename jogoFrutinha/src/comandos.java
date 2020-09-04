import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class comandos {

    public static void top(JButton button) {
        if (button.getY() > 0) {
            button.setBounds(button.getX(), button.getY() - 10, button.getWidth(), button.getHeight());
        }
    }

    public static void down(JButton button, int height) {
        if (button.getY() < height - 70) {
            button.setBounds(button.getX(), button.getY() + 10, button.getWidth(), button.getHeight());
        }
    }

    public static boolean left(JButton button) {
        if (button.getX() > 0) {
            button.setBounds(button.getX() - 10, button.getY(), button.getWidth(), button.getHeight());
        }
        return false;
    }

    public static boolean right(JButton button, int width) {
        if (button.getX() < width - 70) {
            button.setBounds(button.getX() + 10, button.getY(), button.getWidth(), button.getHeight());
        }
        return false;
    }

    public static boolean done(JButton origem, JButton destino) {
        return origem.getBounds().intersects(destino.getBounds());
    }

    public static void random(JButton button, JFrame frame) {
        Random random = new Random();
        button.setBounds(random.nextInt(frame.getWidth() - 80),
                random.nextInt(frame.getHeight() - 80),
                button.getWidth(), button.getHeight());
    }
}
