import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    public BufferedImage original;
    public String newName;

    //Creates an instance object with where to save it and a reference for the image data
    public Bitmap (BufferedImage image, String outputName) {
        this.original = image;
        this.newName = outputName;
    }

    //Reverses all pixels horizontally (along the x axis)
    public void flipHorizontal() {

        for (int i = 0; i < original.getHeight(); i++) {
            for (int j = 0; j < original.getWidth() /2; j++) {
                int temp = original.getRGB(j, i);
                original.setRGB(j, i, original.getRGB(original.getWidth() - j - 1, i));
                original.setRGB(original.getWidth() - j - 1, i, temp);
            }
        }
        save();
    }

    //Reverses all pixels vertically (along the y axis)
    public void flipVertical() {

        for (int i = 0; i < original.getWidth(); i++) {
            for (int j = 0; j < original.getHeight() /2; j++) {
                int temp = original.getRGB(i, j);
                original.setRGB(i, j, original.getRGB(i, original.getHeight() - j - 1));
                original.setRGB(i,original.getHeight() - j - 1, temp);
            }
        }
        save();
    }

    //Gets the red green and blue values of each pixel and converts them to create a gray scale image with proper gradients
    public void convertGrayscale() {

        for (int i = 0; i < original.getHeight(); i ++) {
            for (int j = 0; j < original.getWidth(); j++) {
                Color current = new Color(original.getRGB(j, i));
                int conversion = (int) ((current.getRed() * 0.3) + (current.getGreen() * 0.59) + (current.getBlue() * 0.11) / 3);
                int converted = new Color(conversion, conversion, conversion).getRGB();
//                System.out.println("Conversion value: " + converted);
                original.setRGB(j, i, converted);
//                System.out.println("Reconverted value: " + original.getRGB(j, i));
            }
        }
        save();
    }

    //Makes the color of each pixel darker, creating a darker image
    public void darken() {

        for (int i = 0; i < original.getHeight(); i ++) {
            for (int j = 0; j < original.getWidth(); j++) {
                original.setRGB(j, i, (new Color(original.getRGB(j, i))).darker().getRGB());
            }
        }
        save();
    }

    //Saves the transformed image to the desired output location
    public void save() {
        File output = new File(this.newName);
        try {
            ImageIO.write(original, "BMP", output);
        }
        //This doesn't seem to work as I hoped. Running with an invalid output argument causes the program to exit and never prints out this error...
        catch (IOException e) {
            System.out.println(e + " Could not save the file to the entered location. Please make sure it is a valid path that you have permission to write to");
        }
    }

}
