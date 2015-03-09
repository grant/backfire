package cm.grant.examples;

import junit.framework.TestCase;

public class $TimerTest extends TestCase {
  public void testRender() throws Exception {
    $Timer timer = new $Timer();
    String timerHTML = timer.render().toString();
    System.out.println(timerHTML);
    assertEquals("<div>Seconds Elapsed: 0</div>", timerHTML);
  }
}