package _15_proxy._06_solution;

public class MediaPlayerProxy implements MediaPlayer {

    private MovieMediaPlayer movieMediaPlayer;

    @Override
    public void playMedia() {
        if (movieMediaPlayer == null) {
            movieMediaPlayer = new MovieMediaPlayer();
        }
        movieMediaPlayer.playMedia();
    }
}
