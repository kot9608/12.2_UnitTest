package hw;

public class NumbersUtils {

  // HW 3.1. Нужно покрыть тестами метод на 100%
  // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
  public boolean evenOddNumber(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
  // покрыть тестами метод на 100%
  public boolean isInInterval(int n) {
    int intervalStart = 25;
    int intervalEnd = 100;
    return intervalStart <= n && n <= intervalEnd;
  }
}
