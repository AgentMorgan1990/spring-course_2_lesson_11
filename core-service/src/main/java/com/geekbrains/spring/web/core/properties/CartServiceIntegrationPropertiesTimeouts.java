package com.geekbrains.spring.web.core.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Data;

@ConstructorBinding
@ConfigurationProperties(prefix = "integrations.cart-service.timeouts")
@Data
public class CartServiceIntegrationPropertiesTimeouts {
    private Integer connect;
    private Integer read;
    private Integer write;
}
