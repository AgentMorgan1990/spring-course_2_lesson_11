package com.geekbrains.spring.web.cart.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Data;

@ConstructorBinding
@ConfigurationProperties(prefix = "integrations.core-service.timeouts")
@Data
public class CoreServiceIntegrationPropertiesTimeouts {
    private Integer connect;
    private Integer read;
    private Integer write;
}
