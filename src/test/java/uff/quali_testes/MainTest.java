package uff.quali_testes;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MainTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void checkSimpleCases(String input, String expected) {
        Assertions.assertEquals(expected, Operations.calcular(input).toString());
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("1 1 +", "(2.0, 0.0i)"),
                Arguments.of("1 1 -", "(0.0, 0.0i)"),
                Arguments.of("1 1 /", "(1.0, 0.0i)"),
                Arguments.of("1 1 *", "(1.0, 0.0i)"),

                Arguments.of("3 2 +", "(5.0, 0.0i)"),
                Arguments.of("2 3 +", "(5.0, 0.0i)"),

                Arguments.of("3 2 -", "(1.0, 0.0i)"),
                Arguments.of("2 3 -", "(-1.0, 0.0i)"),

                Arguments.of("2 3 *", "(6.0, 0.0i)"),
                Arguments.of("3 2 *", "(6.0, 0.0i)"),

                Arguments.of("4 2 /", "(2.0, 0.0i)"),
                Arguments.of("2 4 /", "(0.5, 0.0i)"),

                Arguments.of("1 2 + 3r2i +", "(6.0, 2.0i)"),

                Arguments.of("4r6i 2r3i +", "(6.0, 9.0i)"),
                Arguments.of("4r6i 2r3i -", "(2.0, 3.0i)"),
                Arguments.of("4r6i 2r3i /", "(2.0, -0.0i)"));
    }
}

// javac CalculadoraPolonesa/*.java && java CalculadoraPolonesa.Tests