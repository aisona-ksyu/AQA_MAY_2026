package org.prog.session10.ngtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailReg {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before EmailReg tests");
    }

    @Test
    public void test1() {
        System.out.println("test ng 1");
    }

    @Test
    public void test2() {
        System.out.println("test ng 2");
    }

    @Test
    public void test3() {
        System.out.println("test ng 3");
    }

    @Test
    public void test4() {
        System.out.println("test ng 4");
    }
}
