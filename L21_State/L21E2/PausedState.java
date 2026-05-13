package L21_State.L21E2;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        System.out.println("Playing " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.nextTrack();
        System.out.println("Paused " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.prevTrack();
        System.out.println("Paused " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StoppedState());
        System.out.println("Stopped");
    }
}