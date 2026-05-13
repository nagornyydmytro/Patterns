package L21_State.L21E1;

public class PausedState implements MediaPlayerState {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
    }

    @Override
    public String getName() {
        return "paused";
    }
}