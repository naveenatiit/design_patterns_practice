package _18_command._05_solution;

public class TurnOffLightCommand implements LightCommand {

    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOffLight();
    }
}
