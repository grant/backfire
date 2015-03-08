package cm.grant.examples;

import cm.grant.backfire.$DOM;
import cm.grant.backfire.DOMNode;
import cm.grant.backfire.ReactComponent;
import cm.grant.backfire.StateType;
import cm.grant.backfire.js.FuncVoid;
import cm.grant.backfire.js.Interval;

import static cm.grant.backfire.js.Interval.clearInterval;
import static cm.grant.backfire.js.Interval.setInterval;

/**
 *
 */
public class $Timer extends ReactComponent {
  private class State extends StateType {
    public int secondsElapsed = 0;
  }
  protected State getState() {
    return new State();
  }

  private Interval interval;

  FuncVoid tick = () -> {
    State newState = new State();
    newState.secondsElapsed = getState().secondsElapsed + 1;
    setState(newState);
  };

  @Override
  protected void componentDidMount() {
    interval = setInterval(tick, 1000);
  }

  @Override
  protected void componentWillUnmount() {
    clearInterval(interval);
  }

  @Override
  protected DOMNode render() {
    return $DOM.div().html("Seconds Elapsed: " + getState().secondsElapsed);
  }
}
