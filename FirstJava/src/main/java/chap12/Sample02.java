package chap12;

public class Sample02 {

    public static void main(String[] args) {
        Color inputColor = Color.RED;

        System.out.println(inputColor.equals(Color.RED) ? "Red" : "Not red");
        System.out.println(inputColor.equals(Size.SMALL) ? "Red" : "Not red");
    }

}

// 색 집합
class Color {
    final static Color RED    = new Color();
    final static Color BLUE   = new Color();
    final static Color ORANGE = new Color();
}

// 크기 집합
class Size {
    final static Size SMALL  = new Size();
    final static Size MIDIUM = new Size();
    final static Size LARGE  = new Size();
}
