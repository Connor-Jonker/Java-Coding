int depth = 100;
void setup() {
  size(800, 800);   
  fill(255);
  noFill();
  stroke(255);
}
  
float factor = 1;
void draw() {
  background(0);
  dots(width/2, height - 150, 200);
}                         
void dots(float x, float y, float size) {
  ellipse(x, y, size, size);
  if (size > 15) {
    dots(x + size/factor, y, size/2);
    dots(x - size/factor, y, size/2);
    dots(x, y - size/factor, size/2);
  }
}
