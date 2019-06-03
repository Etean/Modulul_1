public class FizzBuzz {

    static void fizzBuzz(int limit) {
        for (int i = 1; i <= limit; ++i) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.println(i + " ");
            }
        }

    }
}


