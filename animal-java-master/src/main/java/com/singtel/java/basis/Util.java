package com.singtel.java.basis;

import java.io.FileInputStream;
import java.util.Optional;
import java.util.Properties;


public class Util {
    private static final Util util = new Util();
    Properties properties = new Properties();
    private Util() {
        try {
            String propFilePath = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "sound.properties";
            properties.load(new FileInputStream(propFilePath));
        } catch (Exception exception) {

        }
    }

    public static Util getInstance() {
        return util;
    }

    public String getMessageSound(String key) {
        return Optional.of(properties.getProperty(key + ".sound")).orElse("Cock-a-doodle-doo");
    }

}
