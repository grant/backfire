package cm.grant.backfire;

import cm.grant.backfire.js.Func;

import java.util.List;

/**
 * A single DOM node.
 */
public class DOMNode {
  public DOMNode className(String className) {
    return this;
  }
  public DOMNode onClick(Func func) {
    return this;
  }
  public DOMNode html(String ...s) {
    return this;
  }
  public DOMNode html(DOMNode ...d) {
    return this;
  }
  public DOMNode html(ReactComponent ...d) {
    return this;
  }
  public DOMNode html(List<ReactComponent> ...d) {
    return this;
  }
}

