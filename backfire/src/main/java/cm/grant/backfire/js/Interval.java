package cm.grant.backfire.js;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Interval {
  private ScheduledFuture<?> scheduledFuture;

  public Interval(FuncVoid tick, int i) {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    scheduledFuture = executor.scheduleAtFixedRate(() -> tick.get(), 0, i, TimeUnit.MILLISECONDS);
  }

  public static Interval setInterval(FuncVoid tick, int i) {
    return new Interval(tick, i);
  }

  public static void clearInterval(Interval i) {
    i.scheduledFuture.cancel(true);
  }
}
