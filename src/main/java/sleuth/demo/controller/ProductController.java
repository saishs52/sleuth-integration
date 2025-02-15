package sleuth.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private static final Logger LOG = LoggerFactory.
            getLogger(ProductController.class);

    @GetMapping(value = "/product")
    public String product() {
        LOG.info("Inside product service");
        String responseFromCartService = "{\"name\":\"product 1\"}";
        LOG.info("Successfully communicated " +
                "with cart service");
        return "Greetings from product" + ">>" +
                responseFromCartService;
    }
}
