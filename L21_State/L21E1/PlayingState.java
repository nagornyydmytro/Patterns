package L21_State.L21E1;

public class PlayingState implements MediaPlayerState {

    @Override
    public void play(MediaPlayer mediaPlayer) {
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public String getName() {
        return "playing";
    }
}