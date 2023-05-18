package com.mf.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet realInternet;
    private List<String> blockedWebsites;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
        this.blockedWebsites = new ArrayList<>();
        // Add blocked websites to the list
        blockedWebsites.add("facebook.com");
        blockedWebsites.add("twitter.com");
    }

    public void connectTo(String website) {
        if (isWebsiteBlocked(website)) {
            throw new RuntimeException("Access to " + website + " is blocked");
        }
        realInternet.connectTo(website);
    }

    private boolean isWebsiteBlocked(String website) {
        return blockedWebsites.contains(website);
    }
}
