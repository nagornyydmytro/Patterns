package L21_State.L21E1;

public class MediaPlayer {

    private MediaPlayerState state = new PausedState();
    private String icon = "play button";

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public String getState() {
        return state.getName();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}