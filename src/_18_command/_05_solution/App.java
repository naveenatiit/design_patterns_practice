package _18_command._05_solution;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        var lightCommandExecutor = new LightCommandExecutor();
        lightCommandExecutor.execute(new TurnOnLightCommand(light));
        light.isOn();
        lightCommandExecutor.execute(new TurnOffLightCommand(light));
        light.isOn();
    }

}
