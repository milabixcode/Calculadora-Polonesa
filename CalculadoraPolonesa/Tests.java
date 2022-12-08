package CalculadoraPolonesa;

public class Tests {
    public static void main(String[] args) {
        System.out.println("Running tests...");
        checkSimpleCases();
        System.out.println("All tests passed!");
    }

    public static void checkSimpleCases() {
        check("1 1 +", "(2.0, 0.0i)");
        check("1 1 -", "(0.0, 0.0i)");
        // check("1 1 /", "(1.0, 0.0i)");
        check("1 1 *", "(1.0, 0.0i)");

        check("3 2 +", "(5.0, 0.0i)");
        check("2 3 +", "(5.0, 0.0i)");

        check("3 2 -", "(1.0, 0.0i)");
        check("2 3 -", "(-1.0, 0.0i)");

        check("2 3 *", "(6.0, 0.0i)");
        check("3 2 *", "(6.0, 0.0i)");

        // check("4 2 /", "(2.0, 0.0i)");
        // check("2 4 /", "(0.5, 0.0i)");
    }

    private static void check(String input, String expected) {
        ComplexNumber actual = Operacoes.calcular(input);

        System.out.println(actual.toString() + expected);

        if (!actual.toString().equals(expected)) {
            throw new AssertionError("Expected: " + expected + " Actual: " + actual.toString());
        }
    }
}
