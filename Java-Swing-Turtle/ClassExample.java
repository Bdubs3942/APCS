import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class ClassExample {
  public static void main(String[] args) {

    World world = new World();
    Turtle blue = new Turtle(world);
    Turtle red = new Turtle(world);
    Turtle orange = new Turtle(world);
    Turtle purple = new Turtle(world);
    
    blue.forward();
    red.turnRight();
    red.forward();











    //World w = new World();
    // Turtle raphael = new Turtle(w);
    world.show(true);
  }
}
