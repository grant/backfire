package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.PropTypes;
import cm.grant.backfire.ReactComponent;

/**
 *
 */
public class $HelloMessage extends ReactComponent {
  final Props props;
  public static class Props extends PropTypes {
    public String name;
  }

  public $HelloMessage() {
    props = new Props();
  }

  public $HelloMessage(Props props) {
    this.props = props;
  }

  @Override
  protected DOMNode render() {
    return $DOM.div().html("Hello " + props.name);
  }
}

