package CalculadoraPolonesa;

class Leitor {
    String[] parts;
    int position = 0;

    public Leitor(String input) {
        parts = input.split(" ");
    }

    public ComplexNumber proxNumero() {
        ComplexNumber number;
        String first = parts[position];

        String second = null;
        if (position + 1 < parts.length) {
            second = parts[position + 1];
        }

        if (first.charAt(first.length() - 1) == 'i') {
            double b = Double.parseDouble(first.substring(0, first.length() - 1));
            number = new ComplexNumber(0, b);
            position += 1;
        } else if (second != null && second.charAt(second.length() - 1) == 'i') {
            double a = Double.parseDouble(first);
            double b = Double.parseDouble(second.substring(0, second.length() - 1));
            number = new ComplexNumber(a, b);

            position += 2;
        } else {
            double a = Double.parseDouble(first);
            number = new ComplexNumber(a, 0.0);
            position += 1;
        }

        return number;

    }
}

class LeitorTestes {
    public static void testes() {
        check("5", new ComplexNumber(5.0, 0.0));
        check("5i", new ComplexNumber(0.0, 5.0));
        check("5 4i", new ComplexNumber(5.0, 4.0));

        check("5i 4i", new ComplexNumber(0.0, 5.0), new ComplexNumber(0.0, 4.0));
        check("5 4 2i", new ComplexNumber(5.0, 0.0), new ComplexNumber(4.0, 2.0));
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
            throw new AssertionError("Input:" + input + " Expected: " + expected + " Actual: " + actual.toString());
        }

    }
}