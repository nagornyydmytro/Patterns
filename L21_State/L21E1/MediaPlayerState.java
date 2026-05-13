package L21_State.L21E1;

public interface MediaPlayerState {
    void play(MediaPlayer mediaPlayer);
    void pause(MediaPlayer mediaPlayer);
    String getName();
}