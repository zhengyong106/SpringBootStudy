package store.wecloud.springboot.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "store.wecloud.service")
public class ServiceProperties {
    private String author = "administrator";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
