package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.function.Consumer;

/**
 * @author yholkamp
 */
@ApplicationScoped
public class MyTroublingClass {

  /**
   * A convenience function which manages the lifecycle of a handle and yields it to a callback
   * for use by clients.
   *
   * @param consumer A callback which will receive an open Handle
   * @param <X> exception type thrown by the callback, if any.
   *
   * @throws X any exception thrown by the callback
   */
  public <X extends Exception> void useHandle(final Consumer<X> consumer) throws X {
  }
}
