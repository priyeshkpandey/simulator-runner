package com.occ.web.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.occ.web")
public class ServiceRunner {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceRunner.class);

    public static void main( String[] args ) {
        LOG.info("STARTING FROM MAIN");
        run(args);
    }

    public static void run( String[] args ) {
        LOG.info("STARTING SERVER");
        SpringApplication occServer = new SpringApplication(ServiceRunner.class);
        occServer.setAddCommandLineProperties(true);
        occServer.run(args);
    }
}
