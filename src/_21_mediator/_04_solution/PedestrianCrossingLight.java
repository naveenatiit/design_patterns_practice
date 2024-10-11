package _21_mediator._04_solution;

public class PedestrianCrossingLight {

    public enum Color {
        RED, GREEN
    }

    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
        System.out.println("Pedestrian crossing light is red");
    }

    public void changeToGreen() {
        color = Color.GREEN;
        System.out.println("Pedestrian crossing light is green");
    }

}
