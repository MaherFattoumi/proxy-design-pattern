package com.mf.proxy;

public class RealInternet implements Internet {
    public void connectTo(String website) {
        // Connect to the website
        System.out.println("Connected to " + website);
    }
}
