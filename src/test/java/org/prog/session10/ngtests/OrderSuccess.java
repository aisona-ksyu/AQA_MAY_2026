package org.prog.session10.ngtests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderSuccess {

    @BeforeTest
    public void beforeTest() {
        System.out.println("===============Run before all USER ORDER tests===============");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("===============Run after all USER ORDER tests===============");
    }

    @Test
    public void test1() {
        System.out.println("test ng 9");
    }

    @Test
    public void test2() {
        System.out.println("test ng 10");
    }

    @Test
    public void test3() {
        System.out.println("test ng 11");
    }

    @Test
    public void test4() {
        System.out.println("test ng 12");
    }
}
