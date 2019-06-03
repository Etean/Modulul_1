public class Polindrome {
    static void check(int n) {
        int sum = 0;

        int temp;
        for (temp = n; n > 0; n /= 10) {
            int r = n % 10;
            sum = sum * 10 + r;
        }

        if (temp == sum) {
            System.out.println("It is a Palindrome number.");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
