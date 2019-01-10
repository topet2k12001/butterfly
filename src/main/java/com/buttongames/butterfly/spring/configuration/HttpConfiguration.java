package com.buttongames.butterfly.spring.configuration;

import com.buttongames.butterfly.http.ButterflyHttpServer;
import com.buttongames.butterfly.http.handlers.impl.EventLogRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.FacilityRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.MessageRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.PackageRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.PcbEventRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.PcbTrackerRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.ServicesRequestHandler;
import com.buttongames.butterfly.http.handlers.impl.TaxRequestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Bean config class for <code>com.buttongames.butterfly.http</code> package.
 * @author skogaby (skogabyskogaby@gmail.com)
 */
@Configuration
@ComponentScan({"com.buttongames.butterfly.spring.configuration"})
public class HttpConfiguration {

    @Bean
    public ButterflyHttpServer butterflyHttpServer(final ServicesRequestHandler servicesRequestHandler,
                                                   final PcbEventRequestHandler pcbEventRequestHandler,
                                                   final PcbTrackerRequestHandler pcbTrackerRequestHandler,
                                                   final MessageRequestHandler messageRequestHandler,
                                                   final FacilityRequestHandler facilityRequestHandler,
                                                   final PackageRequestHandler packageRequestHandler,
                                                   final EventLogRequestHandler eventLogRequestHandler,
                                                   final TaxRequestHandler taxRequestHandler) {
        return new ButterflyHttpServer(servicesRequestHandler, pcbEventRequestHandler, pcbTrackerRequestHandler,
                messageRequestHandler, facilityRequestHandler, packageRequestHandler, eventLogRequestHandler,
                taxRequestHandler);
    }

    @Bean
    public EventLogRequestHandler eventLogRequestHandler() {
        return new EventLogRequestHandler();
    }

    @Bean
    public FacilityRequestHandler facilityRequestHandler() {
        return new FacilityRequestHandler();
    }

    @Bean
    public MessageRequestHandler messageRequestHandler() {
        return new MessageRequestHandler();
    }

    @Bean
    public PackageRequestHandler packageRequestHandler() {
        return new PackageRequestHandler();
    }

    @Bean
    public PcbEventRequestHandler pcbEventRequestHandler() {
        return new PcbEventRequestHandler();
    }

    @Bean
    public PcbTrackerRequestHandler pcbTrackerRequestHandler() {
        return new PcbTrackerRequestHandler();
    }

    @Bean
    public ServicesRequestHandler servicesRequestHandler() {
        return new ServicesRequestHandler();
    }

    @Bean
    public TaxRequestHandler taxRequestHandler() {
        return new TaxRequestHandler();
    }
}
