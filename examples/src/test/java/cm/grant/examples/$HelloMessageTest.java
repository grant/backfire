package cm.grant.examples;

import junit.framework.TestCase;

public class $HelloMessageTest extends TestCase {
  public void test() {
    $HelloMessage.Props props = new $HelloMessage.Props();
    props.name = "John";
    assertEquals("<div>Hello </div>", new $HelloMessage().toString());
    assertEquals("<div>Hello John</div>", new $HelloMessage(props).toString());
  }
}