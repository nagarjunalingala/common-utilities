package com.javaojava.utilities;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nagarjuna on 6/12/15.
 */
public class ValidationUtilTest {

    private String str1 = null;
    private String str2 = "";
    private String str3 = " ";


    @Test
    public void testAreValidStrings() throws Exception {
        String str4 = "name";

        boolean validStatus = ValidationUtil.areValidStrings(str1, str2, str3, str4);
        Assert.assertFalse(validStatus);

    }

    @Test
    public void testAreValidStrings1() throws Exception {
        str1 = " ";
        str2 = "lname";
        String str4 = "name";

        boolean validStatus = ValidationUtil.areValidStrings(str1, str2, str3, str4);
        Assert.assertTrue(validStatus);

    }

    @Test
    public void testAreValidObjects() throws Exception {

        Object obj1 = (java.lang.Object) new String();
        Object obj2 = (Object) "hi";
        Object obj3 = null;

        boolean validStatus = ValidationUtil.areValidObjects(obj1, obj2, obj3);
        Assert.assertFalse(validStatus);
    }

    @Test
    public void testAreValidObjects1() throws Exception {

        Object obj1 = (java.lang.Object) new String();
        Object obj2 = (Object) "hi";
        Object obj3 = (Object)new StringBuffer();

        boolean validStatus = ValidationUtil.areValidObjects(obj1, obj2, obj3);
        Assert.assertTrue(validStatus);
    }
}