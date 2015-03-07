package cm.grant.backfire;

/**
 * A DOM element.
 */
public class $DOM {
  public static class Div extends DOMNode {
    public Div() {
      tagName = "div";
    }
  }
  public static class Img extends ImgNode {
    public Img() {
      tagName = "img";
    }
  }

  public static Div div() {
    return new Div();
  }
  public static Img img() {
    return new Img();
  }
}
