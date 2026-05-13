package L21_State.L21E3;

public class Fan {

  private FanState state = new LowState();

  public void setState(FanState state) {
    this.state = state;
  }

  public String getState() {
    return state.getName();
  }

  public void turnUp() {
    state.turnUp(this);
  }

  public void turnDown() {
    state.turnDown(this);
  }

}