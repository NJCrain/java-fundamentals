import org.junit.Test;

import javax.imageio.ImageIO;
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
    }

    @Test
    public void testConvertGrayscaleComplex() {
    }

    @Test
    public void testDarkenSimple() {
    }

    @Test
    public void testDarkenComplex() {
    }

}