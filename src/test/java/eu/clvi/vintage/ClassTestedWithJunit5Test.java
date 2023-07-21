package eu.clvi.vintage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTestedWithJunit5Test {

  private final ClassTestedWithJunit5 underTest = new ClassTestedWithJunit5();

  @Test
  void test_hello() {
    assertEquals("hello!", underTest.hello());
  }

}
