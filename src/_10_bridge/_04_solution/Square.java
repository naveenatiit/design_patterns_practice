package _10_bridge._04_solution;

public class Square implements Shape {

    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("Square");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
