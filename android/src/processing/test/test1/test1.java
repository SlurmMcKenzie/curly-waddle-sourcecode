package processing.test.test1;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class test1 extends PApplet {
  public void setup() {

background(0);
noStroke();

fill(204);
triangle(18, 18, 18, 360, 81, 360);

fill(102);
rect(81, 81, 63, 63);

fill(204);
quad(189, 18, 216, 18, 216, 360, 144, 360);

fill(255);
ellipse(252, 144, 72, 72);

fill(204);
triangle(288, 18, 351, 360, 288, 360); 

fill(255);
arc(479, 300, 280, 280, PI, TWO_PI);
    noLoop();
  }

  public void settings() { size(640, 360); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "test1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
