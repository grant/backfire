package cm.grant.backfire;

/**
 *
 */
public class ImgNode extends DOMNode {
  private String src;

  public DOMNode src(String src) {
    this.src = src;
    return this;
  }

  @Override
  public String getTagName() {
    return "img";
  }
}
