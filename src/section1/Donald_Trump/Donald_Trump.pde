PImage mustache;
PImage madbomber;
void setup(){
madbomber = loadImage("madbomber.jpeg");
size(800, 600);
madbomber.resize(width,height);
                mustache = loadImage("shaved.png");

}
void draw (){
background(madbomber);
image(mustache, -100,170);


}
