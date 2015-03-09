package cm.grant.backfire;

import cm.grant.backfire.js.GlobalEventProps;

/**
 * A DOM element.
 */
public class $DOM {
  public static class Button extends DOMNode {
    public Button() {
      tagName = "button";
    }

    public Button(String s) {
      innerHTML = s;
    }
  }

  public static class Input extends DOMNode {
    public static final String TAG_NAME = "input";
    private final Props props;

    public Input() {
      tagName = TAG_NAME;
      this.props = null;
    }

    public Input(Props props) {
      tagName = TAG_NAME;
      this.props = props;
    }

    public static class Props extends GlobalEventProps {
      public String value;
    }
  }

  public static class Form extends DOMNode {
    public static final String TAG_NAME = "form";
    private final Props props;

    public Form() {
      tagName = TAG_NAME;
      this.props = null;
    }

    public Form(Props props) {
      tagName = TAG_NAME;
      this.props = props;
    }

    public static class Props extends GlobalEventProps {
    }
  }

  public static class H3 extends DOMNode {
    public H3() {
      tagName = "h3";
    }
  }

  public static class Ul extends DOMNode {
    public Ul() {
      tagName = "ul";
    }
  }

  public static class Li extends DOMNode {
    public Li() {
      tagName = "li";
    }
  }

  public static class Div extends DOMNode {
    public Div() {
      tagName = "div";
    }
  }

  public static class Img extends ImgNode {
    public Img() {
      tagName = "img";
    }
  }

  public static Div div() {
    return new Div();
  }

  public static Div div(HTML... d) {
    return new Div();
  }

  public static Img img() {
    return new Img();
  }

  public static Li li() {
    return new Li();
  }

  public static Ul ul() {
    return new Ul();
  }

  public static H3 h3() {
    return new H3();
  }

  public static Form form() {
    return new Form();
  }

  public static Form form(Form.Props props) {
    return new Form(props);
  }

  public static Input input() {
    return new Input();
  }

  public static Input input(Input.Props props) {
    return new Input(props);
  }

  public static Button button() {
    return new Button();
  }

  public static Button button(String s) {
    return new Button(s);
  }
}
