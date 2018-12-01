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
    }

    @Test
    public void testFlipVerticalComplex() {
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
    public void testSave() {
    }
}