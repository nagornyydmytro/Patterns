package L21_State.L21E2;

public class StoppedState implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        if (mediaPlayer.getTracks().isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }

        mediaPlayer.setState(new PlayingState());
        System.out.println("Playing " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        mediaPlayer.nextTrack();
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        mediaPlayer.prevTrack();
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
    }
}