package cm.grant.examples;

import junit.framework.TestCase;

public class $TodoAppTest extends TestCase {

  public void testRender() throws Exception {
    $TodoApp app = new $TodoApp();
    System.out.println(app.render());
  }
}