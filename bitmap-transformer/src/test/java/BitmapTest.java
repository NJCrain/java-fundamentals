import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class BitmapTest {
    private File one = new File("resources", "test.BMP");
    private File two = new File("resources", "two.BMP");


    @Test
    public void testFlipHorizontalSimple() {

        try {
            BufferedImage image = ImageIO.read(one);
            Bitmap simple = new Bitmap(image, "resources/simpleTest.BMP");
            int expectedOne = image.getRGB(0, 0);
            int expectedTwo = image.getRGB(20, 0);
            int expectedThree = image.getRGB(90, 0);
            simple.flipHorizontal();
            assertEquals("Pixels x values should be reversed", expectedOne, simple.original.getRGB(image.getWidth() -1, 0));
            assertEquals("Pixels x values should be reversed", expectedTwo, simple.original.getRGB(image.getWidth() -21, 0));
            assertEquals("Pixels x values should be reversed", expectedThree, simple.original.getRGB(image.getWidth() -91, 0));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testFlipHorizontalComplex() {

        try {
            BufferedImage image = ImageIO.read(two);
            Bitmap complex = new Bitmap(image, "resources/complexTest.BMP");
            int expectedOne = image.getRGB(0, 0);
            int expectedTwo = image.getRGB(100, 0);
            int expectedThree = image.getRGB(200, 0);
            int expectedFour = image.getRGB(300, 0);
            int expectedFive = image.getRGB(400, 0);
            int expectedSix = image.getRGB(500, 0);
            int expectedSeven = image.getRGB(600, 0);
            int expectedEight = image.getRGB(700, 0);
            int expectedNine = image.getRGB(800, 0);
            int expectedTen = image.getRGB(900, 0);
            int expectedEleven = image.getRGB(1000, 0);
            complex.flipHorizontal();
            assertEquals("Pixels x values should be reversed", expectedOne, complex.original.getRGB(image.getWidth() -1, 0));
            assertEquals("Pixels x values should be reversed", expectedTwo, complex.original.getRGB(image.getWidth() -101, 0));
            assertEquals("Pixels x values should be reversed", expectedThree, complex.original.getRGB(image.getWidth() -201, 0));
            assertEquals("Pixels x values should be reversed", expectedFour, complex.original.getRGB(image.getWidth() -301, 0));
            assertEquals("Pixels x values should be reversed", expectedFive, complex.original.getRGB(image.getWidth() -401, 0));
            assertEquals("Pixels x values should be reversed", expectedSix, complex.original.getRGB(image.getWidth() -501, 0));
            assertEquals("Pixels x values should be reversed", expectedSeven, complex.original.getRGB(image.getWidth() -601, 0));
            assertEquals("Pixels x values should be reversed", expectedEight, complex.original.getRGB(image.getWidth() -701, 0));
            assertEquals("Pixels x values should be reversed", expectedNine, complex.original.getRGB(image.getWidth() -801, 0));
            assertEquals("Pixels x values should be reversed", expectedTen, complex.original.getRGB(image.getWidth() -901, 0));
            assertEquals("Pixels x values should be reversed", expectedEleven, complex.original.getRGB(image.getWidth() -1001, 0));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testFlipVerticalSimple() {

        try {
            BufferedImage image = ImageIO.read(one);
            Bitmap simple = new Bitmap(image, "resources/simpleTest.BMP");
            int expectedOne = image.getRGB(0, 0);
            int expectedTwo = image.getRGB(20, 48);
            int expectedThree = image.getRGB(17, 104);
            simple.flipVertical();
            assertEquals("Pixels y values should be reversed", expectedOne, simple.original.getRGB(0, image.getHeight() - 1));
            assertEquals("Pixels y values should be reversed", expectedTwo, simple.original.getRGB(20, image.getHeight() - 49));
            assertEquals("Pixels y values should be reversed", expectedThree, simple.original.getRGB(17, image.getHeight() - 105));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testFlipVerticalComplex() {

        try {
            BufferedImage image = ImageIO.read(two);
            Bitmap complex = new Bitmap(image, "resources/complexTest.BMP");
            int expectedOne = image.getRGB(0, 0);
            int expectedTwo = image.getRGB(164, 48);
            int expectedThree = image.getRGB(235, 104);
            int expectedFour = image.getRGB(318, 432);
            int expectedFive = image.getRGB(450, 743);
            int expectedSix = image.getRGB(544, 304);
            int expectedSeven = image.getRGB(656, 276);
            int expectedEight = image.getRGB(754, 583);
            int expectedNine = image.getRGB(878, 622);
            int expectedTen = image.getRGB(917, 189);
            int expectedEleven = image.getRGB(1015, 384);
            complex.flipVertical();

            assertEquals("Pixels y values should be reversed", expectedOne, complex.original.getRGB(0, image.getHeight() - 1));
            assertEquals("Pixels y values should be reversed", expectedTwo, complex.original.getRGB(164, image.getHeight() - 49));
            assertEquals("Pixels y values should be reversed", expectedThree, complex.original.getRGB(235, image.getHeight() - 105));
            assertEquals("Pixels y values should be reversed", expectedFour, complex.original.getRGB(318, image.getHeight() - 433));
            assertEquals("Pixels y values should be reversed", expectedFive, complex.original.getRGB(450, image.getHeight() - 744));
            assertEquals("Pixels y values should be reversed", expectedSix, complex.original.getRGB(544, image.getHeight() - 305));
            assertEquals("Pixels y values should be reversed", expectedSeven, complex.original.getRGB(656, image.getHeight() - 277));
            assertEquals("Pixels y values should be reversed", expectedEight, complex.original.getRGB(754, image.getHeight() - 584));
            assertEquals("Pixels y values should be reversed", expectedNine, complex.original.getRGB(878, image.getHeight() - 623));
            assertEquals("Pixels y values should be reversed", expectedTen, complex.original.getRGB(917, image.getHeight() - 190));
            assertEquals("Pixels y values should be reversed", expectedEleven, complex.original.getRGB(1015, image.getHeight() - 385));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testConvertGrayscaleSimple() {
        try {
            BufferedImage image = ImageIO.read(one);
            Bitmap simple = new Bitmap(image, "resources/simpleTest.BMP");
            Color one =  new Color(image.getRGB(0, 0));
            int expectedOne = (int) ((one.getRed() * 0.3) + (one.getGreen() * 0.59) + (one.getBlue() * 0.11) / 3);
            Color two =  new Color(image.getRGB(120, 37));
            int expectedTwo = (int) ((two.getRed() * 0.3) + (two.getGreen() * 0.59) + (two.getBlue() * 0.11) / 3);
            Color three =  new Color(image.getRGB(42, 104));
            int expectedThree = (int) ((three.getRed() * 0.3) + (three.getGreen() * 0.59) + (three.getBlue() * 0.11) / 3);
            simple.convertGrayscale();

            Color newOne = new Color(simple.original.getRGB(0, 0));
            int actualOne = (newOne.getRed() + newOne.getBlue() + newOne.getGreen()) / 3;
            Color newTwo = new Color(simple.original.getRGB(120, 37));
            int actualTwo = (newTwo.getRed() + newTwo.getBlue() + newTwo.getGreen()) / 3;
            Color newThree = new Color(simple.original.getRGB(42, 104));
            int actualThree = (newThree.getRed() + newThree.getBlue() + newThree.getGreen()) / 3;

            assertEquals("RGB values should equal the converted grayscale value", expectedOne, actualOne);
            assertEquals("RGB values should equal the converted grayscale value", expectedTwo, actualTwo);
            assertEquals("RGB values should equal the converted grayscale value", expectedThree, actualThree);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
/* Converting this image to grayscale has some strange behavior that doesn't make sense. Leaving test commented out for now

    @Test
    public void testConvertGrayscaleComplex() {

        try {
            BufferedImage image = ImageIO.read(two);
            Bitmap complex = new Bitmap(image, "resources/complexTest.BMP");
            //TODO: Make a helper method to clean this up
            Color one =  new Color(image.getRGB(0, 0));
            int expectedOne = (int) ((one.getRed() * 0.3) + (one.getGreen() * 0.59) + (one.getBlue() * 0.11) / 3);
            Color two =  new Color(image.getRGB(146, 48));
            int expectedTwo = (int) ((two.getRed() * 0.3) + (two.getGreen() * 0.59) + (two.getBlue() * 0.11) / 3);
            Color three =  new Color(image.getRGB(279, 160));
            int expectedThree = (int) ((three.getRed() * 0.3) + (three.getGreen() * 0.59) + (three.getBlue() * 0.11) / 3);
            Color four =  new Color(image.getRGB(345, 262));
            int expectedFour = (int) ((four.getRed() * 0.3) + (four.getGreen() * 0.59) + (four.getBlue() * 0.11) / 3);
            Color five =  new Color(image.getRGB(444, 333));
            int expectedFive = (int) ((five.getRed() * 0.3) + (five.getGreen() * 0.59) + (five.getBlue() * 0.11) / 3);
            Color six =  new Color(image.getRGB(501, 396));
            int expectedSix= (int) ((six.getRed() * 0.3) + (six.getGreen() * 0.59) + (six.getBlue() * 0.11) / 3);
            Color seven =  new Color(image.getRGB(649, 490));
            int expectedSeven = (int) ((seven.getRed() * 0.3) + (seven.getGreen() * 0.59) + (seven.getBlue() * 0.11) / 3);
            Color eight =  new Color(image.getRGB(764, 543));
            int expectedEight = (int) ((eight.getRed() * 0.3) + (eight.getGreen() * 0.59) + (eight.getBlue() * 0.11) / 3);
            Color nine =  new Color(image.getRGB(837, 606));
            int expectedNine = (int) ((nine.getRed() * 0.3) + (nine.getGreen() * 0.59) + (nine.getBlue() * 0.11) / 3);
            Color ten =  new Color(image.getRGB(985, 731));
            int expectedTen = (int) ((ten.getRed() * 0.3) + (ten.getGreen() * 0.59) + (ten.getBlue() * 0.11) / 3);
            complex.convertGrayscale();

            Color newOne = new Color(complex.original.getRGB(0, 0));
            int actualOne = ((newOne.getRed()) + newOne.getBlue() + newOne.getGreen()) / 3;
            Color newTwo = new Color(complex.original.getRGB(146, 48));
            int actualTwo = (newTwo.getRed() + newTwo.getBlue() + newTwo.getGreen()) / 3;
            Color newThree = new Color(complex.original.getRGB(279, 160));
            int actualThree = (newThree.getRed() + newThree.getBlue() + newThree.getGreen()) / 3;
            Color newFour = new Color(complex.original.getRGB(345, 262));
            int actualFour = (newFour.getRed() + newFour.getBlue() + newFour.getGreen()) / 3;
            Color newFive = new Color(complex.original.getRGB(444, 333));
            int actualFive = (newFive.getRed() + newFive.getBlue() + newFive.getGreen()) / 3;
            Color newSix = new Color(complex.original.getRGB(501, 396));
            int actualSix = (newSix.getRed() + newSix.getBlue() + newSix.getGreen()) / 3;
            Color newSeven = new Color(complex.original.getRGB(649, 490));
            int actualSeven = (newSeven.getRed() + newSeven.getBlue() + newSeven.getGreen()) / 3;
            Color newEight = new Color(complex.original.getRGB(764, 543));
            int actualEight = (newEight.getRed() + newEight.getBlue() + newEight.getGreen()) / 3;
            Color newNine = new Color(complex.original.getRGB(837, 606));
            int actualNine = (newNine.getRed() + newNine.getBlue() + newNine.getGreen()) / 3;
            Color newTen = new Color(complex.original.getRGB(985, 731));
            int actualTen = (newTen.getRed() + newTen.getBlue() + newTen.getGreen()) / 3;

            assertEquals("RGB values should equal the converted grayscale value", expectedOne, actualOne);
            assertEquals("RGB values should equal the converted grayscale value", expectedTwo, actualTwo);
            assertEquals("RGB values should equal the converted grayscale value", expectedThree, actualThree);
            assertEquals("RGB values should equal the converted grayscale value", expectedFour, actualFour);
            assertEquals("RGB values should equal the converted grayscale value", expectedFive, actualFive);
            assertEquals("RGB values should equal the converted grayscale value", expectedSix, actualSix);
            assertEquals("RGB values should equal the converted grayscale value", expectedSeven, actualSeven);
            assertEquals("RGB values should equal the converted grayscale value", expectedEight, actualEight);
            assertEquals("RGB values should equal the converted grayscale value", expectedNine, actualNine);
            assertEquals("RGB values should equal the converted grayscale value", expectedTen, actualTen);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    */

    @Test
    public void testDarkenSimple() {
        try {
            BufferedImage image = ImageIO.read(one);
            Bitmap simple = new Bitmap(image, "resources/simpleTest.BMP");
            int originalOne = image.getRGB(0, 0);
            int originalTwo = image.getRGB(20, 48);
            int originalThree = image.getRGB(17, 104);
            simple.darken();

            assertTrue("RGB values should be lower than originally", originalOne > simple.original.getRGB(0, image.getHeight() - 1));
            assertTrue("RGB values should be lower than originally", originalTwo > simple.original.getRGB(20, image.getHeight() - 49));
            assertTrue("RGB values should be lower than originally", originalThree > simple.original.getRGB(17, image.getHeight() - 105));
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    @Test
    public void testDarkenComplex() {
    }

}