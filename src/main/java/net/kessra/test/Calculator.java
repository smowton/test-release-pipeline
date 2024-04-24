package net.kessra.test;

/**
 * Simple demo calculator which allows to {@link #add(int, int)}, {@link
 * #subtract(int, int)}, {@link #multiply(int, int)} and {@link
 * #divide(int, int)} to input arguments.
 */
public final class Calculator {

  private Calculator() {
  }

  /**
   * Adds two provided numbers.
   *
   * @param a The first number of the addition
   * @param b The second number of the additon
   * @return The result of the addition
   */
  public static int add(final int a, final int b) {
    return a +  b;
  }

  /**
   * Subtracts the second number from the first one.
   *
   * @param a The first number of the subtraction
   * @param b The second number of the subtraction
   * @return The difference of subtracting the second number from the first one
   */
  public static int subtract(final int a, final int b) {
    return a - b;
  }

  /**
   * Multiplies the first number with the second one.
   *
   * @param a The first number of the multiplication
   * @param b The second number of the multiplication
   * @return The product of multiplying the first number with the second one
   */
  public static int multiply(final int a, final int b) {
    return a * b;
  }

  /**
   * Divides the first number by the second number.
   *
   * @param a The dividend of the division
   * @param b The divisor of the division
   * @return The quotient of the division
   */
  public static double divide(final int a, final int b) {
    return ((double) a) / b;
  }
}
