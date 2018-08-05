package store.wecloud.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
@ConditionalOnClass(Service.class)
@ConditionalOnProperty(prefix = "store.wecloud.service", value = "enable", matchIfMissing = true)
public class ServiceAutoConfiguration {
    @Autowired
    ServiceProperties serviceProperties;

    @Bean
    @ConditionalOnMissingBean(Service.class)
    public Service service(){
        Service service = new Service();
        service.setAuthor(serviceProperties.getAuthor());
        return service;
    }
}
