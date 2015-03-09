package cm.grant.backfire;

import cm.grant.backfire.js.Func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A single DOM node.
 */
public abstract class DOMNode implements HTML {
  protected String className;
  protected String innerHTML;
  protected List<HTML> childrenDOMNodes = new ArrayList<>();

  public DOMNode className(String className) {
    return this;
  }

  public DOMNode onClick(Func func) {
    return this;
  }

  public DOMNode html(String... strings) {
    innerHTML = "";
    for (String string : strings) {
      innerHTML += string;
    }
    return this;
  }

  public DOMNode html(List<? extends HTML> d) {
    childrenDOMNodes.addAll(d);
    return this;
  }

  public DOMNode html(HTML... d) {
    childrenDOMNodes.addAll(Arrays.asList(d));
    return this;
  }

  public String getOpenTag() {
    return "<" + getTagName() + ">";
  }

  public String getCloseTag() {
    return "</" + getTagName() + ">";
  }

  public String getOuterHTML() {
    return getOpenTag() + getInnerHTML() + getCloseTag();
  }

  public String getInnerHTML() {
    if (childrenDOMNodes.isEmpty()) {
      return innerHTML;
    } else {
      return childrenDOMNodes.stream()
          .map((HTML h) -> h.toString())
          .collect(Collectors.joining());
    }
  }

  @Override
  public String toString() {
    return getOuterHTML();
  }
}

