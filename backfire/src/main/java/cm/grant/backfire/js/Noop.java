package cm.grant.backfire.js;

import cm.grant.backfire.DOMNode;

/**
 * Does nothing.
 */
public class Noop implements Func {

  @Override
  public DOMNode get() {
    return null;
  }
}
