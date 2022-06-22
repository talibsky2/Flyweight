import java.util.HashMap;
import java.util.Map;

public class PixelFactory {
    private static final Map<String, SetPixel> pixels = new HashMap<>();
    public SetPixel getPixel (String pixelName){
        SetPixel pixel = pixels.get(pixelName);
        if (pixel == null){
            switch (pixelName){
                case "R":
                    pixel = new Pixel("Red");
                    break;
                case "G":
                    pixel = new Pixel("Green");
                    break;
                case "B":
                    pixel = new Pixel("Blue");
                    break;
            }
            pixels.put(pixelName, pixel);
        }
        return pixel;
    }
}
