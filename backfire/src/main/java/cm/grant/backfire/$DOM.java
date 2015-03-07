package cm.grant.backfire;

/**
 * A DOM element.
 */
public class $DOM<T> {
  public static class Div extends DOMNode {}
  public static class Img extends ImgNode {}

  public static Div div() {
    return new Div();
  }
  public static Img img() {
    return new Img();
  }
}
