package com.javaojava.utilities;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by nagarjuna on 6/12/15.
 */
public final class ValidationUtil {

    private ValidationUtil() {

    }

    /**
     * This utility takes any number of String arguments and validates(empty) for each string. If any of the provided String object is empty(blank or null) then this method will return false otherwise true.
     * This utility can help in handling rest with handling multiple headers (suppose if required fields are not empty then do an action..etc)
     *
     * @param arguments
     * @return
     */
    public static boolean areValidStrings(String... arguments) {

        for (String arg : arguments) {
            if (StringUtils.isEmpty(arg)) {
                return false;
            }
        }
        return true;
    }

    /**
     * This utility takes any number of Object(any type) and validates(checks for only null) for each object. If any of the provided Object is null then this method will return false.
     * This utility can help - If all the inputs for a method are valid then do an action.
     *
     * @param objects
     * @return
     */
    public static boolean areValidObjects(Object... objects) {

        for (Object obj : objects) {
            if (null == obj) {
                return false;
            }
        }
        return true;
    }
}
