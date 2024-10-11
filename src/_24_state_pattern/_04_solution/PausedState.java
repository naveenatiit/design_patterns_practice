package _24_state_pattern._04_solution;

public class PausedState implements PlayerState {

    @Override
    public void pressButton(MediaPlayer player) {
        player.play();
        player.setState(new PlayingState());
    }

}
