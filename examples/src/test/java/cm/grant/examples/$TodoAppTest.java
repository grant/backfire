package cm.grant.examples;

import junit.framework.TestCase;

public class $TodoAppTest extends TestCase {

  public void testRender() throws Exception {
    $TodoApp app = new $TodoApp();
    assertEquals("<div><h3>TODO</h3><ul /><form><input /><button>Add #01</button></form></div>", app.render().toString());
  }
}