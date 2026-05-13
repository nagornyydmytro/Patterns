package L21_State.L21E3;

public interface FanState {
    void turnUp(Fan fan);
    void turnDown(Fan fan);
    String getName();
}