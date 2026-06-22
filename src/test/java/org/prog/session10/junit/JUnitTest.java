package org.prog.session10.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All 3");
    }

    @Test
    public void test1() {
        System.out.println("test1");
        testString("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
        testString("test2");
    }

    @Test
    public void tes3() {
        System.out.println("test3");
        testString("test3");
    }

    public void testString(String s) {
        System.out.println("Evaluating string s to contain '2':");
        Assertions.assertTrue(s.contains("2"), "String expected to contain '2'");
    }
}
