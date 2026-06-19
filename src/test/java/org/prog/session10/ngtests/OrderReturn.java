package org.prog.session10.ngtests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderReturn {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("===============Run before all tests===============");
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
