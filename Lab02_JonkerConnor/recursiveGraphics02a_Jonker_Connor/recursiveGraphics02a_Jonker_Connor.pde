void setup(){
  size(500,500);
  background(115, 215, 255);
  //makes the background a sky blue color
  translate(width/2,height/2);
  //starts the sunbeams from the center of the window no matter the size
  sunlight(0,0);
}

void sunlight(float angle, int limit){
  if(limit<=16){
    pushMatrix();
    stroke(253, 243, 198, 9);
    //makes the lines a sunlight color
    line(0,0,500,0);
    rotate(angle);
    sunlight(angle+0.1, limit+1);
    sunlight(angle-0.1, limit+1);
    popMatrix();
   } 
}
