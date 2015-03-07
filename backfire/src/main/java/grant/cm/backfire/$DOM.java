package grant.cm.backfire;

/**
 * A DOM element.
 */
public class $DOM<T> {
  public static class divImpl {
    public int i = 0;
    public divImpl() {
      System.out.println(i);
    }
  }

  public static divImpl div() {
    return new divImpl();
  }
}
