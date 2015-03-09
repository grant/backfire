package cm.grant.backfire;

import cm.grant.backfire.js.Func;

import java.util.List;

/**
 * A single DOM node.
 */
public class DOMNode implements HTML {
  protected String tagName;
  protected String className;
  protected String innerHTML;

  public DOMNode className(String className) {
    return this;
  }
  public DOMNode onClick(Func func) {
    return this;
  }
  public DOMNode html(String ...strings) {
    innerHTML = "";
    for (String string : strings) {
      innerHTML += string;
    }
    return this;
  }
  public DOMNode html(List<? extends HTML> d) {
    return this;
  }
  public DOMNode html(HTML ...d) {
    return this;
  }

  public String getOpenTag() {
    return "<" + tagName + ">";
  }
  public String getCloseTag() {
    return "</" + tagName + ">";
  }
  public String getOuterHTML() {
    return getOpenTag() + getInnerHTML() + getCloseTag();
  }
  public String getInnerHTML() {
    return innerHTML;
  }

  @Override
  public String toString() {
    return getOuterHTML();
  }
}

