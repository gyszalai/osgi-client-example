package hu.vanio.osgi.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.vanio.osgi.service.ExampleOsgiService;

/**
 * Example client for ExampleOsgiService
 *
 * @author Gyula Szalai <gyula.szalai@vanio.hu>
 */
public class ExampleOsgiClient {

    Logger logger = LoggerFactory.getLogger(ExampleOsgiClient.class);
    
    /** Reference to the exported ExampleOsgiService interface */
    private ExampleOsgiService exampleOsgiService;

    /** Getter for ExampleOsgiService */
    public ExampleOsgiService getExampleOsgiService() {
        return exampleOsgiService;
    }

    /** Setter for ExampleOsgiService */
    public void setExampleOsgiService(ExampleOsgiService exampleOsgiService) {
        this.exampleOsgiService = exampleOsgiService;
    }
    
    /** Initialization */
    public void init() {
        logger.info("ExampleOsgiService.greeting: " + this.exampleOsgiService.greeting());
    }
    
}
