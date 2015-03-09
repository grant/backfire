package cm.grant.examples;

import junit.framework.TestCase;

import java.util.Arrays;

public class $TodoListTest extends TestCase {

  public void testRender() throws Exception {
    $TodoList.Props props = new $TodoList.Props();
    props.items = Arrays.asList("milk", "cookies");
    $TodoList $TodoList = new $TodoList(props);
    assertEquals(
        "<ul><li>milk</li><li>cookies</li></ul>",
        $TodoList.render().toString()
    );
  }
}