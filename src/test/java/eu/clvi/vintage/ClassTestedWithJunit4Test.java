package eu.clvi.vintage;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTestedWithJunit4Test {

  private final ClassTestedWithJunit4 underTest = new ClassTestedWithJunit4();

  @Test
  public void test_hello() {
    assertEquals("hello!", underTest.hello());
  }

}
