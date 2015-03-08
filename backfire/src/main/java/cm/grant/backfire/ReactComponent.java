package cm.grant.backfire;

/**
 * A React component.
 */
public abstract class ReactComponent {
  protected abstract DOMNode render();

  @Override
  public String toString() {
    DOMNode node = this.render();
    return node.getOuterHTML();
  }
}
