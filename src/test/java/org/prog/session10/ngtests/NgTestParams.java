package org.prog.session10.ngtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NgTestParams {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("---------------------------------");
    }

    @Test(dataProvider = "dataSource")
    public void paramTest(String str1, String str2) {
        System.out.println("paramTest " + str1 + " " + str2);
    }

    @DataProvider
    public Object[][] dataSource() {
        return new Object[][]{
                {"value_1", "value_2"},
                {"value_3", "value_4"},
                {"value_5", "value_6"}
        };
    }
}
