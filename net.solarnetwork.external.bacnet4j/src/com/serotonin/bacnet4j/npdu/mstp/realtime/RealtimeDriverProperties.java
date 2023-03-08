/**
 * Copyright (C) 2018 Infinite Automation Software. All rights reserved.
 */
package com.serotonin.bacnet4j.npdu.mstp.realtime;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * TODO Describe what properties are required in the config file
 * 
 * Class to hold the IOCTL Constants for the Realtime Driver
 * 
 * @author Terry Packer
 */
public class RealtimeDriverProperties {

    private final Map<String, Integer> constants;
    
    public RealtimeDriverProperties(InputStream propertiesStream) throws IOException {
        Properties properties = new Properties();
        properties.load(propertiesStream);
        constants = new HashMap<>();
        properties.forEach((key,value) ->{
            constants.put((String)key, Integer.decode((String)value));
        });
        
        
    }
    
    public int getValue(String key) throws NumberFormatException {
       return constants.get(key);
    }
    
}
