public class Pixel implements SetPixel {
    String color;

    public Pixel(String color) {
        this.color = color;
    }

    @Override
    public void setPixel(int x, int y) {
        System.out.println("Setting pixel: " + color + " " + "(" + x + ";" + y + ")");
    }
}
