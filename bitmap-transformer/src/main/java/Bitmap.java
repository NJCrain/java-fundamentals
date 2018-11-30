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

        System.out.println("in flipHorizontal");
        for (int i = 0; i < original.getHeight(); i++) {
            for (int j = 0; j < original.getWidth() /2; j++) {
                int temp = original.getRGB(j, i);
                original.setRGB(j, i, original.getRGB(original.getWidth() - j - 1, i));
                original.setRGB(original.getWidth() - j - 1, i, temp);
            }
        }
    }

    public void flipVertical() {

        System.out.println("in vertical");
        for (int i = 0; i < original.getHeight(); i++) {
            for (int j = 0; j < original.getWidth() /2; j++) {
                int temp = original.getRGB(i, j);
                original.setRGB(i, j, original.getRGB(i, original.getHeight() - j - 1));
                original.setRGB(i,original.getWidth() - j - 1, temp);
            }
        }
    }

    public void convertGrayscale() {

        System.out.println("in grayscale");
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

        System.out.println("in darken");
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
