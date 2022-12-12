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
        check("1 1 /", "(1.0, 0.0i)");
        check("1 1 *", "(1.0, 0.0i)");

        check("3 2 +", "(5.0, 0.0i)");
        check("2 3 +", "(5.0, 0.0i)");

        // javac CalculadoraPolonesa/*.java && java CalculadoraPolonesa.Tests

        check("3 2 -", "(1.0, 0.0i)");
        check("2 3 -", "(-1.0, 0.0i)");

        check("2 3 *", "(6.0, 0.0i)");
        check("3 2 *", "(6.0, 0.0i)");

        check("4 2 /", "(2.0, 0.0i)");
        check("2 4 /", "(0.5, 0.0i)");

        check("1 2 + 3r2i +", "(6.0, 2.0i)");

        check("4r6i 2r3i +", "(6.0, 9.0i)");
        check("4r6i 2r3i -", "(2.0, 3.0i)");
        check("4r6i 2r3i /", "(2.0, -0.0i)");

        LeitorTestes.testes();
    }

    private static void check(String input, String expected) {
        ComplexNumber actual = Operations.calcular(input);

        System.out.println("check: [" + input + "]: " + actual.toString());

        if (!actual.toString().equals(expected)) {
            throw new AssertionError("Input:" + input + " Expected: " + expected + " Actual: " + actual.toString());
        }
    }
}
