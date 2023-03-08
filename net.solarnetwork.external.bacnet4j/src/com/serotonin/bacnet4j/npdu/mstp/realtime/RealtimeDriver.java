/**
 * Copyright (C) 2018 Infinite Automation Software. All rights reserved.
 */
package com.serotonin.bacnet4j.npdu.mstp.realtime;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * IOCTL JNA Wrapper To handle IOCTL calls to proprietary 
 * Realtime MS/TP Driver
 * 
 * @author Terry Packer
 */
public class RealtimeDriver {
    static final Logger LOG = LoggerFactory.getLogger(RealtimeDriver.class);
     
    private final File driver;
    private final File configProgram;
    
    public RealtimeDriver(File driver, File configProgram) {
        this.driver = driver;
        this.configProgram = configProgram;
    }
    
    /**
     * @param portId
     * @param baud
     * @param thisStation
     * @throws InterruptedException 
     * @throws IOException 
     */
    public void configure(String portId, int baud, byte thisStation, int maxMaster, int maxInfoFrames, int usageTimeout) throws InterruptedException, IOException {
        //TODO Redirect output to LOGs
        //TODO Create a setuid wrapper to call insmod to load the driver if not running as root

        //modprobe the driver
        ProcessBuilder pb = new ProcessBuilder("insmod", 
               driver.getAbsolutePath());
        pb.redirectError(Redirect.INHERIT);
        pb.redirectOutput(Redirect.INHERIT);
        Process process = pb.start();
        process.waitFor();
        process.destroy();
        
        //Configure the driver for the port
        pb = new ProcessBuilder(configProgram.getAbsolutePath(), 
                "-d" + portId,
                "-b" + baud,
                "-t" + thisStation,
                "-m" + maxMaster,
                "-f" + maxInfoFrames,
                "-u" + usageTimeout);
        pb.redirectError(Redirect.INHERIT);
        pb.redirectOutput(Redirect.INHERIT);
        process = pb.start();
        process.waitFor();
        process.destroy();
    }
}
