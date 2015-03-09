package cm.grant.examples;

import com.sun.tools.javac.util.List;
import junit.framework.TestCase;

public class $TodoListTest extends TestCase {

  public void testRender() throws Exception {
    $TodoList.Props props = new $TodoList.Props();
    props.items = List.of("milk", "cookies");
    $TodoList $TodoList = new $TodoList(props);
    System.out.println($TodoList.render());
  }
}