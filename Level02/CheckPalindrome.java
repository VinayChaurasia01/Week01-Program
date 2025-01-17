import java.util.*;

class PalindromeChecker {

  String text;

  // constructor of the class
  PalindromeChecker(String text) {
      this.text = text;

  }

  // checkpalindrome method
  boolean checkPalindrome(String text) {
      int start = 0;
      int end = text.length() - 1;

      while (start < end) {

          if (text.charAt(start) == text.charAt(end)) {
              start++;
              end--;
          } else {
              return false;
          }

      }
      return true;

  }

  void display(String text) {

      System.out.println("Is text palindrome :" + checkPalindrome(text));

  }
}

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a text :");
        String text = sc.next();

        PalindromeChecker palin = new PalindromeChecker(text);
        // display result
        palin.display(text);
    }

}

