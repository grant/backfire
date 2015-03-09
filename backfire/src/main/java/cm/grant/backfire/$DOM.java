package cm.grant.backfire;

import cm.grant.backfire.js.GlobalEventProps;

/**
 * A DOM element.
 */
public class $DOM {
  public static class Button extends DOMNode {
    public Button() {

    }

    public Button(String s) {
      innerHTML = s;
    }

    @Override
    public String getTagName() {
      return "button";
    }
  }

  public static class Input extends DOMNode {
    private final Props props;

    public Input() {
      this.props = null;
    }

    public Input(Props props) {
      this.props = props;
    }

    @Override
    public String getTagName() {
      return "input";
    }

    public static class Props extends GlobalEventProps {
      public String value;
    }
  }

  public static class Form extends DOMNode {
    private final Props props;

    public Form() {
      this.props = null;
    }

    public Form(Props props) {
      this.props = props;
    }

    @Override
    public String getTagName() {
      return "form";
    }

    public static class Props extends GlobalEventProps {
    }
  }

  public static class H3 extends DOMNode {

    @Override
    public String getTagName() {
      return "h3";
    }
  }

  public static class Ul extends DOMNode {

    @Override
    public String getTagName() {
      return "ul";
    }
  }

  public static class Li extends DOMNode {

    @Override
    public String getTagName() {
      return "li";
    }
  }

  public static class Div extends DOMNode {
    public Div() {

    }

    public Div(HTML... html) {
      html(html);
    }

    @Override
    public String getTagName() {
      return "div";
    }
  }

  public static class Img extends ImgNode {
  }

  public static Div div() {
    return new Div();
  }

  public static Div div(HTML... d) {
    return new Div(d);
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
