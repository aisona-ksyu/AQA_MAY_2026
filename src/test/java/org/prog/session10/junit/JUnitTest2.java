package org.prog.session10.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitTest2 {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All 2");
    }

    @Test
    public void test4() {
        testString("test4");
    }

    @Test
    public void test5() {
        testString(null);
    }

    @Test
    public void tes6() {
        testString("test4");
    }

    public void testString(String s) {
        System.out.println(s.length());
    }
}
