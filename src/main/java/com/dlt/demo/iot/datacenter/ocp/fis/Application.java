package com.dlt.demo.iot.datacenter.ocp.fis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/amq.xml", "classpath:spring/camel-context.xml"})
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public String toString() {
	return "Application []";
    }

}
