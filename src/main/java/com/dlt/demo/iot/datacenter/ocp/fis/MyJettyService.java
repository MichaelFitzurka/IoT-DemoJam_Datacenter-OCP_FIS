package com.dlt.demo.iot.datacenter.ocp.fis;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyJettyService implements Processor {

    private static final String OFF_MESSAGE_SUFFIX = "|off";

    public void process(final Exchange exchange) throws Exception {
        String body = exchange.getIn().getHeader("deviceID") + OFF_MESSAGE_SUFFIX;

        System.out.println("DeviceType received by Camel ( fullset ) = " + exchange.getIn().getHeader("deviceType"));

        exchange.getOut().setBody(body);
    }

    @Override
    public String toString() {
        return "MyJettyService []";
    }

}
