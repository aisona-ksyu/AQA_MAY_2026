package org.prog.session10.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.stream.Stream;

public class JUnitParametrized {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All 1");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("-----------------------------------");
    }

    //8...16 symbols
    //contains 1+ upper case letter
    //contains 1+ lower case letter
    //contains 1+ numbers

    //Aaaaaaa1
    //Aaaaaaaaaa1
    //Aaaaaaaaaaaaaaa1

    //Aaaaaa1
    //Aaaaaaaaaaaaaaaa1
    //Aaaaaaaaaaa
    //Aaaaaaaaaaa
    //aaaaaaaaaa1
    //AAAAAAAAAAAAA1

    @ParameterizedTest
    @ValueSource(strings = {
            "Aaaaaa1",
            "Aaaaaaaaaaaaaaaa1",
            "1aaaaaaaaaa",
            "Aaaaaaaaaaa",
            "aaaaaaaaaa1",
            "AAAAAAAAAAAAA1"
    })
    public void myParamTest(String s) {
        System.out.println("Testing password " + s);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Aaaaaaa1",
            "Aaaaaaaaaa1",
            "Aaaaaaaaaaaaaaa1"
    })
    public void myParamTest2(String s) {
        System.out.println("Testing password " + s);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void testArgStream(String s1, String s2) {
        System.out.println("Testing " + s1 + " and " + s2);
    }


    public static Stream<Arguments> argumentsStream() {
        Random random = new Random();
        return Stream.of(
                Arguments.of("value_" + random.nextInt(100), "value_" + random.nextInt(100)),
                Arguments.of("value_" + random.nextInt(100), "value_" + random.nextInt(100)),
                Arguments.of("value_" + random.nextInt(100), "value_" + random.nextInt(100)),
                Arguments.of("value_" + random.nextInt(100), "value_" + random.nextInt(100))
        );
    }
}
