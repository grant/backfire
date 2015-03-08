package cm.grant.backfire;

/**
 * A DOM element.
 */
public class $DOM {
  public static class Ul extends DOMNode {
    public Ul() {
      tagName = "ul";
    }
  }

  public static class Li extends DOMNode {
    public Li() {
      tagName = "li";
    }
  }

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
  public static Li li() {
    return new Li();
  }
  public static Ul ul() {
    return new Ul();
  }
}
