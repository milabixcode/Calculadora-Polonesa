package uff.quali_testes;

import org.junit.jupiter.api.Test;

public class LeitorTest {
    @Test
    public void testes() {
        // Reais: 123
        // Complexos: 123r123i
        check("5", new ComplexNumber(5.0, 0.0));
        check("0r5i", new ComplexNumber(0.0, 5.0));
        check("5r4i", new ComplexNumber(5.0, 4.0));

        check("0r5i 0r4i", new ComplexNumber(0.0, 5.0), new ComplexNumber(0.0, 4.0));
        check("5 4r2i", new ComplexNumber(5.0, 0.0), new ComplexNumber(4.0, 2.0));
        check("4r2i 5", new ComplexNumber(4.0, 2.0), new ComplexNumber(5.0, 0.0));

        boolean thrown = false;
        String invalidNumber = "notNumber";
        try {
            check(invalidNumber, (ComplexNumber) null);
        } catch (NotANumberException e) {
            thrown = true;
        } finally {
            if (!thrown) {
                assertionFailed(invalidNumber, "an exception", "no exception");
            }
        }

        proxOperadorTests();
    }

    private static void check(String input, ComplexNumber... expected) {
        Leitor leitor = new Leitor(input);

        for (int i = 0; i < expected.length; i++) {
            ComplexNumber actual = leitor.proxNumero();
            checkEquals(input, actual, expected[i]);
        }
    }

    private static void checkEquals(String input, ComplexNumber actual, ComplexNumber expected) {
        if (!(actual.getReal() == expected.getReal() && actual.getImaginaria() == expected.getImaginaria())) {
            assertionFailed(input, expected.toString(), actual.toString());
        }

    }

    // tenho um array de inputs e um array de resultados esperados

    // Para cada input, vou criar um leitor com esse input
    // chamar proxOperador para pegar o output
    // Aì vou checar se o output é igual ao resultado esperado para esse input

    // Se for diferente, dou um throw assertion q nem no método `checkEquals`

    private static void proxOperadorTests() {
        String[] inputs = { "+", "-", "*", "/" };
        String[] expected = { "+", "-", "*", "/" };

        for (int i = 0; i < expected.length; i++) {
            Leitor leitor = new Leitor(inputs[i]);
            String output = leitor.proxOperador();
            if (!output.equals(expected[i])) {
                assertionFailed(inputs[i], expected[i], output);
            }
        }

        boolean thrown = false;
        String invalidOperator = "anything";
        try {
            Leitor leitor = new Leitor(invalidOperator);
            leitor.proxOperador();
        } catch (NotAnOperatorException e) {
            thrown = true;
        } finally {
            if (!thrown) {
                assertionFailed(invalidOperator, "an exception", "no exception");
            }
        }
    }

    private static void assertionFailed(String input, String expected, String output) {
        throw new AssertionError(
                "Input:" + input + " Expected: " + expected + " Output: " + output);
    }
}