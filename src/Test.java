import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
       PixelFactory pixelFactory = new PixelFactory();

        List<SetPixel> pixels = new ArrayList<>();

        pixels.add(pixelFactory.getPixel("B"));
        pixels.add(pixelFactory.getPixel("R"));
        pixels.add(pixelFactory.getPixel("G"));
        pixels.add(pixelFactory.getPixel("R"));
        pixels.add(pixelFactory.getPixel("G"));
        pixels.add(pixelFactory.getPixel("B"));
        Random random = new Random();
        for (SetPixel pixel : pixels){
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            pixel.setPixel(x,y);
        }
    }
}