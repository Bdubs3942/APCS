import java.awt.*;

/**
 * MyArtwork
 * Inspired by a lab from Jeff Ondich
 * @author Dave Musicant
 * @version 3.0
 *
 * This class is used to open a canvas window, fill it with a black
 * background, and draw a purple square in the center.
 */

class MyArtwork
{
    public static void main(String[] args)
    {
        int windowWidth = 500;
        int windowHeight = 500;
        int rectangleWidth = 50;
        int rectangleHeight = 50;

        Canvas canvas = new Canvas("Hi there");
        canvas.setSize(windowWidth,windowHeight);
        canvas.setVisible(true);

        // The Color class has class variables to indicate built-in
        // colors: Color.black, Color.blue, Color.cyan,
        // Color.darkGray, Color.gray, Color.green, Color.lightGray,
        // Color.magenta, Color.orange, Color.pink, Color.red,
        // Color.white, Color.yellow.

        // Set the background color of the Canvas accordingly.
        canvas.fillBackground(Color.black);

        // If you want to mix your own colors, create a new Color
        // object. The constuctor takes three parameters which are
        // ints between 0 and 255, representing the amount of red,
        // green, and blue in the color. So (0,0,0) means no color
        // (black), (255,0,255) means a shade of purple, and
        // (127,0.127) is darker purple, etc.

        Color darkPurple = new Color(127,0,127);

        // Set the color of the pen. The parameter object "graphics"
        // encloses all the methods for drawing within the window itself.

        canvas.setInkColor(darkPurple);

        // Draw a square. More specifically, draw a rectamgle with:
        //   a top left corner of x = windowWidth/2, y = windowHeight/2.
        //   width and height as specified

        canvas.drawRectangle(windowWidth/2,windowHeight/2,
                             rectangleWidth,rectangleHeight);
    }
}
