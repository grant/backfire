## :boom: backfire :boom:

WIP/Experiment: A type version of React, implemented in Java.

> One of the greatest annoyances with Javascript/React is not being able to get
> **syntax errors** from a compiler and **autocompletion** from an IDE.
>
> With `backfire`, I tried to solve that from scratch.
>
> What's currently implemented is just half the battle, (getting compilable java code with React-like syntax)
> The next half of the battle would be transpiling the Java source code to Javascript source code.

### Examples

From the [React Home Page](http://facebook.github.io/react/).

#### A Simple Component

###### Java

```java
public class $HelloMessage extends ReactComponent {
  final Props props;
  public static class Props extends PropTypes {
    public String name = "";
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
```

###### JSX

```jsx
var HelloMessage = React.createClass({
  render: function() {
    return <div>Hello {this.props.name}</div>;
  }
});
```

#### A Stateful Component

###### Java

```java
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
```

###### JSX

```jsx
var Timer = React.createClass({
  getInitialState: function() {
    return {secondsElapsed: 0};
  },

  tick: function() {
    this.setState({secondsElapsed: this.state.secondsElapsed + 1});
  },

  componentDidMount: function() {
    this.interval = setInterval(this.tick, 1000);
  },

  componentWillUnmount: function() {
    clearInterval(this.interval);
  },

  render: function() {
    return (
      <div>Seconds Elapsed: {this.state.secondsElapsed}</div>
    );
  }
});
```

#### Tests

Try out the `src/test` to see how this works.
