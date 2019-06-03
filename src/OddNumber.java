public class OddNumber {
    static void odd(int x) {
        for (int i = 1; i <= x; ++i) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
