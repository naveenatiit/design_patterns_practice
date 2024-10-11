package _24_state_pattern._04_solution;

public class PlayingState implements PlayerState {

    @Override
    public void pressButton(MediaPlayer player) {
        player.pause();
        player.setState(new PausedState());
    }

}
