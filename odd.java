import java.util.Scanner;

public class odd {
        public static void main(String[] args) {
          int n = 10;
          System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sumOfOddNumbers(n));
        }
      
        public static int sumOfOddNumbers(int n) {
          int sum = 0;
          for (int i = 1; i <= n; i += 2) {
            sum += i;
          }
          return sum;
        }
      }

