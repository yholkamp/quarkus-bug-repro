package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.function.Consumer;

/**
 * @author yholkamp
 */
@ApplicationScoped
public class MyTroublingClass {

  /**
   * @param <X> exception type thrown by the callback, if any.
   *
   * @throws X any exception thrown by the callback
   */
  public <X extends Exception> void useHandle() throws X {
  }
}
