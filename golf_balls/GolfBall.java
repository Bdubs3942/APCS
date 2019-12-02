import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GolfBall extends JPanel {

    String ballColor;

    public void GolfBalls()
    {
        //ballColor = Color.ORANGE;
    }

    public void GolfBalls(String c)
    {
        ballColor = c;
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.ORANGE);
        setSize(300,300);
        g.fillOval(100, 100, 200, 200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Foo");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GolfBall c = new GolfBall();

        frame.add(c);

        frame.setVisible(true);
    }
}