package chapter02.task11;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        newHue++;
        System.out.println(newHue);
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow obj = new AllTheColorsOfTheRainbow();
        obj.changeTheHueOfTheColor(obj.anIntegerRepresentingColors);
    }
}