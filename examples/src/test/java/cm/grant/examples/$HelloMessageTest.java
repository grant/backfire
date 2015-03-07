package cm.grant.examples;

import junit.framework.TestCase;

public class $HelloMessageTest extends TestCase {
  public void test() {
    $HelloMessage.Props props = new $HelloMessage.Props();
    props.name = "John";
    System.out.println(new $HelloMessage(props));
  }
}