package processing.sketches;

import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet sketch;

    final int TILESIZE = 50;

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {
        //noStroke();
        colorMode(HSB);
    }

    public void draw() {
        background(0);

        int columnCount = width / TILESIZE;

        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount; j++) {

                float hue = (frameCount + (i + j) * 255 / columnCount) % 255;
                float saturation = j* 255/(2*columnCount);

                fill(hue, saturation, 255);
                rect(TILESIZE * i, TILESIZE * j, TILESIZE, TILESIZE);

                fill(0);
                text(i+ "," +j,i * TILESIZE, j * TILESIZE+20);

            }
        }
    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
