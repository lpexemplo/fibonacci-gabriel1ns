package solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestFibonacci {

  private Fibonacci fibCalculator;

  @BeforeEach
  public void setUp() {
    fibCalculator = new Fibonacci();
  }

  @Test
  @DisplayName("Test Fibonacci base cases")
  public void testFibonacciBaseCases() {
    assertEquals(0, fibCalculator.fibonacci(0), "F(0) should be 0");
    assertEquals(1, fibCalculator.fibonacci(1), "F(1) should be 1");
  }

  @Test
  @DisplayName("Test Fibonacci for n=4")
  public void testFibonacci4() {
    assertEquals(3, fibCalculator.fibonacci(4), "F(4) should be 3");
  }

  @Test
  @DisplayName("Test Fibonacci for n=7")
  public void testFibonacci7() {
    assertEquals(13, fibCalculator.fibonacci(7), "F(7) should be 13");
  }

  @ParameterizedTest
  @DisplayName("Test multiple Fibonacci values")
  @CsvSource({
      "0, 0",
      "1, 1",
      "2, 1",
      "3, 2",
      "4, 3",
      "5, 5",
      "6, 8",
      "7, 13",
      "8, 21"
  })
  public void testFibonacciSequence(int n, int expected) {
    assertEquals(expected, fibCalculator.fibonacci(n),
        String.format("F(%d) should be %d", n, expected));
  }
}