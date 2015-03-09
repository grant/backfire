package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.ReactComponent;
import cm.grant.backfire.StateType;
import cm.grant.backfire.js.FuncMouseEvent;
import cm.grant.backfire.js.FuncVoid;
import cm.grant.backfire.js.MouseEvent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class $TodoApp extends ReactComponent {
  private class State extends StateType {
    public List<String> items = new ArrayList<>();
    public String text;
  }

  protected State getState() {
    return new State();
  }

  protected FuncMouseEvent onChange = (MouseEvent e) -> {
    State state = new State();
    state.text = e.target.value;
    setState(state);
  };

  private FuncVoid handleSubmit = () -> {
    getState().items.add(getState().text);
    State state = new State();
    state.text = "";
    setState(state);
  };

  @Override
  protected DOMNode render() {
    // TodoList
    $TodoList.Props listProps = new $TodoList.Props();
    listProps.items = getState().items;

    // Form
    $DOM.Form.Props formProps = new $DOM.Form.Props();
    formProps.onSubmit = handleSubmit;

    // Input
    $DOM.Input.Props inputProps = new $DOM.Input.Props();
    inputProps.onChange = onChange;
    inputProps.value = getState().text;

    return $DOM.div($DOM.h3().html("TODO"),
        new $TodoList(listProps),
        $DOM.form(formProps).html(
            $DOM.input(inputProps),
            $DOM.button("Add #" + getState().items.size() + 1)
        )
    );
  }
}