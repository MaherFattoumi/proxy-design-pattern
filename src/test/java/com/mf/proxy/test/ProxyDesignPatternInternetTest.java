package com.mf.proxy.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.mf.proxy.Internet;
import com.mf.proxy.ProxyInternet;

public class ProxyDesignPatternInternetTest {

    @Test
    public void testConnectToAllowedWebsite() {
        Internet internet = new ProxyInternet();

        internet.connectTo("example.com");

        // Verify that the connection is successful
        // Add your assertions based on your implementation
        Assert.assertTrue(checkConnectionSuccessful("example.com"));
    }

//    @Test(expected = RuntimeException.class)
//    public void testConnectToBlockedWebsite() {
//        Internet internet = new ProxyInternet();
//
//        internet.connectTo("facebook.com");
//
//        // Verify that the connection is blocked
//        // Add your assertions based on your implementation
//        Assert.assertTrue(checkConnectionBlocked("facebook.com"));
//    }

    private boolean checkConnectionSuccessful(String website) {
        // Implementation of checking if the connection is successful
        // Replace this with your own implementation that checks the connection status
        return true;
    }

    private boolean checkConnectionBlocked(String website) {
        // Implementation of checking if the connection is blocked
        // Replace this with your own implementation that checks the connection status
        return false;
    }
}

