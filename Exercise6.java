import java.util.Scanner;

/**
 * Exercise6
 */
public class Exercise6 {

  public void printType1(int num) {
    if (num == 0) {
      System.out.println(num + " is zero");
    } else if (num < 0) {
      System.out.println(num + " is negative");
    } else {
      System.out.println(num + " is possitive");
    }
  }

  public void printType2(int num) {
    if (num == 0) {
      System.out.println(num + " is zero");
    } else if (num % 2 == 0) {
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }
  }

  public void checkVowel(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is vowel");
    } else {
      System.out.println(c + " is not a vowel");
    }
  }

  public void checkChar(char c) {
    if (c >= 65 && c <= 90) {
      System.out.println(c + " is Uppercase");
    } else if (c >= 97 && c <= 122) {
      System.out.println(c + " is Lowercase");
    } else if (c >= 48 && c <= 57) {
      System.out.println(c + " is number");
    } else {
      System.out.println(c + " is not a letter");
    }
  }

  public void isPossitive(int num, Scanner input) {
    while (num < 0) {
      System.out.print("Please enter a Number : ");
      num = input.nextInt();
    }

    System.out.println(num + " is Possitive");
  }

  public void isOdd(int num, Scanner input) {
    do {
      System.out.print("Please enter Odd Number : ");
      num = input.nextInt();
    } while (num % 2 == 0);
    System.out.println(num + " is Odd Number");
  }

  public void isDivideBy(int num, Scanner input) {
    System.out.print("Please enter number(N) : ");
    int n = input.nextInt();
    System.out.print("Please enter number(X) : ");
    int x = input.nextInt();
    String sum = "";
    for (int i = 1; i <= n; i++) {
      if (i % x == 0) {
        if (sum == "") {
          sum = sum + i;
        } else {
          sum = sum + "," + i;
        }
      }
    }
    System.out.println(sum);
  }

  public void printStarAdvance(int num, Scanner input) {
    System.out.print("Please enter number : ");
    int n = input.nextInt();
    String star = "*";
    System.out.println(star);
    for (int i = 1; i <= n; i++) {
      for (i = 1; i < n; i++) {
        star += "_";
        System.out.println(star + "*");
      }
    }
  }

  public static void main(String[] args) {
    Exercise6 ex = new Exercise6();
    Scanner input = new Scanner(System.in);
    // System.out.print("Please enter a Number : ");
    // int num = input.nextInt();
    // ex.printType1(num);
    // ex.printType2(num);
    // ex.isPossitive(num,input);
    // ex.isOdd(0,input);
    // ex.isDivideBy(0, input);
    // System.out.print("Enter a character : ");
    // String text = input.next();
    // char c = text.charAt(0);
    // ex.checkVowel(c);
    // ex.checkChar(c);
    ex.printStarAdvance(0, input);
  }
}
