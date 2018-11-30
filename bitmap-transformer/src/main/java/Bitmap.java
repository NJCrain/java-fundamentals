import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Bitmap {

    public Color[][] pixels;
    public BufferedImage original;
    public String newName;

    public Bitmap (BufferedImage image, String outputName) {
        this.original = image;
        this.newName = outputName;
        this.pixels = new Color[image.getHeight()][image.getWidth()];
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                this.pixels[i][j] = new Color(image.getRGB(j, i));
            }
        }
    }

    public void flipHorizontal() {
        for (int i = 0; i < pixels.length/2; i++) {
            Color[] temp = this.pixels[i];

            this.pixels[i] = this.pixels[this.pixels.length - 1 - i];
            this.pixels[this.pixels.length - 1 - i] = temp;
        }
        updateTransform();
    }

    public void flipVertical() {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length / 2; j++) {
                Color temp = this.pixels[i][j];

                this.pixels[i][j] = this.pixels[i][this.pixels[i].length - 1 - j];
                this.pixels[i][this.pixels[i].length - 1 - j] = temp;
            }
        }
        updateTransform();
    }

    public void convertGrayscale() {
        for (int i = 0; i < this.pixels.length; i ++) {
            for (int j = 0; j < this.pixels[i].length; j++) {
                Color current = this.pixels[i][j];
                int conversion = (int) ( (current.getRed() * 0.3) + (current.getGreen() * 0.59) + (current.getBlue() * 0.11) / 3);
                this.pixels[i][j] =  new Color(conversion, conversion, conversion);
            }
        }
        updateTransform();
    }

    public void darken() {
        for (int i = 0; i < this.pixels.length; i ++) {
            for (int j = 0; j < this.pixels[i].length; j++) {
                this.pixels[i][j] =  new Color(this.pixels[i][j].darker().getRGB());
            }
        }
        updateTransform();
    }

    public void updateTransform() {
        for (int i = 0; i < this.pixels.length; i ++) {
            for (int j = 0; j < this.pixels[i].length; j++) {
                this.original.setRGB(j, i, this.pixels[i][j].getRGB());
            }
        }
    }

    public void save() {
        File output = new File(this.newName);
        try {
            ImageIO.write(original, "BMP", output);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }



    public void printColors(int y) {

            System.out.println(Arrays.toString(this.pixels[y]));

    }
}
