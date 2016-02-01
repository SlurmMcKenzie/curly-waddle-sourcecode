PFont f;

void setup() {
  size(displayWidth,displayHeight);
  frameRate(30);
  f = createFont("Arial",20,true);
}

void draw() {
  background(255);
  pushMatrix();
  translate(mouseX,mouseY,10);
  String string = "X-Achse:" + mouseX + " Y-Achse:" + mouseY;
  color c1 = color(180);
  fill(c1);
  stroke(128);
  box(400);
  popMatrix();
  textFont(f,56);
  fill(0);
  text(string,100,100);
}