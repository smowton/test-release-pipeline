package net.kessra.test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

  @Test
  public void testAddition() {
    int result = Calculator.add(0, 0);
    assertThat(result, is(equalTo(0)));

    result = Calculator.add(1, 1);
    assertThat(result, is(equalTo(2)));
  }

  @Test
  public void testSubtraction() {
    int difference = Calculator.subtract(0, 0);
    assertThat(difference, is(equalTo(0)));

    difference = Calculator.subtract(1, 1);
    assertThat(difference, is(equalTo(0)));

    difference = Calculator.subtract(3, 2);
    assertThat(difference, is(equalTo(1)));

    difference = Calculator.subtract(1, 3);
    assertThat(difference, is(equalTo(-2)));
  }

  @Test
  public void testMultiplication() {
    int product = Calculator.multiply(1, 0);
    assertThat(product, is(equalTo(0)));

    product = Calculator.multiply(0, 1);
    assertThat(product, is(equalTo(0)));

    product = Calculator.multiply(1, 1);
    assertThat(product, is(equalTo(1)));

    product = Calculator.multiply(1, 2);
    assertThat(product, is(equalTo(2)));

    product = Calculator.multiply(2, 1);
    assertThat(product, is(equalTo(2)));

    product = Calculator.multiply(2, 3);
    assertThat(product, is(equalTo(6)));
  }

  @Test
  public void testDivision() {
    double quotient = Calculator.divide(3, 1);
    assertThat(quotient, is(equalTo(3.)));

    quotient = Calculator.divide(3, 3);
    assertThat(quotient, is(equalTo(1.)));

    quotient = Calculator.divide(9, 3);
    assertThat(quotient, is(equalTo(3.)));
  }
}
