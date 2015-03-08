package cm.grant.backfire.js;

/**
 * A Javascript function that returns a T.
 */
@FunctionalInterface
public interface Func<T> {
  T get();
}
