void setup(){

size(800,800);
}

void draw(){
fill(#080808);
if(mousePressed){
  fill(#3A9B27);
}
ellipse(100,100,200,200);
}

void keyPressed(){
  if(key==CODED){
    if(keyCode==ENTER){
fill(#6C3A0B);
    }
  }
}
