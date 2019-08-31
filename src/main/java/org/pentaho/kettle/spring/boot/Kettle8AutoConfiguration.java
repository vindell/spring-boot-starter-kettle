package org.pentaho.kettle.spring.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = { "logging.log4j.enabled" }, havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties({ Kettle8Properties.class })
public class Kettle8AutoConfiguration {

}
