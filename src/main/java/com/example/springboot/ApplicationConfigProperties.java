package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.example")
public class ApplicationConfigProperties {

    /**
     * Name of the server.
     */
    private String name;

    /**
     * IP address to listen to.
     */
    private String ip = "127.0.0.1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
