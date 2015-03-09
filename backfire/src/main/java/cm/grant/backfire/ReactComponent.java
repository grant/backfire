package cm.grant.backfire;

/**
 * A React component.
 */
public abstract class ReactComponent implements HTML {
  private StateType state;
  protected abstract DOMNode render();

  protected void componentDidMount() {

  }
  protected void componentWillUnmount() {

  }

  protected StateType getState() {
    if (state == null) {
      return new StateType();
    } else {
      return state;
    }
  }
  protected void setState(StateType st) {
    state = st;
  }

  @Override
  public String getTagName() {
    return this.getClass().getSimpleName();
  }

  @Override
  public String toString() {
    DOMNode node = this.render();
    return node.getOuterHTML();
  }
}
