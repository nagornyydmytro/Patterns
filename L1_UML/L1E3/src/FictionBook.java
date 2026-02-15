package L1_UML.L1E3.src;
public class FictionBook extends Book {

  boolean isAPlay;

  public FictionBook(String name, boolean isAPlay) {
    super(name, false);
    this.isAPlay = isAPlay;
  }


}