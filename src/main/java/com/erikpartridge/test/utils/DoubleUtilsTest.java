package com.erikpartridge.test.utils;

import com.erikpartridge.utils.DoubleUtils;
import junit.framework.Assert;

import static org.junit.Assert.*;

public class DoubleUtilsTest {

    @org.junit.Test
    public void testVrcString() throws Exception {
        String vrc = DoubleUtils.vrcString(41.2529751,-70.0599114);
        assert vrc.equals("N41.15.10.7104 W70.3.35.6810");
    }
}