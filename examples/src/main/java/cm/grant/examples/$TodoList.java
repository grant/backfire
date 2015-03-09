package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.PropTypes;
import cm.grant.backfire.ReactComponent;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class $TodoList extends ReactComponent {
  final Props props;
  public static class Props extends PropTypes {
    public List<String> items;
  }

  public $TodoList(Props props) {
    this.props = props;
  }

  private DOMNode createItem(String itemText) {
    return $DOM.li().html(itemText);
  }

  @Override
  protected DOMNode render() {
    List<DOMNode> lis = props.items.stream().map(p -> createItem(p)).collect(Collectors.toList());
    return $DOM.ul().html(lis);
  }
}