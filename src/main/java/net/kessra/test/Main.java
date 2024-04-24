package net.kessra.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Simple demo application.
 */
public final class Main {

  /**
   * Logger of this class.
   */
  private static final Logger LOG =
          LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  /**
   * Anti-magic-number warning - first number of the calculation.
   */
  private static final int FIRST_NUMBER = 9;
  /**
   * Anti-magic-number warning - second number of the calculation.
   */
  private static final int SECOND_NUMBER = 3;

  /**
   * Starting point for our awesome application, which just prints a simple
   * text to the standard output.
   *
   * @param args The arguments passed to the application
   */
  public static void main(final String... args) {
    printOutcome("+", FIRST_NUMBER, SECOND_NUMBER);
    printOutcome("-", FIRST_NUMBER, SECOND_NUMBER);
    printOutcome("*", FIRST_NUMBER, SECOND_NUMBER);
    printOutcome("/", FIRST_NUMBER, SECOND_NUMBER);
  }

  /**
   * Prints the outcome of calculating two numbers with each other depending
   * on the requested calculation type.
   * <p>
   * The calculation type has to be one of the following operations:
   * <ul>
   *   <li><code>+</code> (Addition)</li>
   *   <li><code>-</code> (Subtraction></li>
   *   <li><code>*</code> (Multiplication)</li>
   *   <li><code>/</code> (Division)</li>
   * </ul>
   *
   * @param calculationType The calculation type to perform on two numbers
   * @param firstNumber The first number of the calculation
   * @param secondNumber The second number of the calculation
   */
  private static void printOutcome(final String calculationType,
                                   final int firstNumber,
                                   final int secondNumber) {
    String outcome = switch (calculationType) {
      case "+" -> "Result of adding " + firstNumber + " and " + secondNumber
              + " = "
              + Calculator.add(firstNumber, secondNumber);
      case "-" -> "Differnce of subracting " + firstNumber + " form "
              + secondNumber + " = "
              + Calculator.subtract(firstNumber, secondNumber);
      case "*" -> "Product of multiplying " + firstNumber + " with "
              + secondNumber + " = "
              + Calculator.multiply(firstNumber, secondNumber);
      case "/" -> "Quotient of dividing " + firstNumber + " through "
              + secondNumber + " = "
              + Calculator.divide(firstNumber, secondNumber);
      default -> "Unsupported operation '" + calculationType + "'";
    };
    LOG.debug(outcome);
    System.out.println(outcome);
  }

  private Main() {
  }
}
